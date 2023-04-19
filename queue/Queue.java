import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    private List<T> queue = new ArrayList<T>();

    public void push(T value) {
        queue.add(value);
    }

    public T pop() {
        T value = queue.get(0);
        queue.remove(0);
        return value;
    }

    public int size() {
        return queue.size();
    }

    public T front() {
        return queue.get(0);
    }

    public T back() {
        return queue.get(size() - 1);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        var queue = new Queue<Integer>();

        for (int i = 0; i < 10; i++) {
            queue.push(i);
        }

        System.out.println(queue.back());

        while (!queue.isEmpty()) {
            if (queue.front() % 2 == 0) {
                System.out.println(queue.front());
            }
            queue.pop();
        }
    }
}