package com.adi.springboot.services;

import java.util.List;

import com.adi.springboot.entity.Department;


public interface DepartmentService {

	  List<Department> findAll();
	  Department findById(Long dept_id);
	  Department save(Department department);
	  void deleteById(Long dept_id);


}
