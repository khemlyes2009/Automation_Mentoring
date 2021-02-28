package basic;

public class LearnObject {

	//How to create an object?
	
	// className objectName = new constructorOfClass();
	
	int num1 = 43;
	int num2 = 45;
	
	public static void main(String[] args) {
		
		LearnObject learn = new LearnObject();
		
		int total = learn.num1 + learn.num2;// call by object name
		
		System.out.println("Total value is " + total);
		
		
		// can we create multiple object of same class
		
		LearnObject obj = new LearnObject();
		obj.num1 = 66;
		obj.num2 = 77;
		int output = obj.num1*obj.num2;
		System.out.println("Output is " + output);
		
		// can we create another class object here? yes
		LearnDataType datatype = new LearnDataType();
		System.out.println(datatype.coursefee);
		
		datatype.isAvailable = false; // ReAssign value 
		System.out.println(datatype.isAvailable);
		
		
		LearnStatic ls = new LearnStatic();
		ls.display();
		LearnStatic.tvDisplay();
		
	}
	
}
