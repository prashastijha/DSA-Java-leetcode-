/*
Leetcode Problem:54. Spiral Matrix

Algorithm:
1. Initialize four pointers:
   - top = 0
   - bottom = rows - 1
   - left = 0
   - right = cols - 1
2. Traverse the matrix layer by layer:
   - Move left to right across the top row.
   - Move top to bottom along the right column.
   - If rows remain, move right to left across the bottom row.
   - If columns remain, move bottom to top along the left column.
3. Shrink the boundaries after each traversal.
4. Repeat until all elements are processed.

Time Complexity: O(m × n)
Space Complexity: O(1) (excluding the result list)
*/

import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            // left -> right
            for (int j = left; j <= right; j++) {
                ans.add(matrix[top][j]);
            }
            top++;

            // top -> bottom
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            // right -> left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    ans.add(matrix[bottom][j]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ans;
    }
}