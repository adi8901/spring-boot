package com.adi.springboot.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.adi.springboot.entity.Employee;

@Component
public interface EmployeeDao extends JpaRepository<Employee, Long>{
	

	
}
