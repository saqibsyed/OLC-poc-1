package com.olc.poc.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	//Fetch All Employees
	@GetMapping("/employees")
	public List<Employee> getAllEmployee() {
		return empService.getAllEmployees();
	}
	
	//Fetch Specific Employee 
	@GetMapping("/employees/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id) {
		return empService.getemployee(id);
	}

	//add a new employee
	@PostMapping("/employees")
	public void addEmployee(@RequestBody Employee employee) {
		empService.addEmployee(employee);
	}
	
	//update a employee
	@PutMapping("/employees/{id}")
	public void updateEmployee(@RequestBody Employee employee) {
		empService.updateEmployee(employee);
	}

	//delete a specific employee
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable int id) {
		empService.deleteEmployee(id);
	}
}
