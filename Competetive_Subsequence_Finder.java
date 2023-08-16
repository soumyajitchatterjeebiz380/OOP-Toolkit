package probelms;
import java.util.Stack;

public class Competetive_Subsequence_Finder {
	
	private int[] input_array;
	private int[] result;
	private int size_of_subsequence;
	private Stack<Integer> monotonic_stack;
	
	public Competetive_Subsequence_Finder(int[] input_array, int size_of_subsequence) {
		this.input_array = input_array;
		this.size_of_subsequence = size_of_subsequence;
		this.result = new int[size_of_subsequence];
	}
	
	public int[] find() {
		for(int idx = 0; idx < input_array.length; idx++ ) {
			while(!monotonic_stack.isEmpty() && input_array[idx] < input_array[monotonic_stack.peek()] && input_array.length - idx + monotonic_stack.size() > size_of_subsequence) {
				monotonic_stack.pop();
			}
			if(monotonic_stack.size() < size_of_subsequence) {
				monotonic_stack.push(idx);
			}
		}
		for(int resIdx = size_of_subsequence - 1; resIdx >= 0; resIdx--) {
			result[resIdx] = input_array[monotonic_stack.pop()];
		}
		
		return result;
	}
	
	
}
