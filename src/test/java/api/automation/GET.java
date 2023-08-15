package api.automation;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GET {
	
	@Test
	public void getRequest() {	
		RestAssured.baseURI = "https://reqres.in/";
		given()		
		.when()
		.get("/api/users?page=2")
		.then().log().all()
		.assertThat().statusCode(200);
	}
}
