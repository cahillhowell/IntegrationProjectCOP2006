// This is my drastic attempt to recreate my integration project and turn in on time as well
// as attempting to implement the ideas into my actual full size project
/*
 * Programmer - Cahill Howell Date Started 5/18/2020
 * 
 * This will be all the desired features asked for through the sprints and milestones I will relate
 * this back into my actual project as I lost my project on my Laptop since its Graphic's card
 * stopped working this morning. Please enjoy running my program!
 * 
 */
public class main {

  public static void main(String[] args) throws InterruptedException {
    String skipLine = "\n"; // string to skiplines in code, even though System.out.println(" ")
                            // works too, string may be
                            // more efficient

    String greeting = "Welcome to my integration project! This will contain all of the things I am " // Greet
                                                                                                     // the
                                                                                                     // user
        + "learning to use inside java, some things"
        + "\nwill be interactive, feel free to go along with it!";

    String goodbye =
        "================================================================================================================================"
            + "\n================================================================================================================================"
            + "\nThank you for running my program!"; // Saying Goodbye to the user, runs at the
                                                     // bottom of main

    System.out.println(greeting);
    System.out.print(skipLine); // skip line, looks nice easier to read the output terminal

    Thread.sleep(6000); // I want the user to be able to read along with the terminal, it outputs so
                        // fast

    dataTypes dataPrintOut = new dataTypes(); // calls the dataTypes class I made
    dataPrintOut.data();
    System.out.print(skipLine);

    Thread.sleep(6000); // I want the user to be able to read along with the terminal, it outputs so
                        // fast

    wordDefinitions wordsPrintOut = new wordDefinitions(); // calls the wordDefinitions class I made
    wordsPrintOut.words();
    System.out.print(skipLine);

    Thread.sleep(6000); // I want the user to be able to read along with the terminal, it outputs so
    // fast

    playingWithNumbers numbersPrintOut = new playingWithNumbers(); // calls the playingWithNumbers
                                                                   // class I made
    numbersPrintOut.numbers();
    System.out.print(skipLine);

    Thread.sleep(6000); // I want the user to be able to read along with the terminal, it outputs so
    // fast

    laundryDay laundryPrintOut = new laundryDay(); // calls the laundryDay class I made
    laundryPrintOut.laundry();
    System.out.print(skipLine);

    Thread.sleep(6000); // I want the user to be able to read along with the terminal, it outputs so
    // fast

    loopDeeLoops loopsPrintOut = new loopDeeLoops(); // calls the loopDeeLoops class
    loopsPrintOut.loops();
    System.out.println(skipLine);

    System.out.println(goodbye); // Ending print statement that shows the program is at the end
  }

}
