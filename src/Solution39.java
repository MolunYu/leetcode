import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-10-25
 * Time: 20:28
 */
public class Solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> collect = new ArrayList<List<Integer>>();
        Stack<Integer> result = new Stack<Integer>();
        int sum = 0;
        backTrack(collect, result, candidates, sum, target, 0);
        return collect;
    }

    public void backTrack(ArrayList<List<Integer>> collect, Stack<Integer> result, int[] candidates, int sum, int target, int start) {
        if (sum > target) return;
        if (sum == target) collect.add((List<Integer>) result.clone());
        if (sum < target) {
            for (int i = start; i < candidates.length; i++) {
                result.push(candidates[i]);
                backTrack(collect, result, candidates, sum + candidates[i], target, i);
                result.pop();
            }
        }
    }
}
