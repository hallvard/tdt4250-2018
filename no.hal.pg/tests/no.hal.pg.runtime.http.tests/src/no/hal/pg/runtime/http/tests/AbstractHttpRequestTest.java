package no.hal.pg.runtime.http.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import org.junit.Assert;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public abstract class AbstractHttpRequestTest {

	protected String baseUrlString = null, urlString = null;

	protected void setUp(String hostProperty, String portProperty, boolean externalSetupGame) throws Exception {
		String host = "localhost", port = "8082";
		if (hostProperty != null) {
			host = System.getProperty(hostProperty);
		}
		if (portProperty != null) {
			port = System.getProperty(portProperty);
		}
		if (host != null && port != null) {
			baseUrlString = "http://" + host + ":" + port;
			urlString = baseUrlString + "/data/" + getGameName() + "/games/0";
		}
	}

	protected abstract String getGameName();

	protected String readLines(InputStream input) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		StringBuilder buffer = new StringBuilder();
		String line = null;
		while ((line = reader.readLine()) != null) {
			buffer.append(line);
			buffer.append("\n");
		}
		return buffer.toString();
	}

	protected void addAuthorization(HttpURLConnection con) {
		con.addRequestProperty("Authorization", "Basic aGFsQGlkaS5udG51Lm5vOmhpbm4="); // hal@idi.ntnu.no:hinn base64 encoded
	}

	protected HttpURLConnection getRequest(String urlPath) throws IOException {
		HttpURLConnection con = (HttpURLConnection) new URL(urlString + urlPath).openConnection();
		con.setRequestMethod("GET");
		addAuthorization(con);
		return con;
	}
	
	protected HttpURLConnection postRequest(String urlPath, String contentType, String body) throws IOException {
		HttpURLConnection con = (HttpURLConnection) new URL(urlString + urlPath).openConnection();
		con.setRequestMethod("POST");
		con.setDoOutput(true);
		Charset utf8 = StandardCharsets.UTF_8;
		con.setRequestProperty("Content-Type", contentType + "; charset=" + utf8.name()); 
		con.setRequestProperty("charset", utf8.name());
		byte[] postData = body.getBytes(utf8);
		con.setRequestProperty( "Content-Length", Integer.toString(postData.length));
		con.setUseCaches(false);
		addAuthorization(con);
		OutputStream output = con.getOutputStream();
		output.write(postData);
		output.flush();
		return con;
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
}
