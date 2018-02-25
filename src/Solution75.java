import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-11-24
 * Time: 15:00
 */
public class Solution75 {
    public void sortColors(int[] nums) {
        if (nums.length == 0) {
            return;
        }

        final int color = 3;

        int[] count = new int[color];
        Arrays.fill(count, 0);

        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        Arrays.fill(nums, 0, count[0], 0);
        Arrays.fill(nums, count[0], count[0] + count[1], 0);
        Arrays.fill(nums, count[0] + count[1], count[0] + count[1] + count[2], 0);

        return;
    }
}
