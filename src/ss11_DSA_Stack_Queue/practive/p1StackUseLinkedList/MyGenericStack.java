package ss11_DSA_Stack_Queue.practive.p1StackUseLinkedList;

import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack(){
        stack = new LinkedList();
    }
}
