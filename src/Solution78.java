import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-11-27
 * Time: 20:42
 */
public class Solution78 {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> collect = new ArrayList<List<Integer>>();
        ArrayList<Integer> element = new ArrayList<Integer>();
        collect.add(element);
        getSets(nums, collect, element, 0, nums.length - 1);
        return (List<List<Integer>>) collect;
    }

    void getSets(int[] nums, ArrayList<List<Integer>> collect, ArrayList<Integer> element, int begin, int end) {
        if (element.size() == nums.length) {
            return;
        }

        for (int i = begin; i <= end; i++) {
            element.add(nums[i]);
            collect.add((ArrayList<Integer>) element.clone());
            getSets(nums, collect, element, i + 1, end);
            element.remove(element.size() - 1);
        }
    }
}
