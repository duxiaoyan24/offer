package intelligence;

import java.util.ArrayList;

/**
 * Created by BFD_308 on 2016/9/22.
 */
public class Solution20 {

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        if (matrix == null) return null;
        if (matrix.length == 0) return null;

        ArrayList<Integer> result = new ArrayList<Integer>();
        int row1 = 0;
        int row2 = matrix.length - 1;
        int col1 = 0;
        int col2 = matrix[0].length - 1;
        while ((row1 <= row2) && (col1 <= col2)) {
            if (row1 == row2 && col1 == col2) {
                result.add(matrix[row1][col1]);
                break;
            }

            for (int i = col1; i <= col2; i++) {
                result.add(matrix[row1][i]);
            }
            row1++;
            for (int i = row1; i <= row2; i++) {
                result.add(matrix[i][col2]);
            }
            col2--;
            for (int i = col2; i <= col1; i--) {
                result.add(matrix[row2][i]);
            }
            row2--;
            for (int i = row2; i <= row1; i--) {
                result.add(matrix[i][col1]);
            }
            col1++;
        }
        return result;
    }
}
