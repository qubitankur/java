package constructors;

class Vehicle {
	int wheels;
	int mirrors;
	Vehicle(){
		wheels = 4;
		mirrors = 2;
		
	}
}

public class intro {

	public static void main(String[] args) {
	Vehicle car = new Vehicle();
	Vehicle car2 = new Vehicle();
	
	
	
	System.out.println(car.wheels +" wheels");

	System.out.println(car2.mirrors +" mirrors");

	}

}
// Using constructor to define certain properties for same species as all vehicle has 2 mirrors and 4 wheels.