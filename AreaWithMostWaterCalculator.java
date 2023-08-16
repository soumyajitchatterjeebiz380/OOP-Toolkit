package probelms;
/*
 * @author soumyajit
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
 * 
 */
public class AreaWithMostWaterCalculator {
	public int maxArea(int[] height) {
        int maxWater = 0;
        int start = 0;
        int end = height.length -1;

        while(start < end) {
            int width = end - start;
            int length = Math.min(height[start], height[end]);
            int totalArea = width * length;
            maxWater = Math.max(maxWater, totalArea);
            if(height[start] < height[end] ) {
                start++;
            }else{
                end--;
            }
        }

        return maxWater;
    }
}
