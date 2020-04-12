package oop;
import java.util.*;

	 class Box{
		  double width;
		  double height; //instance_variables, currently no method contained 
		  double depth;
	public void height(){
	
		}
	  }
	 public class class_oop {

    public static void main(String[] args) {
    	Box mybox = new Box(); //creating an actual object : allocate a box object : : declaring reference to object.
		double vol;
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter width - ");  
		double width= sc.nextDouble();  
		System.out.print("Enter height- ");  
		double height= sc.nextDouble();  
		System.out.print("Enter depth- ");  
		double depth= sc.nextDouble();  


		
		mybox.width = width;
		mybox.height = height;
		mybox.depth = depth;
		
		vol =  mybox.width* mybox.height* mybox.depth;
		System.out.println("Hey the volume is "+ vol);
	 }
}
