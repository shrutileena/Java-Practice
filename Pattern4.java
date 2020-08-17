package patterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("*");
		
		for (int i=2; i<=n-1; i++) {

			System.out.print("*");
			
			for (int j=1; j<= 2*i-3; j++) {
				System.out.print(" ");
			}
			
			System.out.print("*");
			System.out.println();
		}
		
		if (n > 1) {
			for (int j=1; j<=n; j++) {
				System.out.print("* ");
			}	
		}
	}

}
