package com.flp.ems.dao;

import java.util.List;

import com.flp.ems.domain.Employee;

public interface IemployeeDao {


	public void AddEmployee(Employee employee);
	public void ModifyEmployee();
	public List<Employee> getAllEmployee();
	Employee SearchEmployee(int id);
	void RemoveEmployee(Employee employee);
	
	
}
