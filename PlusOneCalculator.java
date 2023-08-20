package probelms;

/*
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.
 * 
 * 
 */

public class PlusOneCalculator {
	private int[] input;

	public int[] getInput() {
		return input;
	}

	public void setInput(int[] input) {
		this.input = input;
	}

	public PlusOneCalculator(int[] input) {
		super();
		this.input = input;
	}
	
	public int[] calculate() {
		 int start = this.input.length - 1;
	        int carry = 1;
	        while(start != -1) {
	            if(this.input[start] + carry  == 10) {
	                carry = 1;
	                this.input[start] = 0;
	            }else{
	            	this.input[start] += carry;
	                 carry = 0;
	            }
	            start--;
	        }

	        if(carry == 1) {
	            int[] retArray = new int[this.input.length+1];
	            retArray[0] = 1;
	            for(int i = 0; i < this.input.length; i++) {
	                retArray[i+1] = this.input[i];
	            }
	            return retArray;
	        }

	        return this.input;
	}
}
