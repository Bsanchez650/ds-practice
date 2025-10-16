package queue;

class Queue{
    public int[] arr;
    int front;
    int rear;
    int size;
    int capacity;
    public Queue(int cap){
        arr = new int[cap];
        front = 0;
        capacity = cap;
        rear = -1;
        size = 0;
    }
    public void enqueue(int x) {
        // Check if full (size == capacity)
        // Increment rear
        // Add element at rear
        // Increment size

        if(size == capacity){
            System.out.println("Queue full!");
            return;
        }
        //rear++; this works to learn if we dont deque much
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    public int dequeue() {
        // Check if empty (size == 0)
        // Get element at front
        // Increment front
        // Decrement size
        // Return element
        if(size == 0){
            return -1;
        }
        int x = arr[front];
        //front++; same as enqueue
        front = (front + 1) % capacity; //this is called a circular
        size--;
        return x;

    }
    public int peek() {
        // Check if empty, return element at front (DON'T remove)
        if(size == 0){
            return -1;
        }
        return arr[front];
    }

    public boolean isEmpty() {
        // Return true if size == 0
        return size == 0;
    }

    public int size() {
        // Return size
        return size;
    }





}

public class QueuewArray {
}
