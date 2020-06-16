
// class containing things related to working with numbers
import java.util.Random; // imports the Random utility

public class PlayingWithNumbers {
	public static void numbers() {
		String skipLine = "\n"; // make the code look nice and easier to read
		String newBlock = "================================================================================================================================"
				+ "\n================================================================================================================================";
		System.out.println(newBlock);// I like the look of this in the console

		Random randomGen = new Random(); // generates the use of random, only have to do this one time

		// Creating a block of code that will hold the values for the next block of
		// statements
		byte numberOne = (byte) randomGen.nextInt(10); // this will create a random value named
														// numberOne within the range of 1-10
		byte numberTwo = (byte) randomGen.nextInt(10);
		byte numberThree = 4;
		byte numberFour = 8;
		byte numberFive = 13;

		// block of code that uses the above block to perform math using basic operators
		String mathIsHappening = "Using 2 random bytes and 3 declared bytes, and the random utility I will let java perform some math";
		System.out.println(mathIsHappening);
		System.out.print(skipLine);
		System.out.println(numberOne + " and " + numberTwo + " Just 2 random numbers."); // This just
																							// gives you 2
																							// different
																							// numbers no
																							// math yet
		int sum = numberThree + numberFour; // add
		System.out.println("4 + 8 = " + sum);
		int difference = numberFour - numberThree; // subtract
		System.out.println("8 - 4 = " + difference);
		int product = numberThree * numberFour; // multiply
		System.out.println("4 * 8 = " + product);
		int quotient = numberFour / numberThree; // divide
		System.out.println("8 / 4 = " + quotient);
		int remainder = numberFive % numberFour; // find remainder
		System.out.println("13 % 8 = " + remainder);
		int increment = ++numberFour;// increment, counts up to the next whole value
		System.out.println("Up one from 8 is " + increment);
		int decrement = --numberThree;// decrement, counts down to the next lowest whole value
		System.out.println("Down one from 4 is " + decrement);
		int equalsPlus = numberOne;// uses the += operator
		equalsPlus += numberFive;
		System.out.println("x = x + 13 the sum = " + equalsPlus);
		System.out.print(skipLine);

		// block of code containing the values for the next block of statements
		double a = 6;
		double b = 36;
		double c = 2;

		// block of code will use the double variables above and show examples of how
		// math util works
		String moreMath = "Using MATH in java, you can have java perform certain math tasks for you."
				+ "\n Below I'll use the math class to find the answers to a few problems.";
		System.out.println(moreMath);
		System.out.print(skipLine);
		int sqrt = (int) (Math.sqrt(b));
		System.out.println("The square root of 36 is " + sqrt);
		int power = (int) (Math.pow(a, c));
		System.out.println("6 to the power of 2 is " + power);
		System.out.print(skipLine);

		String someMoreMath = "The ternary operator can act like an if else statement, and is handy in certain situations.";
		System.out.println(someMoreMath);
		System.out.print(skipLine);
		// Declaring the values for the ternary operator to work with
		int j = 5;
		int k = 10;
		int largerNumber;

		// This will tell the user what the numbers are, and do the work in the
		// background
		System.out.println("First number: " + k);
		System.out.println("Second number: " + j);

		// using the ternary operator ?: ,which operates like an if else statement
		largerNumber = (k > j) ? k : j;

		// prints out the larger number
		System.out.println("Larger number is " + largerNumber);

	}

}
