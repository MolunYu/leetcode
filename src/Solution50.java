/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-11-12
 * Time: 13:46
 */
public class Solution50 {
    public double myPow(double x, int n) {
        double result = 1;
        double val = x;
        long tempN=n;
        long posN = Math.abs(tempN);

        while (posN > 0) {
            if ((posN & 1) == 1) {
                result *= val;
            }
            posN >>= 1;
            val *= val;
        }
        return n > 0 ? result : 1 / result;
    }
}
