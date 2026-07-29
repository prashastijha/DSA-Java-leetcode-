/*
Problem: 3Sum
Platform: LeetCode
Difficulty: Medium

Time Complexity: O(n²)
- Sorting: O(n log n)
- Two-pointer traversal: O(n²)

Space Complexity: O(1)
- Constant extra space (excluding the output list).
*/

import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
       List<List<Integer>> ans=new ArrayList<>();
       for(int i=0;i<n;i++)
       {
        if(i>0&&nums[i]==nums[i-1])
        continue;
        int j=i+1;
        int k=n-1;
        while(j<k)
        {
            int sum=nums[i]+nums[j]+nums[k];
            if(sum>0)
               k--;
            else if(sum<0)
              j++;
            else{
              ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
              j++;
              k--;
               while (j<k&& nums[j] == nums[j - 1]) j++;
                    while (j<k && nums[k]==nums[k+1]) k--;
              }

            }
              
        }
        return ans;
       }
       
    }
