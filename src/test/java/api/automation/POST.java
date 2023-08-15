package api.automation;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class POST {

	@Test
	public void postRequest() {
		
		RestAssured.baseURI="https://reqres.in/";
		
		JSONObject params = new JSONObject();
		params.put("name", "morpheus");
		params.put("job", "leader");
		
		Response reponse =
		given().accept(ContentType.JSON)
		.body(params.toJSONString())
		.when()
		.post("api/users")
		.then().log().all()
		.assertThat().statusCode(201)
		.extract().response();	
		JsonPath path= reponse.jsonPath();
		String id = path.getString("id");
		
		Assert.assertTrue(id.matches("[0-9]+"));
	}
}
