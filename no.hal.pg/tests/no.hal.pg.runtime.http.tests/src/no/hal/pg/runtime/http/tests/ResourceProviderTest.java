package no.hal.pg.runtime.http.tests;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ResourceProviderTest extends AbstractHttpRequestTest {

	@Override
	protected String getGameName() {
		return "RuntimeTest";
	}

	@Before
	public void setUp() throws Exception {
		setUp(null, "org.osgi.service.http.port", true);
	}

	@Test
	public void testRequests() throws IOException {
		int attemptsLeft = 5;
		while (attemptsLeft > 0) {
			HttpURLConnection con1 = getRequest("/games/0");
			try {
				attemptsLeft--;
				testGame(con1);
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
		testExampleTask(getRequest("/games/0/tasks/0"));
		testExampleTaskStart(getRequest("/games/0/tasks/0/start"));
		testExampleTaskAnswer(getRequest("/games/0/tasks/0/answer?proposal=true"));
		testExampleTaskFinished(getRequest("/games/0/tasks/0"));
	}

	private boolean useOwnReader = true;
	
	protected void testGame(HttpURLConnection con) throws IOException {
		InputStream input = con.getInputStream();
		JsonNode jsonNode = getJsonNode(con);
//	   	System.out.println(mapper.writeValueAsString(jsonNode));
		ArrayNode rootNode = checkArrayNode(jsonNode, 1);
		ObjectNode gameNode = checkObjectNode(rootNode.get(0)); // empty lists don't serialize: "players", "items"
		checkArrayNode(gameNode.get("tasks"), 5);
	}

	protected void testExampleTask(HttpURLConnection con) throws IOException {
		JsonNode jsonNode = getJsonNode(con);
//		System.out.println(mapper.writeValueAsString(jsonNode));
		ArrayNode rootNode = checkArrayNode(jsonNode, 1);
		checkObjectNode(rootNode.get(0)); // empty lists don't serialize: "startConditions", "finishConditions"
	}
	
	protected void testExampleTaskStart(HttpURLConnection con) throws IOException {
		JsonNode jsonNode = getJsonNode(con);
//		System.out.println(mapper.writeValueAsString(jsonNode));
		// void method
		Assert.assertEquals("null", new ObjectMapper().writeValueAsString(jsonNode));
	}
	
	protected void testExampleTaskAnswer(HttpURLConnection con) throws IOException {
		JsonNode jsonNode = getJsonNode(con);
//		System.out.println(mapper.writeValueAsString(jsonNode));
		// void method
		Assert.assertEquals("null", new ObjectMapper().writeValueAsString(jsonNode));
	}

	protected void testExampleTaskFinished(HttpURLConnection con) throws IOException {
		JsonNode jsonNode = getJsonNode(con);
//		System.out.println(mapper.writeValueAsString(jsonNode));
		ArrayNode rootNode = checkArrayNode(jsonNode, 1);
		checkObjectNode(rootNode.get(0), "result", true);
	}

	//
	
	@Override
	protected ArrayNode checkArrayNode(JsonNode node, int size) {
		Assert.assertTrue(node instanceof ArrayNode);
		ArrayNode arrayNode = (ArrayNode) node;
		Assert.assertEquals(size, arrayNode.size());
		return arrayNode;
	}
	
	@Override
	protected ObjectNode checkObjectNode(JsonNode node, String... fields) {
		Assert.assertTrue(node instanceof ObjectNode);
		ObjectNode objectNode = (ObjectNode) node;
		for (int i = 0; i < fields.length; i++) {
			Assert.assertNotNull("Missing field: " + fields[i], objectNode.get(fields[i]));
		}
		return (ObjectNode) node;
	}

	@Override
	protected ObjectNode checkObjectNode(JsonNode node, Object... fieldsAndValues) {
		Assert.assertTrue(node instanceof ObjectNode);
		ObjectNode objectNode = (ObjectNode) node;
		ObjectMapper mapper = new ObjectMapper();
		for (int i = 0; i < fieldsAndValues.length; i += 2) {
			JsonNode value = objectNode.get(String.valueOf(fieldsAndValues[i]));
			Assert.assertNotNull("Missing value: " + fieldsAndValues[i], value);
			try {
				Assert.assertEquals(String.valueOf(fieldsAndValues[i + 1]), mapper.writeValueAsString(value));
			} catch (JsonProcessingException e) {
				Assert.fail(e.getMessage());
			}
		}
		return (ObjectNode) node;
	}
	
	/*
[ {
  "players" : [ ],
  "items" : [ ],
  "tasks" : [ {
    "players" : [ ],
    "startConditions" : [ ],
    "finishConditions" : [ ],
    "rewards" : [ ]
  }, {
    "players" : [ ],
    "startConditions" : [ {
      "context" : {
        "players" : [ ],
        "startConditions" : [ ],
        "finishConditions" : [ ],
        "rewards" : [ ]
      }
    } ],
    "finishConditions" : [ ],
    "rewards" : [ ]
  }, {
    "players" : [ ],
    "startConditions" : [ {
      "context" : {
        "players" : [ ],
        "startConditions" : [ ],
        "finishConditions" : [ ],
        "rewards" : [ ]
      }
    } ],
    "finishConditions" : [ ],
    "rewards" : [ ]
  }, {
    "players" : [ ],
    "startConditions" : [ {
      "logic" : false,
      "predicates" : [ {
        "context" : {
          "players" : [ ],
          "startConditions" : [ ],
          "finishConditions" : [ ],
          "rewards" : [ ]
        }
      }, {
        "context" : {
          "players" : [ ],
          "startConditions" : [ ],
          "finishConditions" : [ ],
          "rewards" : [ ]
        }
      } ]
    } ],
    "finishConditions" : [ ],
    "rewards" : [ ]
  }, {
    "players" : [ ],
    "startConditions" : [ {
      "logic" : true,
      "predicates" : [ {
        "context" : {
          "players" : [ ],
          "startConditions" : [ ],
          "finishConditions" : [ ],
          "rewards" : [ ]
        }
      }, {
        "context" : {
          "players" : [ ],
          "startConditions" : [ ],
          "finishConditions" : [ ],
          "rewards" : [ ]
        }
      } ]
    } ],
    "finishConditions" : [ ],
    "rewards" : [ ]
  } ]
} ]
	 */
}
