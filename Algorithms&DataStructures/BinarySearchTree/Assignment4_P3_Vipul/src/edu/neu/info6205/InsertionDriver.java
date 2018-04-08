package edu.neu.info6205;

public class InsertionDriver {

	public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(30);
		tree.insert(40);
		tree.insert(23);
		tree.insert(58);
		tree.insert(48);
		tree.insert(26);
		tree.insert(11);
		tree.insert(13);
		
		tree.callInorder();
	}

}
