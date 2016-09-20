package intelligence;

/**
 * Created by BFD_308 on 2016/9/19.
 */
public class Solution9_2 {
    public static void main(String[] args) throws Exception {
        Solution9_2 solution = new Solution9_2();
        System.out.println(solution.jump1(5));
        System.out.println(solution.jump1(7));
    }

    // 青蛙跳1
    public int jump1(int n) {
        if (n <= 0)
            return -1;
        else if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        else {
            int fibMinusOne = 2;
            int fibMinusTwo = 1;
            int fibN = 0;
            for (int i = 3; i <= n; i++) {
                fibN = fibMinusOne + fibMinusTwo;
                fibMinusTwo = fibMinusOne;
                fibMinusOne = fibN;
            }
            return fibN;
        }
    }

    // 青蛙跳2 - 变态青蛙跳
    public int jump2(int n) {
        if (n == 0 || n == 1)
            return 1;
        int fibMinusOne = 1;
        int fibN = 0;
        for (int i = 2; i <= n; i++) {
            fibN = fibMinusOne * 2;
            fibMinusOne = fibN;
        }
        return fibN;
    }

    // 铺瓷砖
    public int tile(int n) {
        if (n < 0)
            return -1;
        else if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        else {
            int fibMinusOne = 2;
            int fibMinusTwo = 1;
            int fibN = 0;
            for (int i = 3; i <= n; i++) {
                fibN = fibMinusOne + fibMinusTwo;
                fibMinusTwo = fibMinusOne;
                fibMinusOne = fibN;
            }
            return fibN;
        }
    }

}
