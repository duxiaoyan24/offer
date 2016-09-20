package intelligence;

/**
 * Created by BFD_308 on 2016/9/20.
 */
public class Solution12 {
    public static void main(String[] args) throws Exception {
        Solution12 solution = new Solution12();
        solution.print(3);
    }

    public void print(int n) {
        if (n < 0)
            System.out.println("Error Input - " + n);
        else if (n == 0)
            System.out.println(0);
        else {
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= 9; j++) {
                    if (((i - 1) * 10 + j) != 0) {
                        System.out.print((i - 1) * 10 + j);
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
