public class Main {
    public static void main(String args[]){
        Stack stack = new Stack(10);

        stack.push(1);
        stack.push(14);
        stack.push(24);

        int top = stack.peek();
        System.out.println(top);

        LinkedListStack<Integer> linkedListStack = new LinkedListStack<Integer>();
        linkedListStack.push(2);
        linkedListStack.push(5);
        linkedListStack.pop();
        System.out.println(linkedListStack.peek());

        Queue queue = new Queue(5);
        queue.enqueue(3);
        queue.enqueue(15);
        queue.enqueue(8);
        queue.enqueue(24);
        queue.dequeue();
        System.out.println(queue.dequeue());

        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.enqueue(4);
        circularQueue.enqueue(1);
        circularQueue.enqueue(8);
        circularQueue.enqueue(12);
        circularQueue.enqueue(54);
        circularQueue.enqueue(24);

        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());

        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<Integer>();
        linkedListQueue.enqueue(12);
        linkedListQueue.enqueue(25);
        linkedListQueue.enqueue(14);
        System.out.println(linkedListQueue.dequeue());
        System.out.println(linkedListQueue.dequeue());
        System.out.println(linkedListQueue.dequeue());
        System.out.println(linkedListQueue.dequeue());


    }
}
