package Omdb.Omdb;

import static org.junit.Assert.*;

import org.junit.Test;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;


import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;


public class OmdbTest {

	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;
	String url = " http://www.omdbapi.com/?i=tt0800369&apikey=918d4e8 ";
	
	
//Methods
	
@Given("^a film exists with the title titanic$")

public void a_film_exists_with_the_title_titanic() {
 
	request = given().contentType(ContentType.JSON);
	
}

@When("^a user retrieves the film using the title$")
public void a_user_retrieves_the_film_using_the_title()  {
	
    response = when().get(url);
    
    System.out.println("Response is: "+ response.prettyPrint()); //output
   
}

@Then("^the status code should read (\\d+)$")
public void the_status_code_should_read(int statusCode)  {
	//json=
   
   
}


	
	
}
