package oop.abstraction;

public class wagonr extends car {
	
	public void accelerate() {
		System.out.println("WagonR is accelerating");
	}
	@Override
	public void braking() {
		System.out.println("WagonR is braking");
	}

}
