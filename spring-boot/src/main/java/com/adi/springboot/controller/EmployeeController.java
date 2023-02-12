package com.adi.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adi.springboot.entity.Employee;
import com.adi.springboot.services.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
  @Autowired
  private EmployeeService employeeService;

  @GetMapping
  public List<Employee> findAll() {
    return employeeService.findAll();
  }

  @GetMapping("/{emp_id}")
  public Employee findById(@PathVariable Long emp_id) {
    return employeeService.findById(emp_id);
  }

  @PostMapping
  public Employee save(@RequestBody Employee employee) {
    return employeeService.save(employee);
  }

  @DeleteMapping("/{emp_id}")
  public void deleteById(@PathVariable Long emp_id) {
    employeeService.deleteById(emp_id);
  }
}
