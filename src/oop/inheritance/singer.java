package oop.inheritance;

public class singer extends person {
	
	public singer(String name) {
		super(name);
		
	}
	public void sing() {
		System.out.println(name + " is Singing");
	}

}
