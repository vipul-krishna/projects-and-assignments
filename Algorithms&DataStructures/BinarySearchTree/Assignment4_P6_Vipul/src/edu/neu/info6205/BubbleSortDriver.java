package edu.neu.info6205;

public class BubbleSortDriver {

	public static void main(String[] args) {
		double m = Math.random()*1000;
		System.out.println(m);
		int[] array = {5, 1, 12, -4, 20, -9};
		BubbleSort object = new BubbleSort();
		double startTime = System.nanoTime();
		object.bubbleSortAnArray(array);
		double endTime = System.nanoTime();
		System.out.println("Time Taken = "+(endTime-startTime));

	}

}
