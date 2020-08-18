package introduction;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of students: ");
		int n = sc.nextInt();
		
		int marks[] = new int[n];
		int sum = 0;
		for (int i=0; i<n; i++) {
			System.out.println("Enter marks: ");
			marks[i] = sc.nextInt();
			sum += marks[i];
		}
		float avg = sum / n;
		System.out.println("Average Marks: " + avg);
	}

}
