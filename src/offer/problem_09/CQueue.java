package offer.problem_09;

import java.util.Deque;
import java.util.LinkedList;

public class CQueue {
    private Deque<Integer> deque1;
    private Deque<Integer> deque2;

    public CQueue() {
        deque1 = new LinkedList<>();
        deque2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        deque1.push(value);
    }

    public int deleteHead() {
        if (deque2.isEmpty()) {
            while (!deque1.isEmpty()) {
                deque2.push(deque1.pop());
            }
        }

        if (deque2.isEmpty()) {
            return -1;
        } else {
            int deleteItem = deque2.pop();
            return deleteItem;
        }
    }
}
