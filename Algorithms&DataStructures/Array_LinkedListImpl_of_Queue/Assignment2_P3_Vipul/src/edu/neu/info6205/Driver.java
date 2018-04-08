/*
 * Author - Vipul Krishna
 */

package edu.neu.info6205;

public class Driver {

	public static void main(String[] args) {
		
		SumDigits sumDigits = new SumDigits();
		System.out.println("Sum of the digits of the number = "+sumDigits.getSumDigits(9867));
		System.out.println("Sum of the digits of the number = "+sumDigits.getSumDigits(12));
		System.out.println("Sum of the digits of the number = "+sumDigits.getSumDigits(322));
		System.out.println("Sum of the digits of the number = "+sumDigits.getSumDigits(0));
	}

}
