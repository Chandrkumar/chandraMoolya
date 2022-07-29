package com.api.automation;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.swiggy.GenericUtilis.getProperties;
import io.restassured.path.json.JsonPath;

public class ApiTestScriptTwo {
	
	@Test(enabled=true, priority=1)
	public void getUserDetails() throws IOException {
		String endPoint = getProperties.getProperty("getEndPoint");
		String getResponse = ApiUtilits.getRequest(getProperties.getProperty("baseURI"), endPoint);
		JsonPath jsonPath = new JsonPath(getResponse);
		
		Assert.assertTrue(jsonPath.getString("data.email").equalsIgnoreCase(getProperties.getProperty("email")));
		Assert.assertTrue(jsonPath.getString("data.first_name").equalsIgnoreCase(getProperties.getProperty("first_name")));
		Assert.assertTrue(jsonPath.getString("data.last_name").equalsIgnoreCase(getProperties.getProperty("last_name")));
	}
	
	@Test(enabled=true, priority=2)
	public void addNewUserDetails() throws IOException {
		String endPoint = getProperties.getProperty("postEndPoint");
		String name = ApiUtilits.generateRandomName();
		String job = getProperties.getProperty("postJob");
		String requestBody = "{\n" +
				"\"name\": \""+ name +"\",\n" +
				"\"job\": \""+ job +"\"\n" +
				"\n"+"}";
		String postResponse = ApiUtilits.postRequest(getProperties.getProperty("baseURI"), endPoint, requestBody);
		JsonPath jsonPath = new JsonPath(postResponse);
		
		Assert.assertEquals(jsonPath.getString("name"), name);
		Assert.assertEquals(jsonPath.getString("job"), job);
		Assert.assertNotNull(jsonPath.getString("id"));
		
	}
	
	@Test(enabled=true, priority=3)
	public void updateUserDetails() throws IOException {
		String endPoint = getProperties.getProperty("getEndPoint");
		String name = ApiUtilits.generateRandomName();
		String job = getProperties.getProperty("putJob");
		String requestBody = "{\n" +
				"\"name\": \""+ name +"\",\n" +
				"\"job\": \""+ job +"\"\n" +
				"\n"+"}";
		String postResponse = ApiUtilits.putRequest(getProperties.getProperty("baseURI"), endPoint, requestBody);
		JsonPath jsonPath = new JsonPath(postResponse);
		
		Assert.assertEquals(jsonPath.getString("name"), name);
		Assert.assertEquals(jsonPath.getString("job"), job);
	}
	
	@Test(enabled=true, priority=4)
	public void partialUpdateUserDetails() throws IOException {
		String endPoint = getProperties.getProperty("getEndPoint");
		String name = ApiUtilits.generateRandomName();
		String job = getProperties.getProperty("putJob");
		String requestBody = "{\n" +
				"\"name\": \""+ name +"\",\n" +
				"\"job\": \""+ job +"\"\n" +
				"\n"+"}";
		
		String patchResponse = ApiUtilits.patchRequest(getProperties.getProperty("baseURI"), endPoint, requestBody);
		JsonPath jsonPath = new JsonPath(patchResponse);
		Assert.assertEquals(jsonPath.getString("name"), name);
		Assert.assertEquals(jsonPath.getString("job"), job);
	}
}
