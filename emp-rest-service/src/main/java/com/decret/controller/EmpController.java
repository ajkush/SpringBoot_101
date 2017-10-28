package com.decret.controller;

import java.util.HashMap;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.decret.model.Emp;
@RestController
@Component
public class EmpController {

	@RequestMapping(path="/info", method=RequestMethod.GET, produces="application/json")
	public String getInfo(){
		return "This is a Spting Web Servce";
	}



	static HashMap<Integer, Emp> employees = new HashMap();
	static{
		employees.put(101, new Emp(101, "Ajay", "SE"));
		employees.put(102, new Emp(102, "Shukla", "SSE"));
		employees.put(103, new Emp(103, "Ajit", "Dev"));
		employees.put(104, new Emp(104, "Aman", "TL"));
		employees.put(105, new Emp(105, "A", "PPM"));
	}

	@RequestMapping(path="/list", method= RequestMethod.GET, produces="application/json")
	public ResponseEntity getEmp(){

		return ResponseEntity.ok(employees.toString());

	}
	
	@RequestMapping(path="/find", method= RequestMethod.GET, produces="application/json")
	public ResponseEntity getEmpById(@RequestParam int id){

		if(employees.containsKey(id)){
			return ResponseEntity.ok(employees.get(id));
		}else{
			return ResponseEntity.ok("Employee not Exist");
		}

	}

	@RequestMapping(path="/save", method=RequestMethod.POST, consumes="application/json", produces="applicatoin/json")
	public String saveEmp(@RequestBody Emp emp){

		if(employees.containsKey(emp.getId())){
			return "Employee alreasy exist";
		}else{
			employees.put(emp.getId(), emp);
			return "Employee Saved";
		}

	}
	
	@RequestMapping(path="/delete", method= RequestMethod.DELETE, produces="application/json")
	public String deleteEmp(@RequestParam int id){
		
		if(!employees.containsKey(id)){
			return "Employee do not exist";
		}else{
			employees.remove(id);
			return "Employee Deleted";
		}
		
	}

}
