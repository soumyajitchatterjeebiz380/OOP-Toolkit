package probelms;

public class JumpGameCalculator {
	
	private int[] inputArray;

	public JumpGameCalculator(int[] inputArray) {
		super();
		this.inputArray = inputArray;
	}

	public int[] getInputArray() {
		return inputArray;
	}

	public void setInputArray(int[] inputArray) {
		this.inputArray = inputArray;
	}
	
	public boolean calculate() {
		int limit = this.inputArray.length - 1;
		int start = 0;
		for(int end = this.inputArray.length - 1; end >= 0; end-- ) {
			if(end + this.inputArray[end] >= limit ) {
				limit = end;
			}
		}
		
		return limit == start;
	}	
	
	
	
	
}
