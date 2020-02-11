package control_statements;

public class ifelse_statement {
	public static void main(String[]args) {
		int year = 2020;
		
		if(((year%4 == 0)&&(year % 100 !=0)) || (year%400 ==0)) {
			System.out.println("Leap year!");
			
		}
		
		else System.out.println("Common year");
		/////////////////////////////////////////
		
		
		int num = 13;
		String output =
				(num%2==0)?"even number":"odd number";
		System.out.println(output);
		
		//ladder statement
		
		int mark = 55;
		
		if(mark<30) {
			System.out.println("Fail");
		}
		else if(mark>=50 && mark<60) {
			System.out.println("Grade D");
		}
		else if(mark>=60 && mark<70) {
			System.out.println("Grade C");
		}
		else if(mark>=70 && mark<80) {
			System.out.println("Grade B");
		}
		else if(mark>=80 && mark<90) {
			System.out.println("Grade A");
		}
		else if(mark>=90 && mark<100) {
			System.out.println("Grade A+");
		}
		else System.out.println("Invalid");
			
	//nested if else statement
		int age = 22;
		int weight = 60;
		
		if(age>=20) {
			if(weight>50) {
					System.out.println("You are eligible!");
			}
			else {
				System.out.println("You are not eligible!");
			}
		}
		else {
			System.out.println("Age must be greater than 21");
		}
	}
}
