import java.util.ArrayList;

/**
 * Created with longelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-10-15
 * Time: 21:17
 */
public class Solution29 {
    public int divide(int dividend, int divisor) {
        if ((divisor == 0) || (dividend == Integer.MIN_VALUE && divisor == -1)) return Integer.MAX_VALUE;
        if (divisor == 1) return dividend;
        if (divisor == -1) return -dividend;

        long posDividend = Math.abs((long) dividend);
        long posDivisor = Math.abs((long) divisor);
        long tempDivisor = posDivisor;

        int result = 0;

        while (posDividend >= posDivisor) {
            int step = 1;

            while (posDividend >= (posDivisor << 1)) {
                posDivisor <<= 1;
                step <<= 1;
            }
            posDividend -= posDivisor;
            posDivisor = tempDivisor;
            result += step;
        }

        if ((dividend < 0) ^ (divisor < 0)) result = -result;

        return result;
    }
}
