package leetcode.problem_155;

import java.util.Arrays;

public class MinStack {
    private int min = Integer.MAX_VALUE;
    private int[] stack;
    private int index = 0;


    public MinStack() {
        stack = new int[100];
    }

    public void push(int val) {
        checkLength();
        min = Math.min(min, val);
        stack[index] = val;
        index++;
    }

    public void pop() {
        index--;
        for (int i = 0; i < index; i++) {
            min = Math.min(min, stack[i]);
        }
    }

    public int top() {
        return stack [index--];
    }

    public int getMin() {
        return min;
    }

    public void checkLength() {
        if (index >= stack.length - 1) {
//            stack = Arrays.copyOf(stack, stack.length 2);
        }
    }
}
