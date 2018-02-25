import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-10-14
 * Time: 20:24
 */
public class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (nums.length < 4) return result;

        for (int head = 0; head < nums.length - 3; head++) {
            for (int i = head + 1; i < nums.length - 2; i++) {
                int front = i + 1;
                int back = nums.length - 1;
                int temptarget = target - nums[i] - nums[head];

                while (front < back) {
                    if (nums[front] + nums[back] < temptarget) front++;
                    else if (nums[front] + nums[back] > temptarget) back--;
                    else {
                        List<Integer> temp = new ArrayList<Integer>();
                        temp.add(nums[head]);
                        temp.add(nums[i]);
                        temp.add(nums[front]);
                        temp.add(nums[back]);
                        result.add(temp);

                        while (nums[front] == temp.get(2) && front < back) front++;
                        while (nums[back] == temp.get(3) && front < back) back--;
                    }
                }
                while (nums[i] == nums[i + 1] && i < nums.length - 2) i++;
            }
            while (nums[head] == nums[head + 1] && head < nums.length - 3) head++;
        }

        return result;
    }
}
