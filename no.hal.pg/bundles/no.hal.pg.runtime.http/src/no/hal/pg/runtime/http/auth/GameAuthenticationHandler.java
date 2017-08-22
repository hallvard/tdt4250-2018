package no.hal.pg.runtime.http.auth;

import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Component;

import no.hal.pg.arc.Person;
import no.hal.pg.http.auth.AuthenticationHandler;
import no.hal.pg.http.auth.ISubjectProvider;
import no.hal.pg.http.auth.UnauthorizedException;
import no.hal.pg.http.auth.util.AbstractHttpAuthenticationHandler;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.RuntimePackage;

@Component(immediate=true)
public class GameAuthenticationHandler extends AbstractHttpAuthenticationHandler<Person> implements ISubjectProvider<Person>, AuthenticationHandler<Person> {

	@Override
	public boolean acceptsContext(EObject context) {
		return context != null && context.eClass().getEPackage() == RuntimePackage.eINSTANCE;
	}
	
	@Override
	protected Person getSubject(String id, String cred, EObject context) {
		while (context != null) {
			if (context instanceof Game) {
				return getSubject((Game<?>) context, id, cred);
			}
			context = context.eContainer();
		}
		return null;
	}

	protected Person getSubject(Game<?> game, String id, String cred) {
		for (Player player : game.getPlayers()) {
			Person person = player.getPerson();
			if (checkCredentials(person, id, cred)) {
				return person;
			}
		}
		throw new UnauthorizedException(id + " is not a player in this game", null);
	}

	protected boolean checkCredentials(Person person, String id, String cred) {
		for (String pid : person.getIds()) {
			if (pid.equals(id) && checkPassword(id, cred)) {
				return true;
			}
		}
		return false;
	}

	protected boolean checkPassword(String id, String cred) {
		String pass = "";
		char lastChar = '\0';
		for (int i = 0; i < id.length(); i++) {
			char c = id.charAt(i);
			if (Character.isLetter(c) && (! Character.isLetter(lastChar))) {
				pass += c;
			}
			lastChar = c;
		}
		return pass.equals(cred);
	}
}
