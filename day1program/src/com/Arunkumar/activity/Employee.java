package com.Arunkumar.activity;
	// A simple class for Employee details
	class Employee {
	    int empId;       // Employee ID
	    String name;     // Employee name
	    double salary;   // Employee salary

	    // Constructor to set employee details
	    public Employee(int empId, String name, double salary) {
	        this.empId = empId;
	        this.name = name;
	        this.salary = salary;
	    }

	    // Method to show employee details
	    public void displayDetails() {
	        System.out.println("Employee ID: " + empId);
	        System.out.println("Name: " + name);
	        System.out.println("Salary: " + salary);
	    }
	}




