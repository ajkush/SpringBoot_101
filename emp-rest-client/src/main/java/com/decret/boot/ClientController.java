package com.decret.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class ClientController {
	
	@Autowired
	RestTemplate rt;
	@RequestMapping(path="/get/{id}", method=RequestMethod.GET, produces="application/json")
	public String getEmployeeData(@PathVariable("id")int id){
		
		return rt.getForObject("http://emp-rest-service/find?id="+id, String.class);
		 
		
	}

}
