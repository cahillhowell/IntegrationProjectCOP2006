import java.util.Scanner;

/*
 * Programmer - Cahill Howell Date Started - 5/18/2020 Version 1.10.7 Version Key -
 * Major.Minor.Micro
 * 
 * This program is designed to be a work-out program that has a multitude of work-outs to do. The
 * program will function as hopefully an interactive form to get random work-outs, grouped by
 * similar structures, like arms, legs, core, etc. It will ask the user what type of grouping they
 * want to try, then it will ask the intensity like, easy, medium, or hard. Then it will pick
 * through that library of work-outs and output like 5-6 different ones along with reasonable
 * amounts of reps or timing for that work-out.
 * 
 * Good luck and have fun!
 */



public class main {
  public static void main(String[] args) {

    System.out.println("This is a workout randomizer!");
    System.out.println(" ");
    System.out.println("Is working out cool?");
    boolean workoutsAreCool = true;
    System.out.println(workoutsAreCool);
    System.out.println(" ");
    System.out.println("Let's start by asking a few questons.");

    System.out.println("What is your name? Please answer First Last.");
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
    System.out.println(" ");

    System.out.println("How tall are you? Please answer in inches.");
    Scanner scan1 = new Scanner(System.in);
    int height = scan1.nextInt();
    System.out.println(" ");

    System.out.println("What is your weight? Please answer in XXX.X");
    Scanner scan2 = new Scanner(System.in);
    double weight = scan2.nextDouble();
    System.out.println(" ");

    System.out.println("How old are you?");
    Scanner scan3 = new Scanner(System.in);
    int age = scan3.nextInt();
    System.out.println(" ");

    System.out.println(name + " " + height + " " + weight + " " + age);
    System.out.println("Everything look good?");
    System.out.println("Great lets get started!");

    System.out.println("What would you like to try today?");
    System.out.println(" ");
    System.out.println("Arm Workouts = 1");
    System.out.println("Leg Workouts = 2");
    System.out.println("Abdominal Workouts = 3");
    System.out.println("Cardio Drills = 4");
    System.out.println(" ");
    System.out.println("Please type the number of");
    System.out.println("the library you'd like to attempt.");

    Scanner scan4 = new Scanner(System.in);
    int a = scan4.nextInt();
    System.out.println("Great Choice! " + a);

  }
}
