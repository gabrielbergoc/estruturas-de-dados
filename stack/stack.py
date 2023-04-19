class Stack:
    def __init__(self):
        self.__stack = []
    
    def push(self, value):
        self.__stack.append(value)
    
    def pop(self):
        return self.__stack.pop()
    
    def size(self):
        return len(self.__stack)

    def is_empty(self):
        return self.size() == 0;

    def top(self):
        return self.__stack[-1]

    def bottom(self):
        return self.__stack[0]


if __name__ == '__main__':
    elements = [i for i in range(10)]
    stack = Stack()
    
    for element in elements:
        stack.push(element)
    
    print(stack.bottom())
    
    while not stack.is_empty():
        if stack.top() % 2 == 0:
            print(stack.top())
        stack.pop()
