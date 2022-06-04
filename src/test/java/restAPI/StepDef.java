package restAPI;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StepDef {

	Response response;
	RequestSpecification request;
	
	@Given("The Base URI is {String}")
	public void the_Base_URI_is(String URI) {
	    // Write code here that turns the phrase above into concrete actions
	  request = RestAssured.given()
			  .baseUri(URI);
		
	}

	@When("I perform the Get Operation")
	public void i_perform_the_Get_Operation() {
	    // Write code here that turns the phrase above into concrete actions
	    
		response = request.get(); 
	}

	@Then("The Response code should be {int}")
	public void the_Response_code_should_be(int ResponseCode) {
	    // Write code here that turns the phrase above into concrete actions
		
		Assert.assertEquals(response.statusCode(), ResponseCode);
	}
}
