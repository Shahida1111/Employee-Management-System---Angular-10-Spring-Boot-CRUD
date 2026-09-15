package net.javaguides.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.javaguides.springboot.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.Employee;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

	private final EmployeeService employeeService;

	EmployeeController(EmployeeService employeeService){
		this.employeeService = employeeService;
	}


	// Get all employees
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	// Create employee
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}

	// Get employee by ID
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
		Employee employee = employeeService.getEmployeeById(id);
		return ResponseEntity.ok(employee);
	}

	// Update employee
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(
			@PathVariable Long id,
			@RequestBody Employee employeeDetails) {

		Employee updatedEmployee =
				employeeService.updateEmployee(id, employeeDetails);

		return ResponseEntity.ok(updatedEmployee);
	}

	// Delete employee
	@DeleteMapping("/employees/{id}")
	public Employee deleteEmployee(
			@PathVariable Long id) {




		return employeeService.deleteEmployee(id);
	}
}
