package com.adi.springboot.services;

import java.util.List;

import com.adi.springboot.entity.Employee;

public interface EmployeeService {
	
	  List<Employee> findAll();
	  Employee findById(Long id);
	  Employee save(Employee employee);
	  void deleteById(Long id);
}
