package tns.ifet.dayfive.inheritence;

import tns.ifet.daythree.sacnner.Person;

public class HierarchicalInhDemo {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);

		Person p;
		p = new Person("Dhruv", "Mumbai");
		if (p instanceof Person)
			System.out.println("Person Details "+p);
		
		p = new Person("Nikhil", "Mumbai", 101, 67000, "Sales");
		if (p instanceof Employee)
		System.out.println("Employee Details "+p);
		

		p = new Person("Pankaj", "Pune", "FE", 88);
		if (p instanceof Student)
			System.out.println("Student Details "+p);

	}


	}
