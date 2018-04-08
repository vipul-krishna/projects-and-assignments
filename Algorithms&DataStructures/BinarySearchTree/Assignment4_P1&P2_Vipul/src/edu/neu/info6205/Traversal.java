package edu.neu.info6205;

public class Traversal {
	
	public void printInorder(Node root) {
		if(root != null) {
			printInorder(root.left);
			System.out.print(root.key+" ");
			printInorder(root.right);
		}
	}
	
	public void printPreorder(Node root) {
		if(root != null) {
			System.out.print(root.key+" ");
			printPreorder(root.left);
			printPreorder(root.right);
		}
	}

	public void printPostorder(Node root) {
		if(root != null) {
			printPostorder(root.left);
			printPostorder(root.right);
			System.out.print(root.key+" ");
		}
	}

}
