package probelms;

/*
 *  Use simple binary search  to find number in sorted array
 * 
 */
public class SortedArrayNumberFinder {
	
	private int[] input; 
	
	public SortedArrayNumberFinder(int[] input) {
		this.input = input;
	}
	
	public int find(int target) {
		
		int left = 0;
		int right = input.length-1;
		
		while(left <= right) {
			int middle = left + (right-left)/2;
			if(this.input[middle] == target) {
				return middle;
			}else if(target < this.input[middle]) {
				right = middle -1;
			}else {
				left = middle + 1;
			}
		}
		
		return -1;
		
	}
}
