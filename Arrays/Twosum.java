package Arrays;

import java.util.HashMap;

public class Twosum {

    // Brute Force Approach
    // Time: O(n^2), Space: O(1)
    public static int[] twoSumBrute(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    // Optimized Approach using HashMap
    // Time: O(n), Space: O(n)
    public static int[] twoSumOptimized(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] brute = twoSumBrute(nums, target);
        System.out.println("Brute Force: " + brute[0] + ", " + brute[1]);

        int[] optimized = twoSumOptimized(nums, target);
        System.out.println("Optimized: " + optimized[0] + ", " + optimized[1]);
    }
}
