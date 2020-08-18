package loops;

import java.util.Scanner;

public class PrimeAnotherMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		boolean isPrime = true;
		
		if (n < 2)
			isPrime = false;
		
		for (int i=2; i * i<=n; i++) {
			
			if (n % i == 0) {
				isPrime = false;
				break;
			}
			
		}
		
		if (isPrime == true)
			System.out.println("It is a prime number");
		else
			System.out.println("It is not a prime number");
		
	}

}