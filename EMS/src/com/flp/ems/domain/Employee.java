package com.flp.ems.domain;

import java.util.Date;
		
public class Employee {
	static int counter=0;
	private String name;
	private int kinId;
	private String emailId;
	private String phoneNo;
	private String address;
	private Date dob;
	private Date doj;
	private Department department;
	private Project projects;
	private Role role;
	
	
	{
		counter++;
	}
	
	public Employee(String name, String phoneNo, String address, Date dob, Date doj,
			Department department, Project projects, Role role) {
		super();
		this.kinId=counter;
		this.name = name;
		this.phoneNo = phoneNo;
		this.address = address;
		this.dob = dob;
		this.doj = doj;
		this.department = department;
		this.projects = projects;
		this.role = role;
		this.emailId="xxxx@gmail.com";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Department getDepartment() {
		return department;
	}public void setDepartment(Department department) {
		this.department = department;
	}
	public Project getProjects() {
		return projects;
	}
	public void setProjects(Project projects) {
		this.projects = projects;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public int getKinId() {
		return kinId;
	}
}
