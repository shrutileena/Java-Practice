package patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		/*
		for (int i=0; i<n; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
		for (int i=1; i<=n-1; i++) {
			for (int j=1; j<=n-i+1-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		int rows = 2*n -1;
		for (int i=1; i<=rows; i++) {
			
			if (i <= n) {
				for(int j=1; j<=i; j++) {
					System.out.print("* ");
				}	
			} else {
				for(int j=1; j<=rows-i+1; j++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
	}

}
