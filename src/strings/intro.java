package strings;

public class intro {

	public static void main(String[] args) {
	String name = "tenma";
	name = name + "-online";
	String cars = "Hyndai,Lamborghini,Ferrari";
	String allcars[]= cars.split(",");
	for(String car: allcars) {
		System.out.println(car);
	}
	
	System.out.println(name.concat(" is here"));
	
	
	
	}

}
