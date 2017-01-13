package com.albion.spiral;

import java.util.ArrayList;
import java.util.List;

/**
 * http://www.programcreek.com/2013/01/leetcode-spiral-matrix-java/
 * https://leetcode.com/problems/spiral-matrix/
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int i, k = 0, l = 0;

    /*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator
    */

        while (k < m && l < n) {
        /* Print the first row from the remaining rows */
            for (i = l; i < n; ++i) {
                // System.out.print(" " + matrix[k][i]);
                result.add(matrix[k][i]);
            }
            k++;

        /* Print the last column from the remaining columns */
            for (i = k; i < m; ++i) {
                // System.out.print(" " + matrix[i][n - 1]);
                result.add(matrix[i][n-1]);
            }
            n--;

        /* Print the last row from the remaining rows */
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    // System.out.print(" " + matrix[m - 1][i]);
                    result.add(matrix[m-1][i]);
                }
                m--;
            }

        /* Print the first column from the remaining columns */
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    // System.out.print(" " + matrix[i][l]);
                    result.add(matrix[i][l]);
                }
                l++;
            }
        }
        return result;
    }
}
