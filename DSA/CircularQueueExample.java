/*>A Circular Queue is a linear data structure that follows FIFO (First In, First Out)
    principle but the last position is connected back to the first position to make a circle.
  >Unlike a normal queue where space at the front is wasted after dequeue, 
    Circular Queue reuses empty spaces. */

 /*Operations:
1. Enqueue (insert) → Add element at the rear.
2. Dequeue (delete) → Remove element from the front.
3. isFull() → Check if queue is full.
4. isEmpty() → Check if queue is empty.
5. display() → Print queue elements. */

package DSA;

class CircularQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    // Constructor
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = this.rear = this.size = 0;
    }

    // Check if empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if full
    public boolean isFull() {
        return size == capacity;
    }

    // Enqueue
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is Full!");
            return;
        }
        queue[rear] = data;
        rear = (rear + 1) % capacity; // move rear circularly
        size++;
        System.out.println(data + " enqueued");
    }

    // Dequeue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        int item = queue[front];
        front = (front + 1) % capacity; // move front circularly
        size--;
        System.out.println(item + " dequeued");
        return item;
    }

    // Peek (front element)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        return queue[front];
    }

    // Display Queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}

// Main class
public class CircularQueueExample {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);

        cq.display();

        cq.dequeue();
        cq.dequeue();

        cq.display();

        cq.enqueue(60);
        cq.enqueue(70);

        cq.display();
        System.out.println("Front element: " + cq.peek());
    }
}

/* Real-life Examples
CPU scheduling (Round Robin algorithm).

Network packet buffering.

Traffic light systems (rotating signals).

Printing jobs in circular order. */