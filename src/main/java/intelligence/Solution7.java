package intelligence;

/**
 * Created by BFD_308 on 2016/9/19.
 */

import java.util.Stack;

// 两个栈实现一个队列
public class Solution7 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public static void main(String[] args) throws Exception {


    }

    public void push(int node) {
        stack1.push(node);

    }

    public int pop() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
