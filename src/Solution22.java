import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-10-15
 * Time: 14:49
 */
public class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> collect = new ArrayList<String>();
        String str = "";
        matchGenerator(collect, str, 0, 0, n);
        return collect;
    }

    public void matchGenerator(List<String> collect, String str, int open, int close, int max) {
        if (str.length() == max * 2) {
            collect.add(str);
            return;
        }

        if (open < max) matchGenerator(collect, str + "(", open + 1, close, max);
        if (close < open) matchGenerator(collect, str + ")", open, close + 1, max);
    }
}
