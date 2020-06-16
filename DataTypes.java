// class containing things related to the data types
public class DataTypes {
	public static void data() throws InterruptedException {
		String skipLine = "\n"; // string to use less memory than System.out.println(" ");
		String newBlock = "================================================================================================================================"
				+ "\n================================================================================================================================";
		System.out.println(newBlock);// I like the look of this in the console

		System.out.println("These are examples of the different data types java can use."); // Quick
																							// description
		System.out.println("Byte, Short, Int, Double, Float, Long, Char, and Boolean"); // list the data
																						// types
		System.out.print(skipLine);

		Thread.sleep(3000); // I want the user to be able to read along with the terminal, it outputs so
		// fast

		byte numberOne = 20; // Byte can use any number between -128 to 127

		short numberTwo = 2020; // short can use any number between -32768 to 32767

		final int numberThree = 8673509; // can use any number between -2147483648 to 2147483647

		double numberFour = 101.9d; // can be used to represent decimal values

		float numberFive = 3.47f; // can store fractional values

		long numberSix = 2000000L; // can use any number between -9223372036854775808 to
									// 9223372036854775807

		char letterForWumbo = 'W'; // can either use a letter to store a value or to store a single
									// letter

		boolean pineapplePizzaNo = false; // gives either true or false when thrown into an argument or
											// you could give an argument
		boolean pineapplePizzaYes = true; // if you want a false the value will have to come out to
											// PizzaNo, if you want it to say true
											// you'll have it come out to PizzaYes

		int castingNumberOne = 27; // starting with the intial value I want
		double castingNumberTwo = castingNumberOne; // automatically changes the int to a double data
													// type

		// Go through and make all the variables visible and to tell the user what they
		// are
		System.out.println("Byte: " + numberOne + " " + "Short: " + numberTwo + " " + "Int: " + numberThree + " "
				+ "Double " + numberFour);
		System.out.println("Float: " + numberFive + " " + "Long: " + numberSix + " " + "Char: " + letterForWumbo);
		System.out.println("Boolean: Does pineapple belong on pizza? " + pineapplePizzaNo);
		System.out.print(skipLine);

		Thread.sleep(5000); // I want the user to be able to read along with the terminal, it outputs so
		// fast

		// Description of the use of the final keyword
		String finalDescription = "All values do have the ability to be changed at anytime, however if you wanted to create a value that couldn't change\n"
				+ "you'd use the final keyword. If you tried to change the value in your code, the program would run into an error!";
		System.out.println(finalDescription);
		// int numberThree = 15; ===== if I don't comment this out it will fail to run!
		System.out.print(skipLine);

		Thread.sleep(5000); // I want the user to be able to read along with the terminal, it outputs so
		// fast

		// description of casting and the example
		String castingDescription = "It's also possible to sometimes change an intial data type to a different one if desired, such as changing\n"
				+ "an int data type into a double data type, you'll probably do this if you tried to add an int and double, and\n"
				+ "the sum was a decimal value. The next number is declared as a int, and then casted into a double underneath it";
		System.out.println(castingDescription);
		System.out.println(castingNumberOne); // relates to lines 36, 37
		System.out.println(castingNumberTwo);
	}

}
