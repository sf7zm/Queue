public class LinkedQueue<T>{

    private class Node<T>{
       private T data;
       private Node <T> next;

       public Node(){}
       public Node(T data){
           this.data = data;
           this.next = null;
       }
    }
       private Node <T> front;
       private Node <T> rear;
       private int count;

       public LinkedQueue(){
           this.front = this.rear = null;
           this.count = 0;
       }
       public boolean isEmpty(){
           return front == null;
       }
       public void enqueue(T e){
           Node <T> newNode = new Node<>(e);
           if (isEmpty()) {
               front = rear = newNode;
               count++;
           }
           else {
               rear.next = newNode;
               rear = newNode;
               count++;
           }
       }
       public void dequeue(){
           if (isEmpty()) {
               throw new IllegalArgumentException("Queue is Empty");
           }
           else {
               front = front.next;
               count--;
               if (front == null) {
                   rear = null;
               }
           }
       }
       public void display(){
           Node <T> temp = front;
           while (temp != null){
               System.out.print(temp.data+" ");
               temp = temp.next;
           }
       }
       public void clear (){
        front = rear = null;
       }
       public boolean search(T e){
           Node <T> temp = front;
           while (temp != null){
               if (temp.data == e)
                  return true;
               temp = temp.next;
           }
           return false;
       }





}
