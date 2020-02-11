package loops;

public class for_loops {

	public static void main(String[] args) {
		for(int i = 1; i<=3; i++) {
			System.out.println(i);
		}
//nested loops
		//printing the pyramid
		for(int i=1; i<=7;i++){
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(); //newline
		}
//for-each loop
		int arr[]= {2,45,6,7};
		for(int i:arr) {
			System.out.println(i);
		}
//labeled for loop
		aa:
			for(int i=1;i<=3;i++) {
			bb:
				for(int j=1;j<=3;j++) {
					if(i==2 && j==2) {
						break aa; //if break bb,it will break inner loop.
					}
					System.out.println(i+" "+j);
				}
			}

//infinite loop
		for(;;) {
			//code
		}
	}
}
