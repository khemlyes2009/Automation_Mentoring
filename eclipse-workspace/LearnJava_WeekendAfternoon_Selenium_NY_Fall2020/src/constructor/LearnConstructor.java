package constructor;

public class LearnConstructor {

	// Constructor
	// Constructor name should be same name as class
	// Constructor has no return type
	// Constructor are used to initialize object

	// AccessModifier className() { }

	// Without parameter it is called Default constructor

	String stName;
	String stAddress;
	int stAge;
	double courseFee;
	String stPhoneNumber;

	public LearnConstructor() {
		// Default Constructor
		// System.out.println("This is Default constructor");

		// int num1 = 50;
		// int num2 = 60;
		// int total = num1 + num2;
		// System.out.println("Total is: " + total);
	}

	// Signature Pattern
	// Create parameter
	// With parameter it is called parameterized constructor

	// Single Parameterized constructor
	public LearnConstructor(String name) {
		System.out.println("Student name is: " + name);
	}

	// Multi Parameterized constructor
	public LearnConstructor(String name, int age) {
		System.out.println("Student name is: " + name + " Age is: " + age);
	}
	
	String pizzaName = "Dominos";
	
	public LearnConstructor(String stName, String stAddress) {
		this.stName = stName;
		this.stAddress = stAddress;
		System.out.println("Student name is: "+ this.stName + " Address is "+this.stAddress);
	}

	public LearnConstructor(String stAddress, String stName, String stPhoneNumber, int stAge, double courseFee  ) {
	this.stAddress = stAddress;
	this.stName = stName;
	this.stPhoneNumber = stPhoneNumber;
	this.stAge = stAge;
	this.courseFee = courseFee;
	
	System.out.println("Student name "+this.stName+" Address "+this.stAddress+" Phone Number "+this.stPhoneNumber+ " Age "+this.stAge+" Course Fee "+this.courseFee);
	}
	
	public LearnConstructor(int courseFee) {
		this.courseFee = courseFee;
		
		double courseFeeAfterDiscount = this.courseFee*.90;
		System.out.println("Course Fee after discount "+ courseFeeAfterDiscount);
	}
	
	
	public static void main(String[] args) {

		// className objectName = new constructorOfClass();

		LearnConstructor learn = new LearnConstructor();

		LearnConstructor student = new LearnConstructor("Abu Mohammad"); // Argument passing
		LearnConstructor nasir = new LearnConstructor("Nasir Khan");

		LearnConstructor mamun = new LearnConstructor("Mamun Khan", 34);
		LearnConstructor farha = new LearnConstructor("Dendoune Farha", "Jesrsey City, NJ");

		LearnConstructor ghania = new LearnConstructor("Queens ,NY", "Ghania Meziani", "12345678", 30, 5000.50);

		LearnConstructor simar = new LearnConstructor(5000);
	}

}
