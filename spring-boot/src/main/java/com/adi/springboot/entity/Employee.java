package com.adi.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int emp_id;
	@Column(name="emp_name")
	private String emp_name;
	@Column(name="emp_address")
	private String emp_address;
	@Column(name="emp_phone")
	private int emp_phone;
	@Column(name="emp_salary")
	private int emp_salary;
	@Column(name="dept_id")
	@JoinColumn(referencedColumnName = "dept_id")
	@ManyToOne
	private Department dept_id;
	
	public Employee(int emp_id, String emp_name, String emp_address, int emp_phone, int emp_salary,
			Department dept_id) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_address = emp_address;
		this.emp_phone = emp_phone;
		this.emp_salary = emp_salary;
		this.dept_id = dept_id;
	}


	public int getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}


	public String getEmp_name() {
		return emp_name;
	}


	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}


	public String getEmp_address() {
		return emp_address;
	}


	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}


	public int getEmp_phone() {
		return emp_phone;
	}


	public void setEmp_phone(int emp_phone) {
		this.emp_phone = emp_phone;
	}


	public int getEmp_salary() {
		return emp_salary;
	}


	public void setEmp_salary(int emp_salary) {
		this.emp_salary = emp_salary;
	}


	public Department getDept_id() {
		return dept_id;
	}


	public void setDept_id(Department dept_id) {
		this.dept_id = dept_id;
	}


	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_address=" + emp_address + ", emp_phone="
				+ emp_phone + ", emp_salary=" + emp_salary + ", dept_id=" + dept_id + "]";
	}
	
	
	
	
}
