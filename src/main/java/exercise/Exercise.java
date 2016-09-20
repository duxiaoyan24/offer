package exercise;

/**
 * Created by BFD_308 on 2016/9/6.
 */

// newcoder.com
// 我的首页 > 收藏的试题 > 以下Java程序的执行结果是什么？
public class Exercise {

    public static void main(String[] args) throws Exception {
        Integer var1 = new Integer(1);
        Integer var2 = var1;
        doSomething(var2);
        System.out.println(var1.intValue());
        System.out.println(var1 == var2);
        System.out.println(var2.intValue());
    }

    public static void doSomething(Integer integer) {
        integer = new Integer(2);
    }


}
