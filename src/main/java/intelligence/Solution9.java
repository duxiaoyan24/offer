package intelligence;

/**
 * Created by BFD_308 on 2016/9/19.
 */
public class Solution9 {
    public static void main(String[] args) throws Exception {
        Solution9 solution = new Solution9();
        System.out.println(solution.Fibonacci(10));
        System.out.println(solution.Fibonacci2(10));
    }

    public int Fibonacci(int n) {
        if (n < 0)
            return -1;
        else if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    public int Fibonacci2(int n) {
        if (n < 0)
            return -1;
        else if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else {
            int fibMinusOne = 1;
            int fibMinusTwo = 0;
            int fibN = 0;
            for (int i = 2; i <= n; i++) {
                fibN = fibMinusOne + fibMinusTwo;
                fibMinusTwo = fibMinusOne;
                fibMinusOne = fibN;
            }
            return fibN;
        }
    }
}
