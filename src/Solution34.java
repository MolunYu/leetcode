/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-10-24
 * Time: 20:28
 */
public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        if (nums.length == 0) return result;
        if (nums[0] > target) return result;
        if (nums[nums.length - 1] < target) return result;
        if (nums.length == 1) {
            if (nums[0] == target) {
                result[0] = result[1] = 0;
                return result;
            } else return result;
        }

        int tagLeft = 0;
        int tarRight = nums.length - 1;

        int left = 0;
        int right = nums.length - 1;
        int len = Integer.MAX_VALUE;

        while (left <= right && right - left != len) {
            len = right - left;

            if (nums[left] == target) break;
            int mid = (left + right) / 2;
            if (nums[mid] < target) left = mid + 1;
            else if (nums[mid] >= target) right = mid;
        }

        if (nums[left] != target) return result;
        result[0] = left;

        left = 0;
        right = nums.length - 1;
        len = Integer.MAX_VALUE;
        while (left <= right && right - left != len) {
            len = right - left;

            if (nums[right] == target) break;
            int mid = (left + right) / 2;
            if (right - left == 1) mid = right;
            if (nums[mid] > target) right = mid - 1;
            else if (nums[mid] <= target) left = mid;
        }

        result[1] = right;

        return result;
    }
}
