package methods;

public class passbyvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 30;
		int d = 20;
		
		swap(c,d);
		System.out.print(c+" "+d );

	}
	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
//Java is always pass by value.