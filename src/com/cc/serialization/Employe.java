package com.cc.serialization;

import java.io.Serializable;

public class Employe implements Serializable {
      private int empId;
      private String empName;
      private double empSalary;
	public Employe(int i, String string, double d) {
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
		
	}
	
  }
