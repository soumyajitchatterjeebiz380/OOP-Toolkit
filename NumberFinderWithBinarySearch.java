package probelms;
/**
 * 
 * @author soumyajit
 * find number in array with binary search
 *
 */
public class NumberFinderWithBinarySearch {
	public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        
        while(left <= right) {
            int middle = left + (right - left) / 2;
            if(nums[middle] == target) {
                return middle;
            }else if(target < nums[middle]) {
                right = middle -1;
            }else{
                left = middle + 1;
            }
        }
        
        return -1;
    }
}
