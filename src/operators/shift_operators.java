package operators;

public class shift_operators {
	public static void main(String[]args) {
		//leftshift
		System.out.println(10<<2); //10*2^2
		System.out.println(10<<4); //10*2^4
	
		//rightshift
		System.out.println(10>>2); //10/2^2
		System.out.println(10>>4); //10/2^4
		
		// >>>shift
		//for positive number >>> works same as >>
		//fro negative number >> changes parity bit(MSB) to 0
		System.out.println(-30>>>2);
	}
}
