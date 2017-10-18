package no.hal.pg.runtime.http.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ResourceProviderQlTest extends AbstractHttpRequestTest {

	@Override
	protected String getGameName() {
		return "RuntimeQlTest";
	}

	@Before
	public void setUp() throws Exception {
		setUp(null, "org.osgi.service.http.port", true);
	}

	@Test
	public void testRequests() throws IOException {
		int attemptsLeft = 5;
		while (attemptsLeft > 0) {
			HttpURLConnection con = getRequest("/games/0");
			try {
				attemptsLeft--;
				testGame(con);
				break;
			} catch (Exception e) {
				if (attemptsLeft <= 0) {
					Assert.fail(e.getMessage() + " for " + urlString);
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException ignore) {
				}
			}
		}
		testAcceptTask(postRequest("/games/0/tasks", "application/graphql", "query { canStart isStarted isFinished }"));
		testAcceptTaskStart(postRequest("/games/0/tasks/0", "application/graphql", "mutation { start { isStarted isFinished }}"));
		testAcceptTaskAccept(postRequest("/games/0/tasks/0", "application/graphql", "mutation { accept { isStarted isFinished }}"));
	}

	protected void testIgnore(HttpURLConnection con) throws IOException {
		JsonNode jsonNode = getJsonNode(con);
	}

	protected void testGame(HttpURLConnection con) throws IOException {
		JsonNode jsonNode = getJsonNode(con);
	   	System.out.println(new ObjectMapper().writeValueAsString(jsonNode));
		ArrayNode rootNode = checkArrayNode(jsonNode, 1);
		ObjectNode gameNode = checkObjectNode(rootNode.get(0)); // empty lists don't serialize: "players", "items"
		checkArrayNode(gameNode.get("tasks"), 5);
	}

	protected void testAcceptTask(HttpURLConnection con) throws IOException {
		JsonNode jsonNode = getJsonNode(con);
//		System.out.println(mapper.writeValueAsString(jsonNode));
		checkObjectNode(jsonNode, "canStart", true, "isStarted", false, "isFinished", false);
	}

	protected void testAcceptTaskStart(HttpURLConnection con) throws IOException {
		JsonNode jsonNode = getJsonNode(con);
//		System.out.println(mapper.writeValueAsString(jsonNode));
		checkObjectNode(jsonNode, "start");
		checkObjectNode(((ObjectNode) jsonNode).get("start"), "isStarted", true, "isFinished", false);
	}
	
	protected void testAcceptTaskAccept(HttpURLConnection con) throws IOException {
		JsonNode jsonNode = getJsonNode(con);
//		System.out.println(mapper.writeValueAsString(jsonNode));
		checkObjectNode(jsonNode, "accept");
		checkObjectNode(((ObjectNode) jsonNode).get("accept"), "isStarted", true, "isFinished", true);
	}
}
