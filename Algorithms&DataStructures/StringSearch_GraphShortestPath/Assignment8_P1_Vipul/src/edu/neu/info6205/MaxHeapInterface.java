package edu.neu.info6205;

public interface MaxHeapInterface<E>  {
	
	/**
	* Removes the maximum element from the heap and returns it.
	* @return
	*/
	public E removeMax();
	public E removeMin();

	/**
	* Adds the element passed in to the heap and puts it in its proper location in
	* the heap.
	* @param element
	*/
	public void addElement(E element);

	/**
	* Swaps the element at the index position passed in with the greater of its two
	* children if one of the children have a greater value.
	* @param index
	*/
	public void downMaxHeapify(int index);
	/**
	* Swaps the element at the index position passed in with its parent if the value
	* of the element stored at the index is larger than its parent.
	* @param index
	*/
	public void upMaxHeapify(int index);


}
