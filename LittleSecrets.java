// practice with private, make this class contain fields, a getter and setter, like a car year, make, model, and color. 2 cars
public class LittleSecrets { // used LittleSecrets as the class name, use this to call to the Main class
	public static void secrets() {
		String skipLine = "\n"; // string to use less memory than System.out.println(" ");
		String newBlock = "================================================================================================================================"
				+ "\n================================================================================================================================";
		String secretGreeting = "Utilizing private fields, methods, and constructors. You will see a few car types, listing"
				+ "\nthe car's respective year, make, model, and color!";
		System.out.println(newBlock); // prints the new block string to separate things

		System.out.println(secretGreeting);
		System.out.print(skipLine);

		// Starts VehicleOne and then will call the class named VehicleOne
		VehicleOne truck = new VehicleOne();
		// list of variables I want to see in the console
		truck.getYear();
		truck.getMake();
		truck.getModel();
		truck.getColor();
		// now print those out onto one line
		System.out.println(truck.getYear() + " " + truck.getMake() + " " + truck.getModel() + " " + truck.getColor());

		// Starts VehicleTwo and then will call the other class
		VehicleTwo car = new VehicleTwo();
		// list of variables I want to see in the console
		car.getYear();
		car.getMake();
		car.getModel();
		car.getColor();
		// now print those out onto one line
		System.out.println(car.getYear() + " " + car.getMake() + " " + car.getModel() + " " + car.getColor());

	}
}

// Class for the truck
class VehicleOne {

	private String setYear = "2007";
	private String setMake = "Toyota";
	private String setModel = "Tacoma";
	private String setColor = "Maroon";

	// methods for setting the year
	public void setYear(String year) {
		setYear = year;
	}

	public String getYear() {
		return setYear;
	}
	// end of method setting for year

	// methods for setting the make
	public void setMake(String make) {
		setMake = make;
	}

	public String getMake() {
		return setMake;
	}
	// end of method setting for make

	// methods for setting the model
	public void setModel(String model) {
		setModel = model;
	}

	public String getModel() {
		return setModel;
	}
	// end of method setting for model

	// methods for setting the color
	public void setColor(String color) {
		setColor = color;
	}

	public String getColor() {
		return setColor;
	}
	// end of method setting for color
}

// class for the car
class VehicleTwo {

	private String setYear = "2020";
	private String setMake = "Ford";
	private String setModel = "Shelby Mustang";
	private String setColor = "Wimbledon White";

	// methods for setting the year
	public void setYear(String year) {
		setYear = year;
	}

	public String getYear() {
		return setYear;
	}
	// end of method setting for year

	// methods for setting the make
	public void setMake(String make) {
		setMake = make;
	}

	public String getMake() {
		return setMake;
	}
	// end of method setting for make

	// methods for setting the model
	public void setModel(String model) {
		setModel = model;
	}

	public String getModel() {
		return setModel;
	}
	// end of method setting for model

	// methods for setting the color
	public void setColor(String color) {
		setColor = color;
	}

	public String getColor() {
		return setColor;
	}
	// end of method setting for color
}
