public class CircularQueue {
    int size;
    int front;
    int rear;
    int[] queue;

    public CircularQueue(int size){
        this.size = size + 1;
        rear = size;
        front = size;
        queue = new int[size + 1];
    }
    public void enqueue(int data){
        if(!isFull()){
            rear= (rear + 1) % size;
            queue[rear] = data;
        } else {
            System.out.println("큐가 꽉찼습니다.");
        }
    }

    public int dequeue(){
        if(!isEmpty()){
            front = (front + 1) % size;
            return queue[front];
        } else {
            System.out.println("큐가 비었습니다.");
            return 0;
        }
    }

    public boolean isFull(){
        return (rear + 1) % size == front;
    }

    public boolean isEmpty(){
        return rear == front;
    }

    public void clear(){
        rear = size-1;
        front = size-1;
    }
}
