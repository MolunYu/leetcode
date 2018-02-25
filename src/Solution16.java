import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:3sumClosest
 * User: System_ID
 * Date: 2017-10-13
 * Time: 21:34
 */
public class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int offset = Integer.MAX_VALUE;
        boolean pos;

        for (int i = 0; i < nums.length - 2; i++) {
            int front = i + 1;
            int back = nums.length - 1;
            int tempTarget = target - nums[i];

            while (front < back) {
                if (Math.abs(offset) > Math.abs(tempTarget - nums[front] - nums[back]))
                    offset = tempTarget - nums[front] - nums[back];

                if (nums[front] + nums[back] < tempTarget) front++;
                else if (nums[front] + nums[back] > tempTarget) back--;
                else return target;
                while (nums[i] == nums[i + 1] && i < nums.length - 2) i++;
            }
        }

        return target - offset;
    }
}
