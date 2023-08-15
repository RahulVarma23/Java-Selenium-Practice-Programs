package demo1;

import org.json.simple.JSONObject;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import  io.restassured.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POSTAPI {
	
	
	
public static void main(String[] args) {
	JSONObject params = new JSONObject();
	params.put("name", "morpheus");
	params.put("job", "leader");

	
	RequestSpecification request = RestAssured.given();
	request.body(params.toJSONString());

//	Response response = request.post("https://reqres.in/api/users");
//
//	System.out.println(response.getStatusCode());
//	JsonPath path = response.jsonPath();
//
//	String name = path.getString("name");
//	
//	Assert.assertEquals(name, "morpheus","actual name  is not matching with expected");
//
//	System.out.println(name);
//
//	String jobTitle = path.getString("job");
//
//	System.out.println(jobTitle);		
//	
//	Assert.assertEquals(jobTitle, "leader","actual job title is not matching with expected");
	
	
	
} 
}
