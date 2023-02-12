package com.adi.springboot.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.adi.springboot.entity.Department;

@Component
public interface DepartmentDao extends JpaRepository<Department,Long>{

	

}
