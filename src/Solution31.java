import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-10-16
 * Time: 21:37
 */
public class Solution31 {
    public static void main(String[] args) {
        int[] a = {2, 3, 1};
        Temp.nextPermutation(a);
        System.out.println(Arrays.toString(a));
    }


}

class Temp {
    public static void nextPermutation(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return;
        int i = 0;
        while (i < nums.length - 1 && nums[i] >= nums[i + 1]) i++;
        if (i == nums.length - 1) {
            Arrays.sort(nums);
            return;
        }

        int highBit = 0;
        int lowBit = -1;

        for (int j = nums.length - 1; j > 0; j--) {
            int k = j - 1;
            while (k >= highBit && nums[k] >= nums[j]) k--;
            if (k < highBit) continue;
            else if (k > highBit) {
                highBit = k;
                lowBit = j;
            } else {
                if (lowBit < 0 || (nums[lowBit] > nums[j])) lowBit = j;
            }
            if (j <= highBit) break;
        }

        System.out.println("lowBit = " + lowBit);
        System.out.println("highBit = " + highBit);
        //nums[highBit] += nums[lowBit];
        //nums[lowBit] = nums[highBit] - nums[lowBit];
        //nums[highBit] -= nums[lowBit];
//
        //Arrays.sort(nums, highBit + 1, nums.length);
    }
}