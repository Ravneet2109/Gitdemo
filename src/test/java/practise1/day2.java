package practise1;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class day2 {

	@Test
	public void test_1() {
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).log().all();
	}
	
	
	
}
