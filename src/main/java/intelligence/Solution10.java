package intelligence;

/**
 * Created by BFD_308 on 2016/9/20.
 */
public class Solution10 {
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            ++count;
            n = n & (n - 1);
        }
        return count;
    }
}
