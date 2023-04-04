package HomeTask_RestFunctional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.core.util.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import Logs.LoggerDemo;
import io.restassured.http.Header;
import io.restassured.response.Response;
import pojoRequest.CreateResource;

public class HomeTaskRestFunctionalTest1 {
	Map<String,String> headerMap=new HashMap<String,String>();
	Response response;
	String id;
	SoftAssert softAssert=new SoftAssert();
	final String BASEURI="https://jsonplaceholder.typicode.com";
	HomeTaskRestFunctionalTest1(){
		headerMap.put("Content-type", "application/json; charset=UTF-8");
	}
	
	@Test
	public void SendGetRequestToFetchResource() {
		int count = 0;
		List<String> resourceList=new ArrayList<String>();
		resourceList.add("/posts");
		resourceList.add("/comments");
		resourceList.add("/albums");
		resourceList.add("/photos");
		resourceList.add("/todos");
		resourceList.add("/users");
		
		for(String str: resourceList) {
			 response =Reusable_Endpoints.getRequest(BASEURI, headerMap, str);			
			count=response.jsonPath().getList("userId").size();
			LoggerDemo.getLogger().info("Resource is : "+str+" Count of resources :"+count);
	
		}
		
		
	}
	
	@Test(priority=0)
	public void createResource() throws JsonProcessingException {
		CreateResource createResource=new CreateResource("foo","bar","4");
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json = ow.writeValueAsString(createResource);
		LoggerDemo.getLogger().info(json);
		response=Reusable_Endpoints.postRequest(BASEURI, headerMap, createResource, "/posts");
		LoggerDemo.getLogger().info(response.asString());
		softAssert.assertEquals(response.getStatusCode(), 201,"Response code is not matching");
		softAssert.assertAll();
		id=response.jsonPath().getString("userId");
	}
	
	
	@Test(priority=1)
	public void getResource() throws JsonProcessingException {
		String route="/posts/"+id;
		response=Reusable_Endpoints.getRequest(BASEURI, headerMap,route);
		LoggerDemo.getLogger().info(response.asString());
		int id1=Integer.parseInt(id);
		softAssert.assertEquals(response.getStatusCode(), 200,"Response code is not matching");
		softAssert.assertEquals(response.jsonPath().get("id"),id1 );
		softAssert.assertAll();
	}
	
	@Test(priority=2)
	public void updateResource() throws JsonProcessingException {
		String route="/posts/"+id;	
		CreateResource createResource=new CreateResource("foo","bar","8");
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json = ow.writeValueAsString(createResource);
		LoggerDemo.getLogger().info(json);
		response=Reusable_Endpoints.putRequest(BASEURI, headerMap,createResource,route);
		LoggerDemo.getLogger().info(response.asString());
		softAssert.assertEquals(response.getStatusCode(), 200,"Response code is not matching");
		softAssert.assertAll();
		id=response.jsonPath().getString("userId");
	}
	
	@Test(priority=3)
	public void deleteResource() throws JsonProcessingException {
		String route="/posts/"+id;
		response=Reusable_Endpoints.deleteRequest(BASEURI, headerMap,route);
		LoggerDemo.getLogger().info(response.asString());
		softAssert.assertEquals(response.getStatusCode(), 200,"Response code is not matching");
		softAssert.assertAll();
		response=Reusable_Endpoints.getRequest(BASEURI, headerMap,route);
		softAssert.assertEquals(response.getStatusCode(), 404,"Resorce not deleted successfully");
		softAssert.assertAll();
	}
	
}
