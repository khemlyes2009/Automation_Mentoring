package basic;

public class LearnStatic {
	
	
	// Declare variable: Declare data type with variable name
	int age;

	// Declare variable and Assign value
	int pizzaPrice = 25;
	
	
	public static String stName = "Easha";// Static global variable
	String stAddress = "New York";// Non Static global variable
	static String stFatherName;
	
	
	
	public static void tvDisplay() {
		
		System.out.println("Tv Display is UHD");
	
	}
	
	
	public void display() {
		System.out.println("Display is good");
	}
	


	public static void main(String[] args) {
	//Semicolon is used to complete a statement	
		
	// How can we call non static variable inside main method	
	// Static variable / method called by class name as that variable / method in class level	

		LearnStatic.stName = "Kevin";// ReAssing value;
		LearnStatic.stName = "Arafat";//ReAssign again;
		System.out.println(LearnStatic.stName);
		
		LearnStatic.tvDisplay();
		
		LearnStatic.stFatherName = "Bob William";
		System.out.println("Student Father Name is: "+LearnStatic.stFatherName);
		
	// How can we call non static variable inside main method	
	// to call a non static variable / method, we need to  create Object an 
	//then call by object name
		
	
	//How to create an object?
	// className objectName = new constructorOfClass();
		
		LearnStatic obj = new LearnStatic();
		//obj.stAddress;
		System.out.println(obj.stAddress);
		
		obj.age = 34;
		System.out.println(obj.age);
		
		obj.pizzaPrice = 45;
		System.out.println("Pizza Price " + obj.pizzaPrice);
		
		obj.display();//Call by objectName
		
		
		String stPhoneNumber = "1233456667";// Local variable
		
	}

}
