// class containing all word definitions
public class wordDefinitions {
  public static void words() {
    String skipLine = "\n"; // string instead of system out to make a new line
    String newBlock =
        "================================================================================================================================"
            + "\n================================================================================================================================";
    System.out.println(newBlock);// I like the look of this in the console

    // definition of variable
    String variableDefinition =
        "Variable: In computer programming, is something that typically is given a name, type, and value"
            + "\nwhich can be able to change, or can be set to never change. ";
    System.out.println(variableDefinition);
    System.out.print(skipLine);

    // definition of scope
    String scopeDefinition =
        "Scope: The scope is the reqion of your code that is defining a specific variable or running"
            + "\nthrougth a set of instructions, such as like the scope of the above values of"
            + "\ndataTypes is defined by whatever is inside the class named dataTypes.";
    System.out.println(scopeDefinition);
    System.out.print(skipLine);


    // Identifying a method call and the arguments
    String identify =
        "\n//public class wordDefinitions { <== this is starting the class, and naming it wordDefinitions"
            + "\n//   static void words() { <== words is the Method name, which would be called in main  "
            + "\n//       block of code     <== to reuse the class, block of code would contain any and"
            + "\n//   }                     <== all arguments and statements"
            + "\n//}                        <== this will be the end to the class";
    System.out.println(identify);// the header would be public class word definitions and parameter
                                 // would be words()

  }

}
