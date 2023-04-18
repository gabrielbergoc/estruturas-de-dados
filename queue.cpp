#include <iostream>
#include <vector>

using namespace std;

template<typename T>
class Queue {
    public:
        void push(T value) {
            queue.push_back(value);
        }

        T pop() {
            T value = queue.front();
            queue.erase(queue.begin());
            return value;
        }

        int size() {
            return queue.size();
        }

    private:
        vector<T> queue;
};

int main() {
    Queue<int> queue;

    for (int i = 0; i < 10; i++) {
        queue.push(i);
    }

    while (queue.size() > 0) {
        cout << queue.pop() << endl;
    }
}
