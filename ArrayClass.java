import java.util.ArrayList;

public class ArrayClass {
	public static void array(String args[]) {
		String skipLine = "\n"; // string to use less memory than System.out.println(" ");
		String newBlock = "================================================================================================================================"
				+ "\n================================================================================================================================";
		System.out.println(newBlock);// I like the look of this in the console

		String arrayGreeting = "One dimision arrays are a collection of elements of one specific data type.";
		System.out.println(arrayGreeting);

		// array of a 10s
		int[] array = new int[10]; // this declares the array size of 10 numbers
		int smallest = Integer.MAX_VALUE;
		array[0] = 10; // this is the initialization of the array, where it starts
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		array[5] = 60;
		array[6] = 70;
		array[7] = 80;
		array[8] = 90;
		array[9] = 100;
		// now that I have all the numbers I want to use, print the numbers
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println(array[5]);
		System.out.println(array[6]);
		System.out.println(array[7]);
		System.out.println(array[8]);
		System.out.println(array[9]);
		System.out.print(skipLine);

		// find the smallest value of the array
		String partTwoArrays = "You can use a for loop to try to locate the smallest value of the array.";
		System.out.println(partTwoArrays);

		// this loop looks for the smallest value inside the array, once its found the
		// loop ends and prints it out
		for (int i = 0; i < array.length; i++) {
			if (smallest > array[i]) {
				smallest = array[i];
			}
		}
		System.out.println("The smallest value is: " + smallest);

		// find the sum of the entire array if added together
		String partThreeArrays = "You can use loops to calculate the sum of an array.";
		System.out.println(partThreeArrays);
		int sum = 0;
		for (int num : array) {
			sum = sum + num;
		}
		System.out.println("The sum of the array is: " + sum);

		String partFourArrays = "Using a 2 Dimensional array to present information differently.";
		System.out.println(partFourArrays);
		// This will be the multidimensional array
		int[][] arrayNumbers = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9 }, };
		// print out the lengths of the array columns
		System.out.println("Length of row 1: " + arrayNumbers[0].length);
		System.out.println("Length of row 2: " + arrayNumbers[1].length);
		System.out.println("Length of row 3: " + arrayNumbers[2].length);

		// Using the ArrayList utility, print the cars in the apartment
		String partFiveArrays = "You can also create a list of parameters, as an ArrayList, which you"
				+ "\ncan efficiently print out all of them at once.";
		System.out.println(partFiveArrays);
		System.out.println("My roommates and I own these brands of cars!");
		ArrayList<String> vehicles = new ArrayList<String>();
		vehicles.add("Toyota");
		vehicles.add("Kia");
		vehicles.add("Hyundai");
		vehicles.add("Infiniti");
		System.out.println(vehicles);
	}
}
