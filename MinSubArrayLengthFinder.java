package probelms;
/*
 * Given an input array, find the length of the minimum subarray 
 * where the contents of the subarray's sum is >= target
 * 
 */
public class MinSubArrayLengthFinder {
	
	private int[] input;
	private int target;
	
	public MinSubArrayLengthFinder(int[] input, int target) {
		this.input = input;
		this.target = target;
	}
	
	public int find() {
		int start = 0;
		int currentSum = 0;
		int minimumlength = Integer.MAX_VALUE;
		
		for(int end = 0; end < this.input.length; end++) {
			
			currentSum += this.input[end];
			
			
			while(currentSum >= this.target ) {
				minimumlength = Math.min(minimumlength, end-start+1);
				currentSum -= this.input[start];
				start++;
			}
			
		}
		
		return minimumlength == Integer.MAX_VALUE ? 0: minimumlength;
	}
	
	
	
}
