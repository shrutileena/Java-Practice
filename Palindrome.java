package loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int reversedNumber = 0; 
		
		while(temp > 0) {
			
			int lastDigit = temp % 10;
			reversedNumber = reversedNumber * 10 + lastDigit;
			temp /= 10;
			
		}
		
		if (reversedNumber == n) {
			System.out.println("It is a Palindrome");
		} else {
			System.out.println("It is not a Palindrome");
		}
		
		
	}

}
