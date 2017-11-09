package no.hal.pg.config.actions;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.window.Window;

import no.hal.pg.config.GameConfig;
import no.hal.pg.config.util.ConfigUtil;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.RuntimeFactory;
import no.hal.pg.runtime.Task;

public class CreateGameToolbarAction extends ConfigToolbarAction {

	@Override
	public Action getAction(final Object currentObject, final ISelectionProvider selectionProvider) {
		return new ConfigAction(selectionProvider) {
			{
				setText("Create game");
			}
			@Override
			public void run(GameConfig gameConfig) {
				InputDialog inputDialog = new InputDialog(null, "Player count", "Enter the number of players", "3", new IInputValidator() {
					@Override
					public String isValid(String newText) {
						try {
							Integer.valueOf(newText);
							return null;
						} catch (NumberFormatException e) {
							return e.getMessage();
						}
					}
				});
				if (inputDialog.open() == Window.OK) {
					int playerCount = Integer.valueOf(inputDialog.getValue());
					Collection<Player> players = new ArrayList<>(playerCount);
					for (int i = 0; i < playerCount; i++) {
						Player player = RuntimeFactory.eINSTANCE.createPlayer();
						player.setNickname("p" + (i + 1));
						players.add(player);
					}
					Game<Task<?>> game = ConfigUtil.createGame(gameConfig, players);
				}
				System.out.println(gameConfig);
			}
		};
	}
}
