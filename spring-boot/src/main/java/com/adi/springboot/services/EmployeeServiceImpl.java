package com.adi.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adi.springboot.dao.EmployeeDao;
import com.adi.springboot.entity.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao employeeDao;
	
	 @Override
	  public List<Employee> findAll() {
	    return employeeDao.findAll();
	  }

	  @Override
	  public Employee findById(Long id) {
	    return employeeDao.findById(id).orElse(null);
	  }

	  @Override
	  public Employee save(Employee employee) {
	    return employeeDao.save(employee);
	  }

	  @Override
	  public void deleteById(Long id) {
		  employeeDao.deleteById(id);
	  }
	
}
