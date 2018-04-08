package edu.neu.info6205;

public class BubbleSort {
	
	public void bubbleSortAnArray(int[] array) {
		int length = array.length;
		for(int i = 0; i < length-1; i++) {
			boolean change = false;
			for(int j = 0; j < length-1-i ;j++){
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					//change = true;
				}
			}
			if (change == false)
				break;
		}
		System.out.println("**************Printing sorted array**********");
		for(int i = 0; i<length;i++) {
			System.out.println(array[i]);
		}
	}

}
