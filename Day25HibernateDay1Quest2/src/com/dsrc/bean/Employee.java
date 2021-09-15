package com.dsrc.bean;

public class Employee 
{
	private int empno;
	private String name;
	private String city;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Employee(int empno, String name, String city) {
		super();
		this.empno = empno;
		this.name = name;
		this.city = city;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
