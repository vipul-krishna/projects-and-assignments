/*
 * Author - Vipul Krishna
 */

package edu.neu.info6205;

public class SumDigits {

	public int getSumDigits(int number) throws IllegalArgumentException {
		int sum = 0;
		if (number == 0) {
			return sum;
		} else if(number > 0){
			
			sum = (number % 10) + getSumDigits(number / 10);
			return sum;
		}
		else {
			throw new IllegalArgumentException("Number must be positive. Negative numbers not allowed");
		}
	}
}
