public class ArrayQueue {
   // private final int MAX_LENGTH;
    private int [] arr ;
    private int front ;
    private int rear ;
    private int count ;

    public ArrayQueue(int maxLength){
        this.front = 0;
        this.rear = maxLength-1; ;
        count = 0;
        arr = new int[maxLength];
    }
    public boolean isEmpty(){
        return count == 0;
    }
    public boolean isFull(){
        return count == arr.length;
    }
    public void enQueue(int e) {
        if (!isFull()) {
            rear = (rear + 1) % arr.length;
            arr[rear] = e;
            count++;
        }else
            System.out.println("the queue is full");
    }
    public void deQueue(){
        if (isEmpty()){
            System.out.println("the queue is empty");
        }
        else {
           // arr[front] = 0;
            front = (front+1)&arr.length;
            count--;
        }
    }
    public void getFront(){
        if (isEmpty()){
            System.out.println("Queue is empty");
        }else
            System.out.println(arr[front]);
    }
    public int getRear(){
        return arr[rear];
    }

    public void printQueue(){
       if (!isEmpty()){
        for (int i = front; i != rear+1; i=(i+1)%arr.length) {
            System.out.print(arr[i]+" ");
        }
           System.out.println();
       }else
           System.out.print("queue is empty");

    }
}
