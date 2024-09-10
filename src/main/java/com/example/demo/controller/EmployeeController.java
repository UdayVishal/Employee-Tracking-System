package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.Employeerepository;

@RestController
//@RequestMapping("/api/v1") // here we use this annotation to release the api with virgin 1 
@CrossOrigin("http://localhost:4200")
public class EmployeeController {

	@Autowired
	private Employeerepository ER;
	
	//get all the employee
	@GetMapping(path="/employees")
	public List<Employee> getAllEmployeess()
	{
		return ER.findAll();
	}
	
	@PostMapping("/saveemployee")
	public Employee saveEmployee(@RequestBody Employee emp)
	{
		return ER.save(emp);
	}
	
	    @DeleteMapping("/delete/employee/{employeeid}")
		public void deleteemployee(@PathVariable Long employeeid)
		{
		     ER.deleteById(employeeid);
		}
	    
	    
	    @GetMapping("/getemployee/{employeeid}")
	    public Employee getemployee(@PathVariable Long employeeid) {
	    	return ER.findById(employeeid).orElseThrow();
	    }
	    @PutMapping("/update/employee")
		public Employee updateemployee(@RequestBody Employee empp) {
	    	ER.findById(empp.getEmployeeId()).orElseThrow();
	    	return ER.save(empp);
	    }
	    
	
	
	
}
