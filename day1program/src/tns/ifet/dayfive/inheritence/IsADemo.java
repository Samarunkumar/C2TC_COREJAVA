package tns.ifet.dayfive.inheritence;

public class IsADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employ employ = new Employ("Sagar Pawar", 101, "IT");
		Manager manager = new Manager("Ankit Kale", 201, "Hr", 8);

		System.out.println(employ);
		System.out.println("---------------------------------------------------------------");
		System.out.println(manager);
	}

}
