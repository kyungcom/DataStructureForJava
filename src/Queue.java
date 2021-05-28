public class Queue {
    int size;
    int front;
    int rear;
    int[] queue;

    public Queue (int size){
        front = -1;
        rear = -1;
        this.size = size;
        queue = new int[size];
    }

    public void enqueue(int data){
        if(!isFull()){
            queue[++rear] = data;
        } else {
            System.out.println("큐가 꽉찼습니다.");
        }
    }

    public int dequeue(){
        if(!isEmpty()){
            return queue[++front];
        } else {
            System.out.println("큐가 비었습니다.");
            return 0;
        }
    }

    public boolean isFull(){
        return rear == size - 1;
    }

    public boolean isEmpty(){
        return rear == front;
    }

    public void clear(){
        rear = -1;
        front = -1;
    }

}
