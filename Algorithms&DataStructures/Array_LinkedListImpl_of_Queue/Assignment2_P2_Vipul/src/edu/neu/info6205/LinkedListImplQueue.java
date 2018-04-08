/*
 * Author - Vipul Krishna
 */

package edu.neu.info6205;

public class LinkedListImplQueue {

	private Node headNode;
	private Node tailNode;
	
	public LinkedListImplQueue() {
		this.headNode = this.tailNode = null;
	}
	
	public boolean isEmpty() {
		if(this.tailNode == null) {
			return true;
		}
		return false;
	}
	
	public void enQueue(String element) {
		
		Node tempNode = new Node(element);
		if(isEmpty()) {
			this.headNode = this.tailNode = tempNode;
			System.out.println("Element added to LinkedList is: "+element);
			return;
		}
		this.tailNode.next = tempNode;
		this.tailNode = tempNode;
		System.out.println("Element added to LinkedList is: "+element);
		
	}
	public String deQueue() {
		
		if(isEmpty()) {
			System.out.println("Container is empty. Nothing removed");
			return null;
		}
		 
		String element = this.headNode.item;
		this.headNode = this.headNode.next;
		if(this.headNode == null) {
			this.tailNode = null;
		}
		return element;
	
	}
	

}

