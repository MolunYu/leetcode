/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-11-12
 * Time: 14:51
 */
public class Solution55 {
    public boolean canJump(int[] nums) {
        int i = 0;
        for (int reach = nums[0]; i < nums.length && i <= reach; i++) {
            reach = Math.max(reach, i + nums[i]);
        }
        return i == nums.length;
    }
}
