/*
 * Author - Vipul Krishna
 */

package edu.neu.info6205;

public class TestLinkedListQueue {
	
	public static void main(String args[]) {
		LinkedListImplQueue dataList = new LinkedListImplQueue();
		
		System.out.println("Element Removed from the queue is: "+dataList.deQueue());
		System.out.println("***********************************************************");
		
		dataList.enQueue("to");
		dataList.enQueue("be");
		dataList.enQueue("or");
		dataList.enQueue("not");
		System.out.println("Element Removed from the queue is: "+dataList.deQueue());
		dataList.enQueue("to");
		dataList.enQueue("be");
		System.out.println("Element Removed from the queue is: "+dataList.deQueue());
		System.out.println("Element Removed from the queue is: "+dataList.deQueue());
		System.out.println("Is the queue empty: "+dataList.isEmpty());
	}
	

}
