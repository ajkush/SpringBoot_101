package com.decret.boot;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.decret.model.Emp;
//@Component
@RestController
public class FeignController {
	
	@Autowired
	EmpService empService;
	
	@RequestMapping(path="/feign-info", method=RequestMethod.GET, produces="application/json")
	public String getInfo(){
		return empService.getInfo();
	}

	@RequestMapping(path="/feign-list", method= RequestMethod.GET, produces="application/json")
	public ResponseEntity getEmp(){
		return empService.getEmp();
	}
	
	@RequestMapping(path="/feign-find", method= RequestMethod.GET, produces="application/json")
	public ResponseEntity getEmpById(@RequestParam int id){
		return empService.getEmpById(id);
	}
	
	@RequestMapping(path="/feign-save", method=RequestMethod.GET, consumes="application/json", produces="applicatoin/json")
	public String saveEmp(@PathParam("id") int id,
			@PathParam("name") String name,
			@PathParam("dep") String dep
			
			){
		return empService.saveEmp(new Emp(id, name, dep));
	}
	
	@RequestMapping(path="/feign-delete", method= RequestMethod.DELETE, produces="application/json")
	public String deleteEmp(@RequestParam int id){
		return empService.deleteEmp(id);
	}

}
