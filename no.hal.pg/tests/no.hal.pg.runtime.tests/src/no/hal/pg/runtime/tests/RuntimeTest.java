package no.hal.pg.runtime.tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import no.hal.pg.exampletask.runtime.ExampleTask;
import no.hal.pg.osm.GeoLocation;
import no.hal.pg.osm.OsmFactory;
import no.hal.pg.osm.geoutil.LatLong;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.GiveTaskPlayersItemsAction;
import no.hal.pg.runtime.InfoItem;
import no.hal.pg.runtime.IsByGeoLocationCondition;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.PlayersHaveItemsCondition;
import no.hal.pg.runtime.RuntimeFactory;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.Task;

public class RuntimeTest {

	private URI uri;

	@Before
	public void setUp() {
		uri = URI.createURI(getClass().getResource("RuntimeTest.xmi").toString());
	}

	protected Collection<EObject> loadRootObjects() {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(RuntimePackage.eNS_URI, RuntimePackage.eINSTANCE);
		Resource resource = resourceSet.createResource(uri);
		try {
			resource.load(null);
			return resource.getContents();
		} catch (IOException e) {
			Assert.fail();
		}
		return null;
	}
	
	@Test
	public void testLoad() {
		loadRootObjects();
	}

	public List<Task<?>> getTasks(int... taskNums) {
		Collection<? extends Object> rootObjects = loadRootObjects();
		no.hal.pg.runtime.Runtime runtime = (no.hal.pg.runtime.Runtime) EcoreUtil.getObjectByType(rootObjects, RuntimePackage.eINSTANCE.getRuntime());
		Assert.assertFalse(runtime.getGames().isEmpty());
		Game<?> game = runtime.getGames().get(0);
		List<Task<?>> tasks = new ArrayList<>(taskNums.length);
		for (int i = 0; i < taskNums.length; i++) {
			Assert.assertTrue(game.getTasks().size() > taskNums[i]);
			tasks.add(game.getTasks().get(taskNums[i]));
		}
		return tasks;
	}
	
	protected void testStart(Task<?> task) {
		Assert.assertFalse(task.isStarted());
		task.start();
		Assert.assertTrue(task.isStarted());
	}
	@Test
	public void testStart() {
		testStart(getTasks(0).get(0));
	}

	@Test
	public void testReset() {
		Task<?> task = getTasks(0).get(0);
		Assert.assertTrue(task instanceof ExampleTask);
		testStart(task);
		((ExampleTask) task).reset();
		Assert.assertFalse(task.isStarted());
	}

	@Test
	public void testIsStartedCondition() {
		List<Task<?>> tasks = getTasks(0, 1);
		Task<?> task0 = tasks.get(0), task = tasks.get(1);
		Assert.assertFalse(task0.isStarted());
		Assert.assertFalse(task.canStart());

		task0.start();
		Assert.assertTrue(task.canStart());
	}
	
	@Test
	public void testIsFinishedCondition() {
		List<Task<?>> tasks = getTasks(0, 2);
		Task task0 = tasks.get(0), task = tasks.get(1);
		task0.start();
		Assert.assertFalse(task0.isFinished());
		Assert.assertFalse(task.canStart());

		task0.finish(Boolean.TRUE);
		Assert.assertTrue(task.canStart());
	}

	@Test
	public void testCompositeAnd() {
		List<Task<?>> tasks = getTasks(0, 3);
		Task task0 = tasks.get(0), task = tasks.get(1);
		Assert.assertFalse(task0.isStarted());
		Assert.assertFalse(task0.isFinished());
		Assert.assertFalse(task.canStart());
	
		task0.start();
		Assert.assertFalse(task.canStart());

		task0.finish(Boolean.TRUE);
		Assert.assertTrue(task.canStart());
	}
	
	@Test
	public void testCompositeOr() {
		List<Task<?>> tasks = getTasks(0, 4);
		Task<?> task0 = tasks.get(0), task = tasks.get(1);
		Assert.assertFalse(task0.isStarted());
		Assert.assertFalse(task0.isFinished());
		Assert.assertFalse(task.canStart());
		
		task0.start();
		Assert.assertTrue(task.canStart());
	}
	
	@Test
	public void testIsByLocationCondition() {
		GeoLocation loc1 = OsmFactory.eINSTANCE.createGeoLocation(), loc2 = OsmFactory.eINSTANCE.createGeoLocation();
		IsByGeoLocationCondition condition = RuntimeFactory.eINSTANCE.createIsByGeoLocationCondition();
		condition.setContext(loc1);
		condition.getLocations().add(loc2);
		double distance = 0.0;
		while (distance <= 10.0) {
			loc1.setLatitude((float) (Math.random() * 90));
			loc1.setLongitude((float) (Math.random() * 90));
			loc2.setLatitude((float) (Math.random() * 90));
			loc2.setLongitude((float) (Math.random() * 90));
			distance = LatLong.distance(loc1, loc2);
		}
		condition.setLowerTargetDistanceBound(distance + 1);
		condition.setUpperTargetDistanceBound(distance + 1);
		Assert.assertFalse(condition.test());
		Assert.assertFalse(condition.test(loc1));

		condition.setLowerTargetDistanceBound(distance);
		condition.setUpperTargetDistanceBound(distance + 1);
		Assert.assertTrue(condition.test());
		Assert.assertTrue(condition.test(loc1));

		condition.setLowerTargetDistanceBound(distance);
		condition.setUpperTargetDistanceBound(distance - 1);
		Assert.assertFalse(condition.test());
		Assert.assertFalse(condition.test(loc1));
	}
	
	@Test
	public void testPlayersHaveItemsCondition() {
		Task<?> task = RuntimeFactory.eINSTANCE.createTask();
		Player player1 = RuntimeFactory.eINSTANCE.createPlayer();
		task.getPlayers().add(player1);
		PlayersHaveItemsCondition condition = RuntimeFactory.eINSTANCE.createPlayersHaveItemsCondition();
		condition.setContext(task);
		condition.getItemClasses().add(RuntimePackage.eINSTANCE.getInfoItem());

		// an InfoItem is required, but not present
		Assert.assertFalse(condition.test());
		Assert.assertFalse(condition.test(task));

		player1.getItems().add(RuntimeFactory.eINSTANCE.createInfoItem());
		// an InfoItem is now present
		Assert.assertTrue(condition.test());
		Assert.assertTrue(condition.test(task));

		condition.getItemClasses().add(RuntimePackage.eINSTANCE.getItem());
		// another InfoItem is required, but not present
		Assert.assertFalse(condition.test());
		Assert.assertFalse(condition.test(task));

		Player player2 = RuntimeFactory.eINSTANCE.createPlayer();
		task.getPlayers().add(player2);
		player2.getItems().add(RuntimeFactory.eINSTANCE.createInfoItem());
		// both InfoItems are now present
		Assert.assertTrue(condition.test());
		Assert.assertTrue(condition.test(task));
	}
	
	@Test
	public void testGiveTaskPlayersItemsAction() {
		Task<Object> task = RuntimeFactory.eINSTANCE.createTask();
		Player player1 = RuntimeFactory.eINSTANCE.createPlayer(),  player2 = RuntimeFactory.eINSTANCE.createPlayer();
		task.getPlayers().addAll(Arrays.asList(player1, player2));
		InfoItem item1 = RuntimeFactory.eINSTANCE.createInfoItem(), item2 = RuntimeFactory.eINSTANCE.createInfoItem(), item3 = RuntimeFactory.eINSTANCE.createInfoItem();
		item1.setDescription("1");
		item2.setDescription("2");
		item3.setDescription("3");

		GiveTaskPlayersItemsAction action1 = RuntimeFactory.eINSTANCE.createGiveTaskPlayersItemsAction();
		action1.getItems().addAll(Arrays.asList(item1, item2));
		action1.setCopy(true);
		task.getStartActions().add(action1);

		GiveTaskPlayersItemsAction action2 = RuntimeFactory.eINSTANCE.createGiveTaskPlayersItemsAction();
		action2.getItems().addAll(Arrays.asList(item3));
		action2.setCopy(true);
		task.getFinishActions().add(action2);

		Assert.assertEquals(0, player1.getItems().size());
		Assert.assertEquals(0, player2.getItems().size());
		task.start();
		// copies of item1 and item2 added to player1 and player2
		Assert.assertEquals(2, player1.getItems().size());
		InfoItem infoItem11 = (InfoItem) player1.getItems().get(0), infoItem12 = (InfoItem) player1.getItems().get(1);
		Assert.assertFalse(infoItem11 == item1);
		Assert.assertEquals(infoItem11.getDescription(), item1.getDescription());
		Assert.assertFalse(infoItem12 == item2);
		Assert.assertEquals(infoItem12.getDescription(), item2.getDescription());

		Assert.assertEquals(2, player2.getItems().size());
		InfoItem infoItem21 = (InfoItem) player2.getItems().get(0), infoItem22 = (InfoItem) player2.getItems().get(1);
		Assert.assertFalse(infoItem21 == item1);
		Assert.assertEquals(infoItem21.getDescription(), item1.getDescription());
		Assert.assertFalse(infoItem22 == item2);
		Assert.assertEquals(infoItem22.getDescription(), item2.getDescription());

		task.start();
		// no change, since already started
		Assert.assertEquals(2, player1.getItems().size());
		Assert.assertSame(infoItem11, player1.getItems().get(0));
		Assert.assertSame(infoItem12, player1.getItems().get(1));
		
		task.finish(new Object());
		// first items are the same
		Assert.assertSame(infoItem11, player1.getItems().get(0));
		Assert.assertSame(infoItem12, player1.getItems().get(1));
		// copy of item3
		Assert.assertEquals(3, player1.getItems().size());
		InfoItem infoItem13 = (InfoItem) player1.getItems().get(2);
		Assert.assertFalse(infoItem13 == item3);
		Assert.assertEquals(infoItem13.getDescription(), item3.getDescription());

		Assert.assertEquals(3, player2.getItems().size());
		InfoItem infoItem23 = (InfoItem) player2.getItems().get(2);
		Assert.assertFalse(infoItem23 == item3);
		Assert.assertEquals(infoItem23.getDescription(), item3.getDescription());
	}
}
