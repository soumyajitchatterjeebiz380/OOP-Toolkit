package probelms;
import java.util.Arrays;

/**
 * 
 * @author soumyajit
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 *
 */
public class MisingNumberFinder {
	public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int midpt = (left) + (right-left)/2;
            if(nums[midpt] == midpt) {
                left = midpt + 1;
            }else{
                right = midpt - 1;
            }
        } 

        return left;

    }
}
