package api.automation;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import files.Playload;

public class DemoAPis {
	
	public static void main(String[] args) {
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		Response response = given().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body(Playload.addPlace())
		.when()
		.post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope",equalTo("APP")).extract().response();
		
		JsonPath js = response.jsonPath();
		String placeId = js.getString("place_id");
		
		System.out.println(placeId);
		
		//update place
		
		given().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+placeId+"\",\r\n"
				+ "\"address\":\"70 Summer walk, USA\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}")
		.when()
		.put("/maps/api/place/update/json")
		.then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
	    //Get place
		
		given().queryParam("key", "qaclick123").queryParam("place_id", placeId)
		.when()
		.get();	
	}
}
