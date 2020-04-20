package oop.abstraction;

public class RepairClass {
	
	public static void repairCar(car car) {
		System.out.println("Car is repaired");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wagonr wagonR = new wagonr();
		audi Audi = new audi();
		
		repairCar(wagonR);
		repairCar(Audi);
		
		

	}
}
