package intelligence;

/**
 * Created by BFD_308 on 2016/9/21.
 */
public class Solution14 {
    public void reOrderArray(int[] array) {
        int p1 = 0;
        int p2 = array.length - 1;
        int tmp;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & 1) == 1) {
                tmp = array[i];
                array[i] = array[p1];
                array[p1] = tmp;
                p1++;
            } else {
                tmp = array[i];
                array[i] = array[p2];
                array[p2] = tmp;
                p2--;
            }
        }

    }
}
