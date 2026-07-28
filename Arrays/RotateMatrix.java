/*
Problem:48. Rotate Image

Algorithm:
1. Transpose the matrix:
   - Swap elements across the main diagonal.
2. Reverse every row:
   - Swap the leftmost and rightmost elements,
     moving inward until the row is reversed.
3. The resulting matrix is the original matrix
   rotated 90° clockwise.

Time Complexity: O(n²)
Space Complexity: O(1)
*/

import java.util.*;
class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int row=0;row<=n-1;row++)
        {
            reverse(matrix,row);
        }
    }
    static void reverse(int[][]matrix,int row){
        int n=matrix[row].length;
        int i=0;
        int j=n-1;
        while(i<=j){
            int temp=matrix[row][i];
            matrix[row][i]=matrix[row][j];
            matrix[row][j]=temp;
            i++;
            j--;
        }
    }
}

