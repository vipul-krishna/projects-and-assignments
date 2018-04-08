/*
 * Author - Vipul Krishna
 */

package edu.neu.info6205;

public class ArrayImplQueue {

	public static void main(String[] args) {
		
		QueueOperations operations = new QueueOperations(5);
		
		System.out.println("Head Index = " +operations.getHeadIndex());
		System.out.println("Tail Index = " +operations.getTailIndex());
		System.out.println("Removed Value = "+operations.deQueue());
		System.out.println("**********************************************************");
		
		operations.enQueue(25);
		System.out.println("Head Index = " +operations.getHeadIndex());
		System.out.println("Tail Index = " +operations.getTailIndex());
		System.out.println("***********************************************************");
		
		System.out.println("Removed Value = "+operations.deQueue());
		System.out.println("************************************************************");
		
		operations.enQueue(23);
		operations.enQueue(88);
		operations.enQueue(12);
		operations.enQueue(15);
		operations.enQueue(6);
		
		operations.enQueue(23);
		System.out.println("Head Index = " +operations.getHeadIndex());
		System.out.println("Tail Index = " +operations.getTailIndex());
		
		

	}
}

class QueueOperations {
	private int head, tail, currentSize, capacity;
	private int driverArray[];
	
	public QueueOperations(int capacity) {
		this.capacity = capacity;
		driverArray = new int[this.capacity];
		head  = currentSize = 0;
		tail = -1;
	}
	
	public boolean isEmpty() {
		if(this.currentSize == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(this.currentSize == this.capacity) {
			return true;
		}
		return false;
	}
	
	public int getHeadIndex() {
		if(isEmpty()) {
			System.out.println("Container is empty. Nodes not created. Default return value set");
			return -1;
		}
		return this.head;
	}
	
	public int getTailIndex() {
		if(isEmpty()) {
			System.out.println("Container is empty. Nodes not created. Default return value set");
			return -1;
		}
		return this.tail;
	}
	
	public void enQueue(int element) {
		if(isFull()) {
			System.out.println("Maximum size reached. No more elements can be added");
			return;
		}
		this.tail = (this.tail+1)%this.capacity;
		this.driverArray[tail] = element;
		this.currentSize = this.currentSize+1;
		System.out.println("Element added to the Queue is = "+element);
		
		
	}
	
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("Container is empty. Nothing to delete. Minimum Integer returned");
			return Integer.MIN_VALUE;
		}
		int removedElement = this.driverArray[head];
		this.head = (this.head+1)%this.capacity;
		this.currentSize = this.currentSize - 1;
		return removedElement;
	}
}






















