package tns.ifet.dayfive.inheritence;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address = new Address("405 Laxmi Enclave, Pandit Colony", "Nashik", "Maharashtra", "422003");
		Perso perso = new Perso("Aniket Pawar", address);
		perso.displayInfo();

	}

}
