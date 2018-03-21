package com.ameya.restclients;

import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

public class TestRestAPI {

	public static void main(String[] args) {
		getEmployee();


	}
	private static void getEmployee()
	{
	    final String uri = 
	    		"http://localhost:8080/employees/100";
	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.
	    		getForObject(uri, String.class);
  	    System.out.println("RESULT :: "+result);
	}
	
	
}