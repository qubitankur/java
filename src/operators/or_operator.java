package operators;

public class or_operator {

	public static void main(String[] args) {
		/* logical || operator doesn't check for second condition if first option is true.
		 * bitwise | operator checks for both condition is true or false
		 */	
		int a = 12;
		int b = 6;
		int c = 20;
	System.out.println(a>b||a>c);
	System.out.println(a>b|a>c);
	System.out.println(a>b||a++<c);
	System.out.println(a); //12 because 2nd condition is not checked 
	System.out.println(a>b|a++<c); 
	System.out.println(a); //13 becuase 2nd condition is checked
	
	
	}

}
