/*
Problem:3731. Missing Number
Platform: LeetCode
Difficulty: Easy

Time Complexity: O(n)
Space Complexity: O(1)*/


import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find minimum and maximum
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        // Check every number in the range
        for (int i = min; i <= max; i++) {
            boolean found = false;

            // Search linearly in the array
            for (int num : nums) {
                if (num == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                ans.add(i);
            }
        }

        return ans;
    }
}