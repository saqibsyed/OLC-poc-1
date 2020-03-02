package com.olc.poc.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository empRepo;

	public List<Employee> getAllEmployees() {

		return empRepo.findAll();
	}

	public Optional<Employee> getemployee(int id) {
		// return empRepo.findById(id).orElse(null);
		return empRepo.findById(id);
	}

	public void addEmployee(Employee employee) {
		empRepo.save(employee);
	}

	public void updateEmployee(Employee employee) {
		empRepo.save(employee);
	}

	public void deleteEmployee(int id) {
		empRepo.deleteById(id);
	}
}
