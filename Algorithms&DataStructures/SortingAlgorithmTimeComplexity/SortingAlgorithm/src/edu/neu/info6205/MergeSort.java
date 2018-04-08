package edu.neu.info6205;

/*
 * Author - Vipul Krishna
 */

public class MergeSort {
	
	public void implementMergeSort(double arr[], int l, int r) {
		
		if(l<r) {
			int m = (l+r)/2;
			implementMergeSort(arr, l, m);
			implementMergeSort(arr, m+1, r);
			mergeSubArrays(arr, l, m, r);
		}
	}
	
	public void mergeSubArrays(double arr[], int l, int m, int r) {
		
		int n1 = m-l+1;
		int n2 = r-m;
		
		double leftArr[] = new double[n1];
		double rightArr[] = new double[n2];
		
		
		for(int i=0; i<n1; i++) {
			leftArr[i] = arr[l+i];
		}
		for(int j=0; j<n2; j++) {
			rightArr[j]  = arr[m+1+j];
		}
		int i = 0;
		int j = 0;
		int k = l;
		while(i<n1 && j<n2) {
			if(leftArr[i] >= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
				k++;
			}
			else {
				arr[k] = rightArr[j];
				j++;
				k++;
			}
		}
		while(i<n1) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
		
	}

}
