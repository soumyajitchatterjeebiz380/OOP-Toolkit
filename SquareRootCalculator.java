package probelms;

/**
 * 
 * @author soumyajit
 * find square root of a number with binary search
 *
 */
public class SquareRootCalculator {
	public long findSquareRoot(int num) {
        long right = num;
        long left = 1;
        while(left <= right) {
            long midpt = left + (right - left) / 2;
            if(midpt * midpt == num) return midpt;
            if(midpt * midpt < num) {
                left = midpt + 1;
            }else{
                right = midpt - 1;
            }
        }
        return -1;
    }
}
