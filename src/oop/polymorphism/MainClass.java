package oop.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		dog d = new dog();
		
		pet p = d;
		animal a = d;
//Run-time polymorphism		
		d.walk();
		p.walk();
		
*/
		greetings("Good Morning", 2);
	}
	
	public static void greetings() {
		System.out.println("Hello there!");
	
	}
	public static void greetings(String s, int count) {
		for(int i =0; i<count; i++) {
		System.out.println(s);
	}
		}
	
//Compile-time polymorphism

}
//Variable can not be overrided but method.