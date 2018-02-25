import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:3sum
 * User: System_ID
 * Date: 2017-10-13
 * Time: 21:33
 */
public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (nums.length<3) return result;
        if (nums[0] > 0) return result;
        if (nums[nums.length - 1] < 0) return result;

        for (int i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
            int front = i + 1;
            int back = nums.length - 1;
            int target = -nums[i];

            while (front < back) {
                if (nums[front] + nums[back] < target) front++;
                else if (nums[front] + nums[back] > target) back--;
                else {
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[front]);
                    temp.add(nums[back]);
                    result.add(temp);

                    while (nums[front] == temp.get(1) && front < back) front++;
                    while (nums[back] == temp.get(2) && front < back) back--;
                }
            }
            while (nums[i] == nums[i + 1] && i < nums.length - 2) i++;
        }

        return result;
    }
}
