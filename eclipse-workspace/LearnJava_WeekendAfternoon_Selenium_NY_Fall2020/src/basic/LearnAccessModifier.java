package basic;

public class LearnAccessModifier {
	
	// Access Modifier / Access specifier: class, variable, method
	// Private: only we can call or use within the class where it is located.
	// Public: we can call or use  within the class where it is located and 
	//from any other class which might be outside of the package
	// Protected : Only accessible from all the classes of that particular package
	
	// Access modifier:
	
	// Public
	// Private
	// Protected 
	// Default
	
	private static int age = 24;
	protected static int salary = 4000;
	static String studentName = "James William";// By default it is declared as public
	
	public static void main(String[] args) {
		
	System.out.println(LearnDataType.mobileBrand);	
	System.out.println(LearnAccessModifier.age);
	
	int num1 = 20;
	System.out.println(num1);
		
	}

}
