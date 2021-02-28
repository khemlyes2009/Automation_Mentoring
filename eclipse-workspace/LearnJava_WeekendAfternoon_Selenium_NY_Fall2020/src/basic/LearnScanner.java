package basic;

import java.util.Scanner;

public class LearnScanner {

	public static void main(String[] args) {

		// class name is Scanner
		// how to create and object of Scanner class?

		//className objectName = new constructorOfClass
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		String firstName = input.nextLine();
		System.out.println("First Name : " + firstName);
		
		System.out.println("Enter your last name");
		String lastName = input.nextLine();
		System.out.println("Last Name : " + lastName);

		System.out.println("Full Name: "+ firstName + lastName);
		
		System.out.println("Enter Course Fee");
		double cFee = input.nextDouble();
		System.out.println("Course fee is: " + cFee);
		
		System.out.println("Enter your age");
		int age = input.nextInt();
		System.out.println("My Age is "  + age);
		
		// To close Scanner 
		input.close();
	}
	
}