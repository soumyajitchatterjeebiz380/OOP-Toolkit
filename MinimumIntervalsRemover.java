package probelms;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 
 * @author soumyajit
 * Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.
 *
 */
public class MinimumIntervalsRemover {
	public int eraseOverlapIntervals(int[][] intervals) {
        Comparator<int[]> ac = (int[] a, int[] b) -> a[0] - b[0];
        Arrays.sort(intervals, ac);
        int currMin = intervals[0][1];
        int cntr = 0;

        for(int i = 1; i < intervals.length; i++) {
            if(currMin > intervals[i][0]) {
                currMin = Math.min(currMin, intervals[i][1]);
                cntr++;
            }else{
                currMin = intervals[i][1];
            }
        }

        return cntr;
        
    }
}
