package no.hal.pg.runtime.tests;

import java.io.IOException;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import no.hal.pg.app.App;
import no.hal.pg.app.AppFactory;
import no.hal.pg.app.AppPackage;
import no.hal.pg.app.GameView;
import no.hal.pg.app.TaskView;
import no.hal.pg.app.util.ViewFactoryUtil;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.RuntimeFactory;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.Task;

public class AppTest {

	private URI uri;

	@Before
	public void setUp() {
		uri = URI.createURI(getClass().getResource("AppTest.xmi").toString());
	}

	protected Collection<EObject> loadRootObjects() {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(RuntimePackage.eNS_URI, RuntimePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(AppPackage.eNS_URI, AppPackage.eINSTANCE);
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

	@Test
	public void testGetUser() {
		GameView<Task<?>> gameView = AppFactory.eINSTANCE.createGameView();
		Player player = RuntimeFactory.eINSTANCE.createPlayer();
		Assert.assertNull(gameView.getUser());

		gameView.setPlayer(player);
		Assert.assertEquals(player, gameView.getUser());
		
		TaskView<Task<?>> taskView = AppFactory.eINSTANCE.createTaskView();
		Assert.assertNull(taskView.getUser());
		
		gameView.getTaskViews().add(taskView);
		Assert.assertEquals(player, taskView.getUser());
	}
	
	@Test
	public void testCreateApp() {
		Collection<EObject> rootObjects = loadRootObjects();
		Assert.assertTrue(rootObjects.iterator().hasNext());
		Assert.assertTrue(rootObjects.iterator().next() instanceof GameView<?>);
		Game<Task<?>> game = ((GameView<Task<?>>) rootObjects.iterator().next()).getModel();
		App app = ViewFactoryUtil.createApp(game);
		Assert.assertEquals(game, app.getGame());
		Assert.assertEquals(game.getPlayers().size(), app.getGameViews().size());
		outer: for (Player player : game.getPlayers()) {
			for (GameView<?> gameView : app.getGameViews()) {
				if (gameView.getUser() == player) {
					Assert.assertEquals(game, gameView.getModel());
					Assert.assertEquals(game.getTasks().size(), gameView.getTaskViews().size());
					for (TaskView<?> taskView : gameView.getTaskViews()) {
						Assert.assertTrue(game.getTasks().contains(taskView.getModel()));
						Assert.assertTrue(taskView.getModel().getPlayers().contains(player));
					}
					continue outer;
				}
			}
			Assert.fail();
		}
	}
}
