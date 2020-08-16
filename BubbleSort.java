package Sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int a[] = {2, 1, 8, -3, 6, 4, 12};
		int n = a.length;
		
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		// Advanced for loop (for each loop)
		for(int item: a) {
			System.out.print(item + " ");
		}*/
		
		// Optimized code - the already sorted part from the end of an array is not being checked again in next iteration
		int a[] = {2, 1, 8, -3, 6, 4, 12};
		int n = a.length;
		
		for(int i=0; i<n-1; i++) { 
			// So, instead of n-1 we have written n-1-i: so for first iteration the loop execute for 
			// n-1 times, for second iteration it will run for n-2 times and so on.
			
			// Also, we have made a check for checking whether the array is sorted or not, if it is sorted 
			// and no swaps are being made in an iteration, we will come out of the loop and display the result
			
			boolean sorted = true;
			
			for(int j=0; j<n-1-i; j++) {
				
				if(a[j] > a[j+1]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					
					sorted = false;
				}
				
			}
			if(sorted) break;
		}
		// Advanced for loop (for each loop)
		for(int item: a) {
			System.out.print(item + " ");
		}
	}

}
