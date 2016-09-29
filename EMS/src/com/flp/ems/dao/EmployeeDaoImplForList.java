package com.flp.ems.dao;

import java.util.ArrayList;
import java.util.List;

import com.flp.ems.domain.Employee;

public class EmployeeDaoImplForList implements IemployeeDao{
	
	List<Employee> employeeList = new ArrayList<Employee>();
	public EmployeeDaoImplForList() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void AddEmployee(Employee employee) {
		employeeList.add(employee);
	}
	
	@Override
	public List<Employee> getAllEmployee() {
		return employeeList;
	}
	
	@Override
	public void ModifyEmployee() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void RemoveEmployee(Employee employee) {
				employeeList.remove(employeeList.indexOf(employee));
	}
	
	@Override
	public Employee SearchEmployee(int id) {
		for(Employee e:employeeList){
			if(id==e.getKinId()){
				return e;
			}
		}
		return null;
	}
	
	
}
