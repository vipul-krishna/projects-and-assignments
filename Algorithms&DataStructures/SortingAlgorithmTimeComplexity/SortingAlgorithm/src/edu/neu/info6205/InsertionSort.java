package edu.neu.info6205;

/*
 * Author - Vipul Krishna
 */

public class InsertionSort {

	public void implementInsertionSort(double arr[]){
    
        int length = arr.length;
        for (int i=1; i<length; ++i)
        {
            double key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] < key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
//        for(int i=0; i < 10; i++) {
//    		System.out.println(arr[i]);
//    	}
    }
	
}
