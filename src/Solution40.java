import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-10-25
 * Time: 21:23
 */
public class Solution40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<List<Integer>> collect = new ArrayList<List<Integer>>();
        Stack<Integer> result = new Stack<Integer>();
        int sum = 0;
        Arrays.sort(candidates);
        backTrack2(collect, result, candidates, sum, target, 0);
        return collect;
    }

    public void backTrack2(ArrayList<List<Integer>> collect, Stack<Integer> result, int[] candidates, int sum, int target, int start) {
        if (sum > target) return;
        if (sum == target) collect.add((List<Integer>) result.clone());
        if (sum < target) {
            for (int i = start; i < candidates.length; ) {
                result.push(candidates[i]);
                backTrack2(collect, result, candidates, sum + candidates[i], target, i + 1);
                while (i < candidates.length - 1 && candidates[i] == candidates[i + 1]) i++;
                i++;
                result.pop();
            }
        }
    }
}
