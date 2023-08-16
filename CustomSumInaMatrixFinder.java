package probelms;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/*
 * You are given a 0-indexed 2D integer array nums. Initially, your score is 0. Perform the following operations until the matrix becomes empty:

From each row in the matrix, select the largest number and remove it. In the case of a tie, it does not matter which number is chosen.
Identify the highest number amongst all those removed in step 1. Add that number to your score.
Return the final score.
 * 
 * 
 */
public class CustomSumInaMatrixFinder {
	
	private Integer[][] input;
	
	public CustomSumInaMatrixFinder(Integer[][] input) {
		this.input = input;
	}
	
	public int find() {
		
		int score = 0;
		
		for(int start = 0; start < this.input.length; start++) {
			Arrays.sort(input[start], Collections.reverseOrder());
		}
		
		for(int col = 0; col < input[0].length; col++) {
			PriorityQueue<Integer> minheap = new PriorityQueue<>();
			for(int row = 0; row < input.length; row++) {
				 minheap.add(input[row][col]);
			}
			score += minheap.poll();
			
		}
		
		return score;
	}
	
	
}
