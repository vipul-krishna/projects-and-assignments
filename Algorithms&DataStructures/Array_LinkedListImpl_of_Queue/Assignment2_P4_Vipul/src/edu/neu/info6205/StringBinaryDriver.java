package edu.neu.info6205;

import java.util.Scanner;

public class StringBinaryDriver {

	public static void main(String[] args) {
		

		StringBinary obj  = new StringBinary();
		System.out.println("The number of binary strings of the "
				+ "passed length without two consecutive 0's is = "+obj.countStringBinary(1));
		
		System.out.println("The number of binary strings of the "
				+ "passed length without two consecutive 0's is = "+obj.countStringBinary(2));
		
		System.out.println("The number of binary strings of the "
				+ "passed length without two consecutive 0's is = "+obj.countStringBinary(3));
		System.out.println("The number of binary strings of the "
				+ "passed length without two consecutive 0's is = "+obj.countStringBinary(4));
	}

}
