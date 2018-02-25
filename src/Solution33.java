import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-10-22
 * Time: 19:43
 */
public class Solution33 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if (nums.length == 0) return -1;
        if (nums.length == 1) {
            if (nums[0] == target) return 0;
            else return -1;
        }
        if (nums[(left + right) / 2] >= nums[left] && nums[(left + right) / 2] <= nums[right])
            return myBinarySearch(nums, target, 0);

        while (nums[left] < nums[left + 1]) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[left]) left = mid;
            else right = mid;
        }
        return myBinarySearch(nums, target, left + 1);
    }

    public int myBinarySearch(int[] nums, int target, int start) {
        int left = start;
        int right = start - 1 + nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid % nums.length] == target) return mid % nums.length;
            else if (nums[mid % nums.length] < target) left = mid + 1;
            else right = mid - 1;
        }
        if (left <= right) return ((left + right) / 2) % nums.length;
        else return -1;
    }
}
