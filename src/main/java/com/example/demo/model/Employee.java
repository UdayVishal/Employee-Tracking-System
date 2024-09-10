package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long employeeId;
	  private String employeeName;
	    private String employeeContactNumber;
	    private String employeeAddress;
	    private String employeeGender;
	    private String employeeDepartment;
	    private String employeeSkills;
	    
	    
		public Employee(String employeeName, String employeeContactNumber, String employeeAddress,
				String employeeGender, String employeeDepartment, String employeeSkills) {
			
			this.employeeName = employeeName;
			this.employeeContactNumber = employeeContactNumber;
			this.employeeAddress = employeeAddress;
			this.employeeGender = employeeGender;
			this.employeeDepartment = employeeDepartment;
			this.employeeSkills = employeeSkills;
		}


		public Employee() {
		}


		public Long getEmployeeId() {
			return employeeId;
		}


		public void setEmployeeId(Long employeeId) {
			this.employeeId = employeeId;
		}


		public String getEmployeeName() {
			return employeeName;
		}


		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}


		public String getEmployeeContactNumber() {
			return employeeContactNumber;
		}


		public void setEmployeeContactNumber(String employeeContactNumber) {
			this.employeeContactNumber = employeeContactNumber;
		}


		public String getEmployeeAddress() {
			return employeeAddress;
		}


		public void setEmployeeAddress(String employeeAddress) {
			this.employeeAddress = employeeAddress;
		}


		public String getEmployeeGender() {
			return employeeGender;
		}


		public void setEmployeeGender(String employeeGender) {
			this.employeeGender = employeeGender;
		}


		public String getEmployeeDepartment() {
			return employeeDepartment;
		}


		public void setEmployeeDepartment(String employeeDepartment) {
			this.employeeDepartment = employeeDepartment;
		}


		public String getEmployeeSkills() {
			return employeeSkills;
		}


		public void setEmployeeSkills(String employeeSkills) {
			this.employeeSkills = employeeSkills;
		}
		
		
	
	
	
	
	
}
