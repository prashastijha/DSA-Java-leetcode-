/*
Problem: Remove Duplicates from Sorted Arrray
Platform: LeetCode
Difficulty: Easy

Approach:
 * - Traverse the array once while maintaining a HashMap.
 * - Store each number as the key and its index as the value.
 * - For every element, calculate its complement (target - current element).
 * - If the complement already exists in the HashMap, return the indices.
 * - Otherwise, add the current element and its index to the HashMap.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Concepts Used:
 * - HashMap
 * - Arrays
 * - One-pass traversal
 *
 * LeetCode: https://leetcode.com/problems/two-sum/
*/

package Arrays;

import java.util.Scanner;

public class Solution {
    public int removeDuplicates(int[] nums) {
        Scanner sc=new Scanner(System.in);
        if(nums.length==0)
        return 0;
        int k=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1]){
            nums[k]=nums[i];
            k++;
            }
        }
        return k;
    }
} {
    
}
