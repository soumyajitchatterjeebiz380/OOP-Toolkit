package probelms;
/**
 * 
 * @author soumyajit
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
 *
 */

public class BitsCalculator {
	private int input;

	public int getInput() {
		return input;
	}

	public void setInput(int input) {
		this.input = input;
	}

	public BitsCalculator(int input) {
		super();
		this.input = input;
	}
	
	public int[] countBits() {
        int[] res = new int[input+1];
        res[0] = 0;
        for(int i = 1; i <= input; i++) {
            res[i] = res[i&(i-1)] + 1;
        }
        return res;
    }
	
	
}
