// if, else if, and else statements declared here

import java.util.Scanner;

public class LoopDeeLoops {
	public static void loops() throws InterruptedException {
		String skipLine = "\n";
		String newBlock = "================================================================================================================================"
				+ "\n================================================================================================================================";
		System.out.println(newBlock);// I like the look of this in the console

		Scanner scan = new Scanner(System.in); // must make new object at least once
		String userInstruction = "How's the weather today? Type 1 for good or 2 for bad";
		System.out.println(userInstruction);

		// this will be where the user tells the program about the weather
		int weather = scan.nextInt();
		System.out.println(skipLine);

		String good = "Clear Skies";
		String bad = "Dark Clouds";

		// gives good output when user inputs 1
		if (weather == 1) { // here is an example of a relational operator the 'Equal to'
			System.out.println(good + " Head to the beach!");
		}

		// gives bad output when user inputs 2
		else if (weather == 2) { // here is an example of a relational operator the 'Equal to'
			System.out.println(bad + " Probably stay inside!");
		}

		// This is where I decided to integrate my knowledge of an exception handle, so
		// that
		// if the user does anything other than the 1 or 2 the code can handle it and
		// show error
		// and then proceed into the rest of the code.
		else {
			System.out.println("Error");
		}

		Thread.sleep(4000); // I want the user to be able to read along with the terminal, it outputs so
		// fast

		System.out.println(skipLine);

		// count down 5 to 1
		String whileLoop = "Simple while loop to count to 5 from 1";
		System.out.println(whileLoop);
		int i = 1;
		while (i <= 5) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println(skipLine);

		// loop to read through a declared array of strings
		String forLoop = "Print the colors of the rainbow!";
		System.out.println(forLoop);
		String[] rainbowColors = { "Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet" };
		for (String f : rainbowColors) {
			System.out.print(f + " ");
		}
		System.out.println(skipLine);

		/*
		 * //This code works, but for some reason it continues to break the program, I
		 * think its the nature of the do/while //that breaks the program, even a break;
		 * didn't fix the issue, but it does run on its own!
		 * 
		 * int y = 1; do { System.out.println(y); y++; } while (y <= 10);
		 * 
		 */

		// loop that breaks in the middle
		String breakLoop = "This code will count and stop at 3 and not reach 4 or keep counting, because of a break.";
		System.out.println(breakLoop);
		int h = 1;
		while (h < 10) {
			System.out.print(h);
			h++;
			if (h == 4) { // here is an example of a relational operator the 'Equal to'
				break; // this will stop the code and move on to the next loop, if it reaches 4 it wont
						// print
						// 4 and stop counting
			}
		}
		System.out.println(skipLine);

		// loop that will continue through to the end
		String continueLoop = "This code will not stop at 4 it will finish counting once it reachs 10, because its told to continue past 4 this time.";
		System.out.println(continueLoop);
		int u = 1;
		while (u <= 10) {
			if (u == 4) { // here is an example of a relational operator the 'Equal to'
				u++;
				continue; // where as this is not necessary as if its not there, it will continue anyways,
							// its more useful for a more intricate program idea, continue says if this is
							// met
							// keep going
			}
			System.out.print(u);
			u++;
		}

	}

}
