package basic;

public class LearnBlock {

	// Block

	{// block start point

		// Block body

		System.out.println("Hello");
		System.out.println("This is a bloch");

	}

	public static void display() {
		// Method/ Function

		System.out.println("This is display method");

		{
			System.out.println("This is from inside a block");
		}
	}

	public static void main(String[] args) {

		{// block start point

			// Block body

			System.out.println("Hello");
			System.out.println("This is a bloch");

		} // block end point

		// Static method or variable we can call by class
		LearnBlock.display();
	}

}