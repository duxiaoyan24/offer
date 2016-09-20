package intelligence;

/*
在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Solution2 {
    public static void main(String[] args) throws Exception {
        // newcoder.com 通过

    }

    public static boolean Find(int[][] array, int target) {
        int row = array.length;
        int col = array[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = col - 1; j >= 0; j--) {
                if (array[i][j] == target) return true;
                else if (target > array[i][j]) {
                    break;
                } else {
                    i -= 1;
                    col -= 1;
                    break;
                }
            }
        }
        return false;
    }
}
