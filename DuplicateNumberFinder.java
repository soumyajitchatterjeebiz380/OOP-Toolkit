package probelms;
import java.util.ArrayList;
import java.util.List;

/*
 * A class used to find duplicates in an array filled with numbers 
 * [1,n] where n represents length of the array. Returns a list.
 */
public class DuplicateNumberFinder {
	
	private int[] input;
	private List<Integer> res;
	
	public DuplicateNumberFinder(int[] input) {
		 this.input = input;
		 res = new ArrayList<>();
	}
	
	
	public List<Integer> find() {
		
		for(int start = 0; start < this.input.length; start++) {
			int currIndex = Math.abs(this.input[start])-1;
			if(this.input[currIndex] < 0) {
				this.res.add(Math.abs(start+1));
			}
			this.input[currIndex] = -this.input[currIndex];
		}
		
		return this.res;
	}
	
	
	
}
