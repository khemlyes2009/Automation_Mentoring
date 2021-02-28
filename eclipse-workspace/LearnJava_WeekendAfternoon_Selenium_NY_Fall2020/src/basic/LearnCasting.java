package basic;

public class LearnCasting {

	// Casting: means converting data type
	// Primitive data type to Primitive data type
	// Non Primitive data type to Non Primitive data type

	public static void main(String[] args) {

		double price = 35.99;
		int discountPrice = (int) price;
		System.out.println(discountPrice);// casting

		int num1 = 60;
		int num2 = 40;
		int num3 = num1;
		int num4 = num3 + num2;
		System.out.println("Total is: " + num4);

		int age = 24;
		double newAge = (double) age;
		System.out.println(newAge);
		
		int number = 56;
		byte total = (byte) number;
		System.out.println("Int to byte: " + total);
		
		String ssn = "123";
		int newSsn = Integer.parseInt(ssn);
		System.out.println(newSsn);
		int newSsn1 = Integer.valueOf(ssn);
		
		int salary = 2500;
		String s = String.valueOf(salary);
		System.out.println(s);
	}

}
