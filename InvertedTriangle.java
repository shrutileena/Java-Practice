package patterns;

import java.util.Scanner;

public class InvertedTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		/*for (int i=n; i>0; i--) {
			for (int j=i; j>0; j--) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}*/
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n-i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}