import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-10-27
 * Time: 14:35
 */
public class Solution43 {
    public String multiply(String num1, String num2) {
        int[] arithNum1 = new int[num1.length()];
        int[] arithNum2 = new int[num2.length()];
        int[] result = new int[num1.length() + num2.length()];

        for (int i = num1.length() + num2.length() - 1; i >= 0; i--) {
            if (i < num1.length())
                arithNum1[num1.length() - i - 1] = num1.charAt(i) - '0';
            if (i < num2.length())
                arithNum2[num2.length() - i - 1] = num2.charAt(i) - '0';
            result[i] = 0;
        }

        for (int i = 0; i < arithNum1.length; i++) {
            for (int j = 0; j < arithNum2.length; j++) {
                result[i + j] += (arithNum1[i] * arithNum2[j]) % 10;
                result[i + j + 1] += (arithNum1[i] * arithNum2[j]) / 10;
            }
        }

        String s = new String();

        int i = result.length - 1;
        while (i > 0 && result[i] == 0) i--;

        for (; i >= 0; i--) {
            s += Integer.toString(result[i]);
        }

        return s;
    }
}
