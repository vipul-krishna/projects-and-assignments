package edu.neu.info6205;

public class BinarySearchTree {
	
	Node root;
	public BinarySearchTree() {
		root = null;
		createTree();
	}
	
	public Node getRoot() {
		return root;
	}



	public void createTree() {
		root = new Node("A");
		
		/////Left Subtree////////
		
		root.left = new Node("B");
		root.left.right = new Node("D");
		root.left.right.left = new Node("G");
		root.left.right.left.left = new Node("I");
		
		/////////////Right Subtree//////////////
		root.right = new Node("C");
		root.right.left = new Node("E");
		root.right.right = new Node("F");
		
		root.right.left.right = new Node("H");
		root.right.left.right.left = new Node("J");
		root.right.left.right.right = new Node("K");
		
	}
	
	///////////////////Finding Min Element////////////////////////////////////////

	public void minElement(Node root) {
		while (root.left != null) {
			root = root.left;
		}
		System.out.println("The minimum element of the given tree is = "+root.key);
	}
	
	/////////////////////////////Min Element Ends//////////////////////////////////
	
	
	//////////////////////////INORDER TRAVERSAL STARTS//////////////////////////////
//	public void callInorder() {
//		System.out.println("Printing Inorder:");
//		printInorder(root);
//		System.out.println();
//	}
//	public void printInorder(Node root) {
//		if(root != null) {
//			printInorder(root.left);
//			System.out.print(root.key+" ");
//			printInorder(root.right);
//		}
//	}
//	//////////////////////////INORDER TRAVERSAL ENDS//////////////////////////////
//	
//	//////////////////////////PREORDER TRAVERSAL STARTS//////////////////////////////
//	public void callPreorder() {
//		System.out.println("Printing Preorder:");
//		printPreorder(root);
//		System.out.println();
//	}
//	public void printPreorder(Node root) {
//		if(root != null) {
//			System.out.print(root.key+" ");
//			printPreorder(root.left);
//			printPreorder(root.right);
//		}
//	}
//	//////////////////////////PREORDER TRAVERSAL ENDS//////////////////////////////
//	
//	//////////////////////////POSTORDER TRAVERSAL STARTS//////////////////////////////
//	public void callPostorder() {
//		System.out.println("Printing Postorder:");
//		printPostorder(root);
//		System.out.println();
//	}
//	public void printPostorder(Node root) {
//		if(root != null) {s
//			printPostorder(root.left);
//			printPostorder(root.right);
//			System.out.print(root.key+" ");
//		}
//	}
//	//////////////////////////POSTORDER TRAVERSAL ENDS//////////////////////////////

}
