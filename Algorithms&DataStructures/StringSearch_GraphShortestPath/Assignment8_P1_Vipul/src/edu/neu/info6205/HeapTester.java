package edu.neu.info6205;

public class HeapTester {
	
	public void runTests(){
		   MaxHeap<String> maxHeap = new MaxHeap<String>();
		   maxHeap.addElement("John");
		   maxHeap.addElement("Paul");
		   maxHeap.addElement("George");
		   maxHeap.addElement("Ringo");
		   maxHeap.addElement("Elmer");
		   maxHeap.addElement("Zorro");
		   System.out.println(maxHeap);
		   maxHeap.removeMax();
		   System.out.println(maxHeap);
		   
		}
		public static void main(String[] args) {
		  HeapTester mht = new HeapTester();
		  mht.runTests();
		  
		  
		   System.out.println();
		   System.out.println("**********Min Heap Test*************");
		   
		   MinHeap<String> minHeap = new MinHeap<String>();
		   minHeap.addElement("John");
		   minHeap.addElement("Paul");
		   minHeap.addElement("George");
		   minHeap.addElement("Ringo");
		   minHeap.addElement("Elmer");
		   minHeap.addElement("Zorro");
		   System.out.println(minHeap);
		   
		}

	
}
