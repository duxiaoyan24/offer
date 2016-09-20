package intelligence;

/**
 * Created by BFD_308 on 2016/9/20.
 */
public class Solution10 {
    public int NumberOf1(int n) {
        int count = 0;
        int result;
        if (n >= 0) result = n;
        else result = n * (-1);
        while (result != 0) {
            count += result % 2;
            result = result / 2;
        }
        return count;
    }
}
