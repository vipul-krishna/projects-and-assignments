package edu.neu.info6205;

public class BSTDriver {

	public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree();
		Node root = tree.getRoot();
		
		///////Minimum Element of the Tree//////
		tree.minElement(root);
		
		//////////////TREE Traversals///////////
		System.out.println("Printing Inorder Traversal:");
		new Traversal().printInorder(root);
		System.out.println();
		
		System.out.println("Printing Preorder Traversal:");
		new Traversal().printPreorder(root);
		System.out.println();
		
		System.out.println("Printing Postorder Traversal:");
		new Traversal().printPostorder(root);
		System.out.println();

	}

}
