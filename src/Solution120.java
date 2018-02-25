import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-12-15
 * Time: 20:10
 */
public class Solution120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = 1; i < triangle.size(); i++) {
            List<Integer> level = triangle.get(i);
            level.set(0, level.get(0) + triangle.get(i - 1).get(0));
            for (int j = 1; j < level.size() - 1; j++) {
                level.set(j, level.get(j) + Math.min((triangle.get(i - 1).get(j - 1)), triangle.get(i - 1).get(j)));
            }
            level.set(level.size() - 1, level.get(level.size() - 1) + triangle.get(i - 1).get(level.size() - 2));
        }

        int result = Integer.MIN_VALUE;

        for (Integer i : triangle.get(triangle.size() - 1)) {
            result = Math.min(i, result);
        }

        return result;
    }
}
