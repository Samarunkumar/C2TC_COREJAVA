package com.Arunkumar.assignment.utilities;

public class AssignmentMain {
	 public static void main(String[] args) {
	        // Create instances of Manager and Developer
	        com.Arunkumar.assignment.employees.Manager manager =
	                new com.Arunkumar.assignment.employees.Manager("Alice", 101, 75000, "HR");
	        com.Arunkumar.assignment.employees.Developer developer =
	                new com.Arunkumar.assignment.employees.Developer("Bob", 102, 80000, "Java");

	        // Create an instance of EmployeeUtilities
	        com.Arunkumar.assignment.utilities.EmployeeUtilities utilities = new com.Arunkumar.assignment.utilities.EmployeeUtilities();

	        // Use utilities to print employee details
	        utilities.printEmployeeDetails(manager);
	        utilities.printEmployeeDetails(developer);
	    }
	}

