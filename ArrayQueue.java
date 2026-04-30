public class QueueArray<T>{
    private final static int DEFAULT_CAPACITY = 10;
    private T [] arr;
    private int front;
    private int rear;
    private int count;

    public QueueArray(int len){
        if (len <= 0)
            throw new IllegalArgumentException(len + "that is not a length for a queue");
        this.arr = (T[]) new Object[len];
        this.front = 0;
        this.rear = -1;
        this.count = 0;
    }
    public QueueArray(){
        this(DEFAULT_CAPACITY);
    }
    public boolean isEmpty(){
        return count == 0;
    }
    public boolean isFull(){
        return count == arr.length;
    }
    public void enqueue(T e){
        if (isFull())
            throw new IllegalArgumentException("Queue is Full");
        rear = (rear+1) % arr.length;
        arr[rear] = e;
        count++;
    }
    public void dequeue(){
        if (isEmpty())
            throw new IllegalArgumentException("Queue is Empty");
        front = (front+1) % arr.length;
        count--;
    }
    public void display(){
        for (int i = 0, idx = front; i < count; i++) {
            System.out.print(arr[idx] + " ");
            idx = (idx + 1) % arr.length;
        }
        System.out.println();
    }
}
