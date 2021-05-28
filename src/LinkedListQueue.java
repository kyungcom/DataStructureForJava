public class LinkedListQueue<T> {
    private Node<T> front;
    private Node<T> rear;


    public void enqueue(T data){
        Node<T> node= new Node<T>(data);
        if (isEmpty()) {
            front = node;
            rear = node;
        } else {
            rear.setNext(node);
            rear = rear.getNext();
        }
    }

    public boolean isEmpty(){
        return front == null;
    }

    public T dequeue(){
        if(isEmpty()){
            System.out.println("큐가 비어있습니다.");
            return null;
        } else {
            T temp = front.getData();
            front = front.getNext();
            return temp;
        }
    }

    public T peek(){
        if(isEmpty()){
            System.out.println("큐가 비어있습니다.");
            return null;
        } else {
            return front.getData();
        }
    }
}
