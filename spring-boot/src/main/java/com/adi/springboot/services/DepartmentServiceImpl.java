package com.adi.springboot.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adi.springboot.dao.DepartmentDao;
import com.adi.springboot.entity.Department;
import jakarta.transaction.Transactional;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentDao departmentDao;

	 @Override
	  public List<Department> findAll() {
	    return departmentDao.findAll();
	  }

	  @Override
	  public Department findById(Long dept_id) {
	    return departmentDao.findById(dept_id).orElse(null);
	  }

	  @Override
	  public Department save(Department department) {
	    return departmentDao.save(department);
	  }

	  @Override
	  public void deleteById(Long dept_id) {
	    departmentDao.deleteById(dept_id);
	  }
	

}
