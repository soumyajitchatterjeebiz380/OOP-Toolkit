package probelms;

/*1870. Minimum Speed to Arrive on Time

 * You are given a floating-point number hour, representing the amount of time you have to reach the office. To commute to the office, you must take n trains in sequential order. You are also given an integer array dist of length n, where dist[i] describes the distance (in kilometers) of the ith train ride.

Each train can only depart at an integer hour, so you may need to wait in between each train ride.

For example, if the 1st train ride takes 1.5 hours, you must wait for an additional 0.5 hours before you can depart on the 2nd train ride at the 2 hour mark.
Return the minimum positive integer speed (in kilometers per hour) that all the trains must travel at for you to reach the office on time, or -1 if it is impossible to be on time.

Tests are generated such that the answer will not exceed 107 and hour will have at most two digits after the decimal point.

 * 
 * 
 */

public class MinimumTimeToFindSpeedToArriveOnTimeFinder {
	public int minSpeedOnTime(int[] dist, double hour) {
        if(hour < dist.length - 1) return -1;
        long left = 1; 
        long right = (long)1e9;

        while(left <= right) {
            long mid = (left+right)/2;
            if(isValid(dist, (int)mid, hour)) right = mid - 1;
            else left = mid+1;
        }

        return left > 1e7 ? -1 : (int)left;
    }

    public boolean isValid(int[] dist, int speed, double hour) {
        double time = 0;
        for(int i = 0; i < dist.length; i++) {
            time = Math.ceil(time);
            time += (double) dist[i] / speed;
            if(time > hour) return false;
        }
        return true;
    }
}
