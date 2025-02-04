package Stepdefinitions;

import Resources.Apiresources;
import Resources.Gmapspayload;
import Resources.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

import java.io.IOException;

public class stepdefinitions extends Utils {
	Gmapspayload gp = new Gmapspayload();
	
	public static RequestSpecification request;
	public static Response response;
	public static  String placeid;
	
	@Given("User needs to use the addplace api with {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
	public void user_needs_to_use_the_addplace_api_with(String lat, String lng, String accuracy, String name, String phonenumber, String address, String types1, String types2, String website, String language) throws IOException {
	     request = given().spec(requestspecification()).body(gp.addplacepayload(lat,lng,accuracy,name,phonenumber,address,types1,types2,website,language));
	}
	@When("User needs to use the {string} using http {string} method")
	public void user_needs_to_use_the_using_http_method(String resource, String httpmethod) {
	  Apiresources ar =Apiresources.valueOf(resource);
		response = request.when().post(ar.getresources());
	}
	@Then("User needs to validate if the response status code is {int}")
	public void user_needs_to_validate_if_the_response_status_code_is(Integer int1) {
	  assertEquals(response.getStatusCode(),200);
	}
	@Then("User needs to check if the response of {string} is {string}")
	public void user_needs_to_check_if_the_response_of_is(String key, String value) {
	 assertEquals(getjsonpath(key, response),value);
	  placeid =     getjsonpath("place_id", response);
	}
	
	@Given("User needs to use the getplace payload")
	public void user_needs_to_use_the_getplace_payload() throws IOException {
	    request = given().spec(requestspecification()).queryParam("place_id", placeid);
	}
	@When("User needss to use the {string} using http {string} method")
	public void user_needss_to_use_the_using_http_method(String resources, String httpmethod) {
	   Apiresources ar = Apiresources.valueOf(resources);
		response = request.when().post(ar.getresources());
	}
	@Then("User needss to verify uf the response of statuss code is {int}")
	public void user_needss_to_verify_uf_the_response_of_statuss_code_is(Integer int1) {
	    assertEquals(response.getStatusCode(),200);
	}
	@Then("User needs to veify the responsee of {string} is {string}")
	public void user_needs_to_veify_the_responsee_of_is(String key, String value) {
	 assertEquals(getjsonpath(key, response),value);
	}
	
	@Given("User needs to use the delete place payload")
	public void user_needs_to_use_the_delete_place_payload() throws IOException {
	   request = given().spec(requestspecification()).body(gp.deleteplacepayload(placeid));
	}
	@When("Userr needs to use the {string} using http {string} method")
	public void userr_needs_to_use_the_using_http_method(String resource, String httpmethod) {
	    Apiresources ar = Apiresources.valueOf(resource);
		response = request.when().post(ar.getresources());
	}
	@Then("Userr needs to check if the reponse of status code is {int}")
	public void userr_needs_to_check_if_the_reponse_of_status_code_is(Integer int1) {
	    assertEquals(response.getStatusCode(),200);
	}
	@Then("Userr needs to checkk if the response of {string} is {string}")
	public void userr_needs_to_checkk_if_the_response_of_is(String key, String value) {
	    assertEquals(getjsonpath(key, response),value);
	}

}
