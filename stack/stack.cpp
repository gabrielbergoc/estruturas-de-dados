#include <iostream>
#include <vector>

using namespace std;

template<typename T>
class Stack {
    public:
        void push(T value) {
            stack.push_back(value);
        }

        T pop() {
            T value = stack.back();
            stack.pop_back();
            return value;
        }

        int size() {
            return stack.size();
        }

        bool is_empty() {
            return size() == 0;
        }

        T top() {
            return stack.back();
        }

        T back() {
            return stack.front();
        }

    private:
        vector<T> stack;
};

int main() {
    Stack<int> stack;

    for (int i = 0; i < 10; i++) {
        stack.push(i);
    }

    cout << stack.back() << endl;

    while (!stack.is_empty()) {
        if (stack.top() % 2 == 0) {
            cout << stack.top() << endl;
        }
        stack.pop();
    }
}
