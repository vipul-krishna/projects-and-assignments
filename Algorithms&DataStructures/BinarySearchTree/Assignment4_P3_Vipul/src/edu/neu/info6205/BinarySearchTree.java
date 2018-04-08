package edu.neu.info6205;

public class BinarySearchTree {
	
	private Node root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	public void insert(int key) {
		root = insertNewNode(root, key);
	}
	
	public Node insertNewNode(Node root, int key) {
		
		if(root==null) {
			root  = new Node(key);
			return root;
		}
		
		if(key < root.key)
			root.left = insertNewNode(root.left, key);	  
		else if(key > root.key)
			root.right = insertNewNode(root.right, key);
		
		return root;
	}
	
	public void callInorder() {
		printInorder(root);
	}
	
	public void printInorder(Node root) {
		if(root != null) {
			printInorder(root.left);
			System.out.println(root.key);
			printInorder(root.right);
		}
		
	}

}
