package StepDefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Pages;

public class APITestingTask {
	Pages pages;
	
	public APITestingTask(){
		pages=new Pages();
	}
	
	@Given("^Send get request to fetch resource and verify resource count$")
	public void send_get_request_to_fetch_resource_and_verify_resource_count() {
	   pages.homeTaskRestFunctionalTest().SendGetRequestToFetchResource();
	}

	@Given("^Send post request to create a resource$")
	public void send_post_request_to_create_a_resource() throws JsonProcessingException {
	    pages.homeTaskRestFunctionalTest().createResource();
	}


	@When("^Send get request to fetch resource information$")
	public void send_get_request_to_fetch_resource_information() throws JsonProcessingException {
	   pages.homeTaskRestFunctionalTest().getResource();
	}

	

	@When("^Send post request to update created resource$")
	public void send_post_request_to_update_created_resource() throws JsonProcessingException {
	    pages.homeTaskRestFunctionalTest().updateResource();
	}

	

	@Then("^Send get request to fetch resource information and verify resource is updated$")
	public void send_get_request_to_fetch_resource_information_and_verify_resource_is_updated() throws JsonProcessingException {
		pages.homeTaskRestFunctionalTest().getResource();
	}

	

	@Then("^Send delete request to delete resource$")
	public void send_delete_request_to_delete_resource() {
	    pages.homeTaskRestFunctionalTest().deleteResource();
	}

	
	@Then("^Verify that resource has been deleted succesfully$")
	public void verify_that_resource_has_been_deleted_succesfully() {
	  pages.homeTaskRestFunctionalTest().verifyResourceIsDeleted();
	}


}
