package probelms;

/*
 * 
 * An array arr is a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

You must solve it in O(log(arr.length)) time complexity.
 */

public class MaxPeakFinder {
	public int peakIndexInMountainArray(int[] arr) {
        int sp = 0;
        int ep = arr.length - 1;

        while(sp <= ep) {
            int mid = (sp+ep)/2;
            if(arr[mid-1] < arr[mid] && arr[mid+1] < arr[mid]) {
                return mid;
            }else if(arr[mid-1] < arr[mid] && arr[mid+1] > arr[mid]) {
                sp = mid +1;
            }else{
                ep = mid;
            }
        }
        return -2;
    }
}
