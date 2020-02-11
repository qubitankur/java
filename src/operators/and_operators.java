package operators;

public class and_operators {

	public static void main(String[] args) {
		/* logical && operator doesn't check for second condition if first option is false.
		 * bitwise & operator checks for both condition
		 */	
	int a = 10;
	int b = 5;
	int c = 30;
	
	System.out.println(a<b&&a<c);   //false && true = false
	System.out.println(a<b&a<c);    //false & true = false
	
	}
}
