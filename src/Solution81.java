/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-12-01
 * Time: 13:33
 */
public class Solution81 {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if (nums.length == 0) return false;
        if (nums.length == 1) {
            if (nums[0] == target) return true;
            else return false;
        }
        if (nums[(left + right) / 2] >= nums[left] && nums[(left + right) / 2] <= nums[right])
            return myBinarySearch(nums, target, 0);

        while (nums[left] <= nums[left + 1]) {
            int mid = (left + right) / 2;
            if (nums[mid] >= nums[left]) left = mid;
            else right = mid;
        }
        return myBinarySearch(nums, target, left + 1);
    }

    public boolean myBinarySearch(int[] nums, int target, int start) {
        int left = start;
        int right = start - 1 + nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid % nums.length] == target) return true;
            else if (nums[mid % nums.length] < target) {
                while (mid + 1 <= right && nums[mid % nums.length] == nums[(mid + 1) % nums.length]) {
                    mid++;
                }
                if (mid != right)
                    left = mid + 1;
            } else {
                while (mid - 1 >= left && nums[mid % nums.length] == nums[(mid - 1) % nums.length]) {
                    mid--;
                }
                if (mid != left)
                    right = mid - 1;
            }
        }
        return false;
    }
}
