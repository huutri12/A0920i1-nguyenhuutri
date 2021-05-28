package B11__DSA_Stack_Queue_JAVA.ThucHanh;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack(){
        stack = new LinkedList<>();
    }
    //phương thức push
    public void push(T element){
        stack.addLast(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        if (stack.size()==0){
            return true;
        }
        return false;
    }
}

