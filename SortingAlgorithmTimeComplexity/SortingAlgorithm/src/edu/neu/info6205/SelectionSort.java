package edu.neu.info6205;

/*
 * Author - Vipul Krishna
 */

public class SelectionSort {
	
	public void implementSelectionSort(double arr[]) {
		int length = arr.length;
		for(int i = 0; i<length-1; i++) {
			int max = i;
			for(int j = i+1; j<length; j++) {
				if(arr[j] > arr[max]) {
					max = j;
				}
				
			}
			double temp = arr[max];
			arr[max] = arr[i];
			arr[i] = temp;
		}
//		for(int i=0; i < 10; i++) {
//    		System.out.println(arr[i]);
//    	}
	}

}
