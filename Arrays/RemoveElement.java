/*
Problem: 27. Remove Element
Platform: LeetCode
Difficulty: Easy

Approach:
- Use two pointers.
- Traverse the array with one pointer.
- Whenever an element is not equal to `val`, place it at the current write index.
- Increment the write index after each valid element.
- The first `k` elements of the array will contain the required result.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;
class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}