import org.junit.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import io.restassured.matcher.RestAssuredMatchers.*; 
import org.hamcrest.Matchers.*;

public class apiRestAssuredTest {
	
	@Test
	void apitest()
	{
		Response res = get("https://api.spacexdata.com/v4/launches/latest");
		System.out.println(res.asString());
		System.out.println(res.getBody().asString());
		System.out.println(res.getStatusCode());
		System.out.println(res.getHeader("content-type"));
		System.out.println(res.getTime());
		
		int statusCode = res.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
	
	@Test
	void apitest2()
	{
		given().get("https://api.spacexdata.com/v4/launches/latest")
		.then().statusCode(200);
	}
}
