package net.javaguides.springboot.service;

import net.javaguides.springboot.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    Employee createEmployee(Employee employee);

    Employee updateEmployee(Long id, Employee employee);

    Employee deleteEmployee(Long id);
}
