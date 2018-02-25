import java.util.ArrayList;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-11-18
 * Time: 13:06
 */
public class Solution60 {
    public String getPermutation(int n, int k) {
        ArrayList<Integer> element = new ArrayList<Integer>();
        int[] baseNum = new int[n];
        int[] sequence = new int[n];
        int tempN = 1;
        for (int i = 0; i < n; i++) {
            element.add(i);
            baseNum[i] = tempN;
            tempN *= tempN + 1;
        }
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                k /= baseNum[n - 2 - i];
                sequence[i] = k / baseNum[n - 2 - i];
            } else {
                sequence[n - 1] = k;
            }
        }

        String s = "";
        for (int i = 0; i < n; i++) {
            s += String.valueOf(element.get(sequence[i]));
            element.remove(sequence[i]);
        }
        return s;
    }
}
