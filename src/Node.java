public class Node<T> {
    private Node next;
    private T data;

    public Node(T data){
        this.data = data;
    }

    public T getData(){ return this.data; }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return this.next;
    }

}
