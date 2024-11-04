package tns.ifet.dayfive.inheritence;

import java.util.Date;

public class Employee extends Person{
	private float salary;
	private String dept;
	private int empId;
	
	
	public Employee() {
		System.out.println("Employee Class Default Constructor");
	}


	public Employee(int empId, float salary, String dept) {
		this.empId = empId;
		this.salary = salary;
		this.dept = dept;
	}
	
	
	public Employee(String name, String city,int empId, float salary, String dept) {
		super(name,city);
		this.empId = empId;
		this.salary = salary;
		this.dept = dept;
	}


	public Employee(String name, long contactNo, Date dateOfBirth, String deptName, double baseSalary) {
		// TODO Auto-generated constructor stub
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", dept=" + dept + ", getName()=" + getName()
				+ ", getCity()=" + getCity() + "]";
	}
	
	
public String getCity() {
		// TODO Auto-generated method stub
		return null;
	}


}
