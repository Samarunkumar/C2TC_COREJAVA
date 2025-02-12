package com.Arunkumar.activity;

import java.util.Scanner;

//Main class to run the program
	public class EmployeeDetails {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            // Input for Employee
	            System.out.print("Enter Employee ID: ");
	            int empId = scanner.nextInt();
	            scanner.nextLine(); // To handle the newline character

	            System.out.print("Enter Employee Name: ");
	            String name = scanner.nextLine();

	            System.out.print("Enter Employee Salary: ");
	            double salary = scanner.nextDouble();
	            scanner.nextLine(); // To handle the newline character

	            // Input for Manager
	            System.out.print("Enter Manager's Department: ");
	            String department = scanner.nextLine();
	            // Create objects
	            Employee emp = new Employee(empId, name, salary);
	            Manager mgr = new Manager(empId, name, salary, department);

	            // Display details
	            System.out.println("\n--- Employee Details ---");
	            emp.displayDetails();

	            System.out.println("\n--- Manager Details ---");
	            mgr.displayDetails();

	        } catch (Exception e) {
	            System.out.println("Error: Please check your input.");
	        } finally {
	            scanner.close();
	        }
	    }
	}