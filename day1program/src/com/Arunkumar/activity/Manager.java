package com.Arunkumar.activity;


// A specialized class for Manager (inherits from Employee)
class Manager extends Employee {
    String department;  // Manager's department

    // Constructor to set manager details
    public Manager(int empId, String name, double salary, String department) {
        super(empId, name, salary); // Call Employee constructor
        this.department = department;
    }

    // Method to show manager details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Show employee details first
        System.out.println("Department: " + department);
    }
}
