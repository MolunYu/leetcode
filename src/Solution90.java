import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-12-01
 * Time: 21:33
 */
public class Solution90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<List<Integer>> collect = new ArrayList<List<Integer>>();
        ArrayList<Integer> element = new ArrayList<Integer>();
        collect.add(element);
        Arrays.sort(nums);
        getSets(nums, collect, element, 0, nums.length - 1);
        return (List<List<Integer>>) collect;
    }

    void getSets(int[] nums, ArrayList<List<Integer>> collect, ArrayList<Integer> element, int begin, int end) {
        if (element.size() == nums.length) return;

        for (int i = begin; i <= end; i++) {
            element.add(nums[i]);
            collect.add((ArrayList<Integer>) element.clone());
            while (i < end && nums[i] == nums[i + 1]) i++;
            getSets(nums, collect, element, i + 1, end);
            element.remove(element.size() - 1);
        }
    }
}
