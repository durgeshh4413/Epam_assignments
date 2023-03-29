package HomeTask_RestFunctional;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import java.util.Map;

public class Reusable_Endpoints {
	public static <T> Response postRequest(String basUri, Map<String, String> headerMap, T entity, String route) {
		RestAssured.reset();
		RestAssured.baseURI = basUri;
		Response response = given().headers(headerMap).and().body(entity).when().post(route).then().log().all()
				.extract().response();
		return response;
	}
	
	public static Response getRequest(String basUri, Map<String, String> headerMap, String route) {
		RestAssured.baseURI = basUri;
		Response response = given().headers(headerMap).and().body("").when().get(route).then().log().all().extract()
				.response();
		return response;
	}
	
	public static Response deleteRequest(String basUri, Map<String, String> headerMap, String route) {
		RestAssured.reset();
		RestAssured.baseURI = basUri;

		Response response = given().headers(headerMap).and().body("").when().delete(route).then().log().all().extract()
				.response();
		return response;
	}
	
	public static <T> Response putRequest(String basUri, Map<String, String> headerMap, T entity, String route) {
		RestAssured.baseURI = basUri;
		Response response = given().headers(headerMap).and().body(entity).when().put(route).then().log().all().extract()
				.response();
		return response;
	}

	
}
