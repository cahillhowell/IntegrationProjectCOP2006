import java.util.Random;

public class LaundryDay {
	public static void laundry() {
		String skipLine = "\n";
		String newBlock = "================================================================================================================================"
				+ "\n================================================================================================================================";
		System.out.println(newBlock);

		// description of what this block of code will do
		String introLaundry = "You can use a switch statement to select one of many code blocks to be executed!"
				+ "\nThe day printed out onto the next line is a random day out of the week to do your laundry.";
		System.out.println(introLaundry);
		System.out.print(skipLine);

		Random randomGen = new Random(); // creates random object to be used in the code, only needs to
											// be done once

		int laundryDay = randomGen.nextInt(7); // sets the range thats used in the switch
		int day = laundryDay;

		// creates what will be evaluated and then spit out as a result, one of the days
		// will be output
		switch (day) {
		case 1:
			System.out.println("Laundry day will be Monday");
			break;

		case 2:
			System.out.println("Laundry day will be Tuesday");
			break;

		case 3:
			System.out.println("Laundry day will be Wednesday");
			break;

		case 4:
			System.out.println("Laundry day will be Thursday");
			break;

		case 5:
			System.out.println("Laundry day will be Friday");
			break;

		case 6:
			System.out.println("Laundry day will be Saturday");
			break;

		case 7:
			System.out.println("Laundry day will be Sunday");
			break;
		}
	}
}
