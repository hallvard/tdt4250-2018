package no.hal.pg.runtime.tests;

import java.io.IOException;
import java.util.ArrayList;
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

import no.hal.pg.osm.GeoLocation;
import no.hal.pg.osm.OsmFactory;
import no.hal.pg.osm.geoutil.LatLong;
import no.hal.pg.runtime.AcceptTask;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.IsByGeoLocationCondition;
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
		Assert.assertTrue(task instanceof AcceptTask);
		testStart(task);
		((AcceptTask) task).reset();
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
	public void testAcceptTask() {
		AcceptTask task = RuntimeFactory.eINSTANCE.createAcceptTask();
		Assert.assertFalse(task.isStarted());
		Assert.assertFalse(task.isFinished());
		Assert.assertTrue(task.canStart());
		
		task.start();
		task.accept();

		Assert.assertTrue(task.isFinished());
		Assert.assertTrue(task.getResult());
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

		condition.setLowerTargetDistanceBound(distance);
		condition.setUpperTargetDistanceBound(distance + 1);
		Assert.assertTrue(condition.test());

		condition.setLowerTargetDistanceBound(distance);
		condition.setUpperTargetDistanceBound(distance - 1);
		Assert.assertFalse(condition.test());
	}
}
