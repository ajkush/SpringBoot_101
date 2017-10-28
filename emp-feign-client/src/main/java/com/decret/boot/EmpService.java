package com.decret.boot;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.decret.model.Emp;
@RestController
@FeignClient("emp-rest-service")
public interface EmpService {

	@RequestMapping(path="/info", method=RequestMethod.GET, produces="application/json")
	public String getInfo();

	@RequestMapping(path="/list", method= RequestMethod.GET, produces="application/json")
	public ResponseEntity getEmp();
	
	@RequestMapping(path="/find", method= RequestMethod.GET, produces="application/json")
	public ResponseEntity getEmpById(@RequestParam int id);
	
	@RequestMapping(path="/save", method=RequestMethod.POST, consumes="application/json", produces="applicatoin/json")
	public String saveEmp(@RequestBody Emp emp);
	
	@RequestMapping(path="/delete", method= RequestMethod.DELETE, produces="application/json")
	public String deleteEmp(@RequestParam int id);

}
