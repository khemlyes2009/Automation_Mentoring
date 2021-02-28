package basic;

public class LearnDataType {

	//Data:  
	//Data Type: 
	//Primitive Data Type
	
	byte ram = 20;//global
	short number = 500;
	int age = 25;
	long ssn = 9585948595905l; 
	
	double salary = 6500.58776776;
	float coursefee = 5000.65f; 
	
	char pizzaSize = 'L';
	
	boolean isAvailable = true;
	
	
	//Non Primitive Data Type
	
	String name = "James ";
	
	//Array: can take multiple data at time but data type must be the same

	
	public static String mobileBrand = "IPhone";
	
	
	public static void main(String[] args) {
		int number1 = 25;//local
		int number2 = 56;
		int total = number1 + number2;
		System.out.println(total);
		
		String number = "500";
		double price = 45.6;
		
		System.out.println(price);
		
		String firstName = "James";
		String lastName = "William";
		
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);
		
		System.out.println(LearnAccessModifier.salary);		
				
	}

}
