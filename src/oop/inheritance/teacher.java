package oop.inheritance;

public class teacher extends person {
	
	public teacher(String name) {
		super(name);	
		System.out.println("Inside the teacher constructor");
	}
	
  public void teach() {
	  super.eat();
	  System.out.println("Teacher is teaching");
  }
}
//Super keyword: is is used to refer immediate parent class of a child class.