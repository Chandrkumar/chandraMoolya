package com.api.automation;

import static io.restassured.RestAssured.given;
import java.util.Random;
import io.restassured.RestAssured;

public class ApiUtilits {

	public static String getRequest(String baseURI, String endPoint){
		RestAssured.baseURI=baseURI;
		String res=given().header("Content-Type","application/json")
				.when().get(endPoint).then()
				.assertThat().statusCode(200).extract().response().asString();
		System.out.println(res);
		return res;
	}

	public static String postRequest(String baseURI, String endpoint, String requestBody){
	RestAssured.baseURI=baseURI;
	String res=given().header("Content-Type","application/json").body(requestBody)
			.when().post(endpoint).then()
			.assertThat().statusCode(201).extract().response().asString();
	System.out.println(res);
	return res;
	}
	 
	public static String putRequest(String baseURI, String endPoint, String requestBody) {
		RestAssured.baseURI=baseURI;
		String res= given().header("Content-type","application/json").body(requestBody)
				.when().put(endPoint).then()
				.assertThat().statusCode(200).extract().response().asString();
		System.out.println(res);
		return res;
	}
	
	public static String patchRequest(String baseURI, String endpoint, String requestBody){
		RestAssured.baseURI=baseURI;
		String res= given().header("Content-type","application/json").body(requestBody)
				.when().patch(endpoint).then()
				.assertThat().statusCode(200).extract().response().asString();
		System.out.println(res);
		return res;
	}
	
	public static String deleteRequest(String baseURI, String endpoint){
		RestAssured.baseURI=baseURI;
		String res = given().when().delete(endpoint).then()
		.assertThat().statusCode(204).extract().response().asString();
		return res;
	}
	
	public static String postRequestEmp(String baseURI, String endpoint, String requestBody){
		RestAssured.baseURI=baseURI;
		String res=given().header("Content-Type","application/json").body(requestBody)
				.when().post(endpoint).then()
				.assertThat().statusCode(200).extract().response().asString();
		System.out.println(res);
		return res;
	}
	
	public static String deleteRequestEmp(String baseURI, String endpoint){
		RestAssured.baseURI=baseURI;
		String res = given().when().delete(endpoint).then()
		.assertThat().statusCode(200).extract().response().asString();
		return res;
	}
	
	public static String generateRandomName() { 
    	Random randomGenerator = new Random();  
    	int randomInt = randomGenerator.nextInt(1000);  
    	return "username"+ randomInt; 
      } 
	
	public static String generateSalary() {
    	Random random = new Random();
    	int rand_int1= random.nextInt(1000000);
        return ""+rand_int1;
    }
	
	public static String generateAge() {
    	Random random = new Random();
    	int rand_int1= random.nextInt(100);
        return ""+rand_int1;
    }

}
