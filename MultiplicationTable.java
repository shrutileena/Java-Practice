package loops;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//int result = 0;
		
		for (int i=1; i<=11; i++) {
			
			for (int j=1; j<=20; j++) {
				System.out.print(j * i + "  ");				
			}
			
			System.out.println();
		}
	}

}
