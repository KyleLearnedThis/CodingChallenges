package com.albion.matrices.spiral;

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
        int d = matrix.length;
        int r = matrix[0].length;
        int i;
        int u = 0;
        int l = 0;

    /**
     * u - starting row index
     * d - ending row index
     * l - starting column index
     * r - ending column index
     * i - iterator
     **/

        while (u < d && l < r) {
        /* Print the first row from the remaining rows */
            for (i = l; i < r; ++i) {
                // System.out.print(" " + matrix[u][i]);
                result.add(matrix[u][i]);
            }
            u++;

        /* Print the last column from the remaining columns */
            for (i = u; i < d; ++i) {
                // System.out.print(" " + matrix[i][r - 1]);
                result.add(matrix[i][r-1]);
            }
            r--;

        /* Print the last row from the remaining rows */
            if (u < d) {
                for (i = r - 1; i >= l; --i) {
                    // System.out.print(" " + matrix[d - 1][i]);
                    result.add(matrix[d-1][i]);
                }
                d--;
            }

        /* Print the first column from the remaining columns */
            if (l < r) {
                for (i = d - 1; i >= u; --i) {
                    // System.out.print(" " + matrix[i][l]);
                    result.add(matrix[i][l]);
                }
                l++;
            }
        }
        return result;
    }
}
