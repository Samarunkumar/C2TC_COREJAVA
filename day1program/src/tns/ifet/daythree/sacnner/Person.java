package tns.ifet.daythree.sacnner;

public class Person {
	private String name;
	private int income;
	private String gender;
	private int age;
	private int tax;
	public Person(String string, String string2) {
		// TODO Auto-generated constructor stub
	}
	public Person(String string, String string2, int i, int j, String string3) {
		// TODO Auto-generated constructor stub
	}
	//Getter and Setters
	public int getTax() {
	return tax;
	}
	public void setTax(int tax) {
	this.tax = tax;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public int getIncome() {
	return income;
	}
	public void setIncome(int income) {
	this.income = income;
	}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String toString() {
return "Person [name=" + name + ",income=" + income + ", gender=" + gender + ",age=" + age + ", tax="+tax+"]";
	
}
}