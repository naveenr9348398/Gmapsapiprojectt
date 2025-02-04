package Stepdefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@Deleteplace")
	public void beforedeleteplace() throws IOException {
		stepdefinitions s = new stepdefinitions();
		if(s.placeid==null) {
			s.user_needs_to_use_the_addplace_api_with("-54.5959","-54.5950","50","naveen","phone","address","type1","type2","website","language");
		    s.user_needs_to_use_the_using_http_method("Addplaceapi", "post");
		    s.user_needs_to_validate_if_the_response_status_code_is(200);
		    s.user_needs_to_check_if_the_response_of_is("status", "OK");
		}
	}

}
