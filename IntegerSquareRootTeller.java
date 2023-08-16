package probelms;
/**
 * 
 * @author soumyajit
 * return true if square root is a n integer
 *
 */
public class IntegerSquareRootTeller {
	public boolean isPerfectSquare(int num) {
        long right = num;
        long left = 1;
        while(left <= right) {
            long midpt = left + (right - left) / 2;
            if(midpt * midpt == num) return true;
            if(midpt * midpt < num) {
                left = midpt + 1;
            }else{
                right = midpt - 1;
            }
        }
        return false;
    }
}
