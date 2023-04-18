class Queue:
    def __init__(self):
        self.__queue = []
    
    def push(self, value):
        self.__queue.append(value)
    
    def pop(self):
        return self.__queue.pop(0)


if __name__ == '__main__':
    elements = [i for i in range(10)]
    queue = Queue()
    
    for element in elements:
        queue.push(element)
    
    for i in range(10):
        print(queue.pop())
