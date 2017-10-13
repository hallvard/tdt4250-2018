package no.hal.pg.runtime.http.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
			HttpURLConnection con1 = getRequest("");
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
		testAcceptTask(getRequest("/tasks/0"));
		testAcceptTaskStart(getRequest("/tasks/0/start"));
		testAcceptTaskAccept(getRequest("/tasks/0/accept"));
		testAcceptTaskFinished(getRequest("/tasks/0"));
		
//		HttpURLConnection con2 = (HttpURLConnection) new URL(urlString).openConnection();
//		con2.setRequestMethod("POST");
//		addAuthorization(con2);
//		con2.setDoOutput(true);
//		Charset utf8 = StandardCharsets.UTF_8;
//		con2.setRequestProperty("Content-Type", "application/json; charset=" + utf8.name()); 
//		con2.setRequestProperty("charset", utf8.name());
//		JsonNodeFactory jsonFactory = new JsonNodeFactory(false);
//		ObjectNode parameters = jsonFactory.objectNode();
//		// moves away from one item (they are at cafe."SiT Kafe Hangaren" and artwork.Integrasjon), to auditorium F3
//		parameters.set("lat", jsonFactory.numberNode(63.4171782));
//		parameters.set("lon", jsonFactory.numberNode(10.4029398));
//		ObjectMapper mapper = new ObjectMapper();
//		byte[] postData = mapper.writeValueAsString(parameters).getBytes(utf8);
//		con2.setRequestProperty( "Content-Length", Integer.toString(postData.length));
//		con2.setUseCaches(false);
//		OutputStream output = con2.getOutputStream();
//		output.write(postData);
//		output.flush();
//		testGame(con2);
	}

	private boolean useOwnReader = true;
	
	protected void testGame(HttpURLConnection con) throws IOException {
		InputStream input = con.getInputStream();
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonNode = (useOwnReader ? mapper.readTree(new BufferedReader(new InputStreamReader(input))) : mapper.readTree(input));
//	   	System.out.println(mapper.writeValueAsString(jsonNode));
		ArrayNode rootNode = checkArrayNode(jsonNode, 1);
		ObjectNode gameNode = checkObjectNode(rootNode.get(0)); // empty lists don't serialize: "players", "items"
		checkArrayNode(gameNode.get("tasks"), 5);
	}

	protected void testAcceptTask(HttpURLConnection con) throws IOException {
		InputStream input = con.getInputStream();
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonNode = (useOwnReader ? mapper.readTree(new BufferedReader(new InputStreamReader(input))) : mapper.readTree(input));
//		System.out.println(mapper.writeValueAsString(jsonNode));
		ArrayNode rootNode = checkArrayNode(jsonNode, 1);
		checkObjectNode(rootNode.get(0)); // empty lists don't serialize: "startConditions", "finishConditions"
	}
	
	protected void testAcceptTaskStart(HttpURLConnection con) throws IOException {
		InputStream input = con.getInputStream();
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonNode = (useOwnReader ? mapper.readTree(new BufferedReader(new InputStreamReader(input))) : mapper.readTree(input));
//		System.out.println(mapper.writeValueAsString(jsonNode));
		// void method
		Assert.assertEquals("null", mapper.writeValueAsString(jsonNode));
	}
	
	protected void testAcceptTaskAccept(HttpURLConnection con) throws IOException {
		InputStream input = con.getInputStream();
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonNode = (useOwnReader ? mapper.readTree(new BufferedReader(new InputStreamReader(input))) : mapper.readTree(input));
//		System.out.println(mapper.writeValueAsString(jsonNode));
		// void method
		Assert.assertEquals("null", mapper.writeValueAsString(jsonNode));
	}

	protected void testAcceptTaskFinished(HttpURLConnection con) throws IOException {
		InputStream input = con.getInputStream();
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonNode = (useOwnReader ? mapper.readTree(new BufferedReader(new InputStreamReader(input))) : mapper.readTree(input));
//		System.out.println(mapper.writeValueAsString(jsonNode));
		ArrayNode rootNode = checkArrayNode(jsonNode, 1);
		checkObjectNode(rootNode.get(0), "result", true);
	}

	//
	
	protected ArrayNode checkArrayNode(JsonNode node, int size) {
		Assert.assertTrue(node instanceof ArrayNode);
		ArrayNode arrayNode = (ArrayNode) node;
		Assert.assertEquals(size, arrayNode.size());
		return arrayNode;
	}
	
	protected ObjectNode checkObjectNode(JsonNode node, String... fields) {
		Assert.assertTrue(node instanceof ObjectNode);
		ObjectNode objectNode = (ObjectNode) node;
		for (int i = 0; i < fields.length; i++) {
			Assert.assertNotNull("Missing field: " + fields[i], objectNode.get(fields[i]));
		}
		return (ObjectNode) node;
	}

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
