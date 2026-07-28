/*
Problem: 66. Plus One
Platform: LeetCode
Difficulty: Easy

Approach:
- Traverse the array from the last digit to the first.
- If the current digit is less than 9, increment it and return the array.
- If the digit is 9, change it to 0 and continue carrying over.
- If all digits are 9, create a new array of size n + 1 with the first element as 1.

Time Complexity: O(n)
Space Complexity: O(1)
(Note: O(n) only when a new array is created in the all-9s case.)
*/

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}

