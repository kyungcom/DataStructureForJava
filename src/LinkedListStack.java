public class LinkedListStack<T> {
    private Node<T> top;

    public void push(T data){
        Node<T> node = new Node<T>(data);
        node.setNext(top);
        top = node;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void pop(){
        if (isEmpty()){
            System.out.println("스텍이 비어있습니다.");
        } else {
            top = top.getNext();
        }
    }

    public T peek(){
        return top.getData();
    }

    public void clear(){
        top = null;
    }


}
