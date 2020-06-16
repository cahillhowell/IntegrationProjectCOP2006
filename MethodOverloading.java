
public class MethodOverloading {
	public static void method() {

		String methodGreeting = "You can overload methods to be more efficient, they can be very useful."
				+ "\nYou can do this in a few different ways inside methods."
				+ "\nChanging number of parameters\tChanging the data type\tChanging the sequence";
		String skipLine = "\n";
		String newBlock = "================================================================================================================================"
				+ "\n================================================================================================================================";

		System.out.println(newBlock);
		System.out.println(methodGreeting);
		System.out.print(skipLine);

		// start with the first way
		System.out.println("Here is the set of numbers I will be using. a=26, b=53, c=38" + "\n"
				+ "\n1. You can change how many numbers are in the parameters while using the same method name");

		System.out.println("Variable a+b is: " + methodOverload1.setOne(26, 53) + "\nVariable a+b+c is: "
				+ methodOverload1.setTwo(26, 53, 38));
		System.out.println("2. You can the data type of the parameters within the same method name");
		System.out.println(
				"a = 26, and b = 53, now added as a double data type: " + methodOverload1.setThree(26.0, 53.0));

	}

}

class methodOverload1 {
	static int setOne(int a, int b) {
		return a + b;
	}

	static int setTwo(int a, int b, int c) {
		return a + b + c;
	}

	static double setThree(double a, double b) {
		return a + b;
	}
}
