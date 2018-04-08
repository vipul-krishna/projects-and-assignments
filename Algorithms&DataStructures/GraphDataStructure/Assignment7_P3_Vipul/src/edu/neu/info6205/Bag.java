package edu.neu.info6205;

import java.util.ArrayList;
import java.util.List;

public class Bag<Integer> {
	
	private int size;
	private List<Integer> bag;
	
	public Bag() {
		this.size = 0;
		bag = new ArrayList<>();
	}
	
	
	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public List<Integer> getBag() {
		return bag;
	}


	public void setBag(List<Integer> bag) {
		this.bag = bag;
	}


	public void add(Integer v1, int v2) {
		
		bag.add(v1);
		
	}
	
	public int size() {
		//return this.size;
		return this.bag.size();
	}
	
	public boolean isEmpty() {
		return this.bag.size()==0;
	}
	
	
	

}
