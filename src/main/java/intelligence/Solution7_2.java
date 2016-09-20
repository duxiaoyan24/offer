package intelligence;

/**
 * Created by BFD_308 on 2016/9/19.
 */

import java.util.LinkedList;
import java.util.Queue;

// 两个队列实现一个栈
public class Solution7_2 {
    Queue<Integer> queue1 = new LinkedList<Integer>();
    Queue<Integer> queue2 = new LinkedList<Integer>();

    public static void main(String[] args) throws Exception {
        Solution7_2 solution = new Solution7_2();
        solution.push(1);
        solution.push(3);
        solution.push(5);
        System.out.println(solution.pop());
        System.out.println(solution.pop());
        solution.push(7);
        System.out.println(solution.pop());
        System.out.println(solution.pop());

    }

    public void push(int node) {
        if (!queue1.isEmpty())
            queue1.add(node);
        else
            queue2.add(node);
    }

    public int pop() {
        if (!queue1.isEmpty()) {
            while (queue1.size() > 1) {
                queue2.add(queue1.poll());
            }
            return queue1.poll();
        } else {
            while (queue2.size() > 1) {
                queue1.add(queue2.poll());
            }
            return queue2.poll();
        }

    }
}
