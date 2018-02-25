import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-12-01
 * Time: 21:43
 */
public class Solution91 {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0)
            return 0;

        int[] record = new int[s.length() + 1];
        record[0] = 1;
        record[1] = s.charAt(0) == '0' ? 0 : 1;

        for (int i = 2; i < record.length; i++) {
            int oneWay = Integer.valueOf(s.substring(i - 1, i));
            int twoWay = Integer.valueOf(s.substring(i - 2, i));

            if (oneWay != 0) {
                record[i] += record[i - 1];
            }
            if (twoWay >= 10 && twoWay <= 26) {
                record[i] += record[i - 2];
            }
        }

        return record[record.length - 1];
    }
}
