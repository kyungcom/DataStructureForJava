public class Stack {
    int top;
    int[] stack;
    int size;

    public Stack(int size){
        this.size = size;
        stack = new int[size];
    }

    public void clear(){
        if (!isEmpty()) {
            top = -1;
        }
    }

    public int peek(){
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("스텍이 비어있습니다.");
            return 0;
        }
    }

    public boolean isFull(){
        return top == size - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void pop(){
        if (!isEmpty()) {
            top--;
        } else {
            System.out.println("스텍이 비어있습니다.");
        }
    }

    public void push(int item){
        if (!isFull()) {
            stack[++top] = item;
        } else {
            System.out.println("스텍이 꽉 찼습니다.");
        }
    }
}
