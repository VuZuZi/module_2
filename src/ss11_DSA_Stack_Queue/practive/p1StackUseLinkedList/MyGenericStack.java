package ss11_DSA_Stack_Queue.practive.p1StackUseLinkedList;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack(){
        stack = new LinkedList();
    }

    public  void push(T element){
        stack.addFirst(element);
    }

    public T pop(){
        if (stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
}
