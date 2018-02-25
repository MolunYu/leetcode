import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-12-01
 * Time: 20:24
 */
public class Solution89 {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < 1 << n; i++) {
            result.add(i ^ (i >> 1));
        }
        return result;
    }
}
