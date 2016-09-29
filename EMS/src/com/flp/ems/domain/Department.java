package com.flp.ems.domain;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	String nameOfDepartment;
	List<Role> role = new ArrayList<Role>();
	List<Project> projects = new ArrayList<Project>();
	
	
	public Department(String nameOfDepartment) {
		super();
		this.nameOfDepartment = nameOfDepartment;
	}

	public String getNameOfDepartment() {
		return nameOfDepartment;
	}
	
	public void setNameOfDepartment(String nameOfDepartment) {
		this.nameOfDepartment = nameOfDepartment;
	}
	
	public Project getProject(int index){
		return projects.get(index);
	}
	
	public Role getRole(int index){
		return role.get(index);
	}
	
	public void addProject(String nameOfProject){
		projects.add(new Project(nameOfProject));
	}
	
	public void  addRoles(String nameOfRole){
		role.add(new Role(nameOfRole));
	}
	

}
