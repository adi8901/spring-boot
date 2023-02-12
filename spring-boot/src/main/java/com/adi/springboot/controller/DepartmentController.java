package com.adi.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adi.springboot.entity.Department;
import com.adi.springboot.services.DepartmentService;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
  @Autowired
  private DepartmentService departmentService;

  @GetMapping
  public List<Department> findAll() {
    return departmentService.findAll();
  }

  @GetMapping("/{dept_id}")
  public Department findById(@PathVariable Long dept_id) {
    return departmentService.findById(dept_id);
  }

  @PostMapping
  public Department save(@RequestBody Department department) {
    return departmentService.save(department);
  }

  @DeleteMapping("/{dept_id}")
  public void deleteById(@PathVariable Long dept_id) {
    departmentService.deleteById(dept_id);
  }
}