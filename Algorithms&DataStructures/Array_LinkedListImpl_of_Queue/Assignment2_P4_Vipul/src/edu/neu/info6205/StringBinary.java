package edu.neu.info6205;

public class StringBinary {
	
	public int countStringBinary(int number) {
		if(number<=2) {
			return number+1;
		}
		else {
			return (countStringBinary(number-1)+countStringBinary(number-2));
		}
		
	}

}
