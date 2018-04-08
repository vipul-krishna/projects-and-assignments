package edu.neu.info6205;

/*
 * Author - Vipul Krishna
 */

public class HeapSort {
	
	public void implementHeapSort(double[] arr) {
		int length = arr.length;
        for (int i = (length / 2) - 1; i >= 0; i=i-1) {
            heapify(arr, length, i);
        }
        for (int i=length-1; i>=0; i=i-1)
        {
            double temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
//        for(int i=0; i < 10; i++) {
//    		System.out.println(arr[i]);
//    	}
	}
	
	public void heapify(double arr[], int heapSize, int node){
		
		int max = node;
        int l = (node*2) + 1;
        int r = (node*2) + 2;

        if (l < heapSize && arr[l] < arr[max])
            max = l;
        if (r < heapSize && arr[r] < arr[max])
            max = r;
        if (max != node)
        {
            double swap = arr[node];
            arr[node] = arr[max];
            arr[max] = swap;
            heapify(arr, heapSize, max);
        }
		
	}

}
