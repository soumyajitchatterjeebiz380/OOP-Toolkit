package probelms;
/*
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
 * 
 * 
 */
public class MaxConsecutiveOnesIIICalculator {
	public int longestOnes(int[] nums, int k) {
        int sp = 0;
        int flip = 0;
        int maxLen = -1;

        for(int ep = 0; ep < nums.length; ep++) {
            if(nums[ep] == 0) flip += 1;
            while(flip > k) {
                if(nums[sp] == 0) flip--;
                sp++;
            }
            maxLen = Math.max(maxLen, ep - sp + 1); 
        }

        return maxLen;
    }
}
