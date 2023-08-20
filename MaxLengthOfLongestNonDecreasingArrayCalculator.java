package probelms;

/*
 * You are given two 0-indexed integer arrays nums1 and nums2 of length n.

Let's define another 0-indexed integer array, nums3, of length n. For each index i in the range [0, n - 1], you can assign either nums1[i] or nums2[i] to nums3[i].

Your task is to maximize the length of the longest non-decreasing subarray in nums3 by choosing its values optimally.

Return an integer representing the length of the longest non-decreasing subarray in nums3.

Note: A subarray is a contiguous non-empty sequence of elements within an array.
 * 
 * 
 */

public class MaxLengthOfLongestNonDecreasingArrayCalculator {
	private int[] input1;
	private int[] input2;
	public MaxLengthOfLongestNonDecreasingArrayCalculator(int[] input1, int[] input2) {
		super();
		this.input1 = input1;
		this.input2 = input2;
	}
	public int[] getInput1() {
		return input1;
	}
	public void setInput1(int[] input1) {
		this.input1 = input1;
	}
	public int[] getInput2() {
		return input2;
	}
	public void setInput2(int[] input2) {
		this.input2 = input2;
	}
	
	public int calculate() {
		int res = 1, dp1 = 1, dp2 = 1, n= input1.length, t11,t12,t21,t22;
        for(int i = 1; i < n; i++) {
            t11 = input1[i-1] <= input1[i] ? dp1 + 1: 1;
            t12 = input1[i-1] <= input2[i] ? dp1 + 1: 1;
            t21 = input2[i-1] <= input1[i] ? dp2 + 1: 1;
            t22 = input2[i-1] <= input2[i] ? dp2 + 1: 1;
            dp1 = Math.max(t11, t21);
            dp2 = Math.max(t12, t22);
            res = Math.max(res, Math.max(dp1, dp2));
        }
        return res;
	}
	
}
