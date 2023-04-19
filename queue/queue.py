class Queue:
    def __init__(self):
        self.__queue = []
    
    def push(self, value):
        self.__queue.append(value)
    
    def pop(self):
        return self.__queue.pop(0)
    
    def size(self):
        return len(self.__queue)

    def is_empty(self):
        return self.size() == 0;

    def front(self):
        return self.__queue[0]

    def back(self):
        return self.__queue[-1]


if __name__ == '__main__':
    elements = [i for i in range(10)]
    queue = Queue()
    
    for element in elements:
        queue.push(element)
    
    print(queue.back())
    
    while not queue.is_empty():
        if queue.front() % 2 == 0:
            print(queue.front())
        queue.pop()
