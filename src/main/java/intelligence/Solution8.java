package intelligence;

/**
 * Created by BFD_308 on 2016/9/20.
 */
public class Solution8 {

    public int minNumberInRotateArray(int[] array) {
        int preNum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < preNum) {
                return array[i];
            }
            preNum = array[i];
        }
        return preNum;

    }
}
