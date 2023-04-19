package stack;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private List<T> stack = new ArrayList<T>();

    public void push(T value) {
        stack.add(value);
    }

    public T pop() {
        T value = stack.get(size() - 1);
        stack.remove(size() - 1);
        return value;
    }

    public int size() {
        return stack.size();
    }

    public T top() {
        return stack.get(size() - 1);
    }

    public T bottom() {
        return stack.get(0);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        var stack = new Stack<Integer>();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        System.out.println(stack.bottom());

        while (!stack.isEmpty()) {
            if (stack.top() % 2 == 0) {
                System.out.println(stack.top());
            }
            stack.pop();
        }
    }
}
