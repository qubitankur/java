package oop;

public class static_keyword {
	
	static {
		System.out.println("Hey there!"); ///executes before main function(static block)
	}

	class Person{
	int age;
	String name;
	
	final static String breed = "Homo sepians";
}
	public static void main(String[] args) {
	System.out.println(Math.PI);
	}
}
