// class containing all word definitions
public class WordDefinitions {
	public static void words() {
		String skipLine = "\n"; // string instead of system out to make a new line
		String newBlock = "================================================================================================================================"
				+ "\n================================================================================================================================";
		System.out.println(newBlock);// I like the look of this in the console

		// definition of variable
		String variableDefinition = "Variable: In computer programming, is something that typically is given a name, type, and value"
				+ "\nwhich can be able to change, or can be set to never change. ";
		System.out.println(variableDefinition);
		System.out.print(skipLine);

		// definition of scope
		String scopeDefinition = "Scope: The scope is the reqion of your code that is defining a specific variable or running"
				+ "\nthrougth a set of instructions, such as like the scope of the above values of"
				+ "\ndataTypes is defined by whatever is inside the class named DataTypes.";
		System.out.println(scopeDefinition);
		System.out.print(skipLine);

		// Identifying a method call and the arguments
		String identify = "\n//public class WordDefinitions { <== this is starting the class, and naming it WordDefinitions"
				+ "\n//   static void words() { <== words is the Method name, which would be called in Main  "
				+ "\n//       block of code     <== to reuse the class, block of code would contain any and"
				+ "\n//   }                     <== all arguments and statements"
				+ "\n//}                        <== this will be the end to the class";
		System.out.println(identify);// the header would be public class word definitions and parameter
										// would be words()
		System.out.print(skipLine);
		
		String inheritanceDefinition = "Inheritance: The mechanism, or ability that a new class is derived from an existing class."
				+ "\nMeaning, you can efficiently use less code but using some of another classes attributes."
				+ "\nThere is some hierarchy that exists when using this, a class comes from a subclass, which"
				+ "\ncomes from a superclass. The superclass can have multiple subclasses."
				+ "\n"
				+ "\nThe main benefit of u/sing inheritance, is to have some reusability, as well as being able to lock"
				+ "\ndata to a specific class, so that certain data can't be accessed elsewhere. As well as overriding,"
				+ "\nor overloading as some say. Also, simply being able to extend a class created, to just add a"
				+ "\nfew features that weren't needed in the other class, but is needed for the class you're improving.";
		System.out.println(inheritanceDefinition);
		System.out.print(skipLine);
		
		String polymorphismDefinition = "Polymorphism: The normal description of poly means more than one, or many, morph"
				+ "\nmeans form. Java can use polymorphism to inherit methods and perform different actions without"
				+ "\nchanging any of the code from which is being borrowed from.";
		System.out.println(polymorphismDefinition);
		System.out.print(skipLine);
		
		
	}

}
