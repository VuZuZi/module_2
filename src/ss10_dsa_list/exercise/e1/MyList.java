package ss10_dsa_list.exercise.e1;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }



    private void checkIndex(int index) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException(String.format("Index out of bound : %d for size : %d ", index, this.size));
        }
    }
    private void insert(int index, E element) {
        if (this.size == this.elements.length) {
            this.elements = Arrays.copyOf(this.elements, this.elements.length * 2);
        }
        for (int i = this.size; i > index + 1; i--) {
            this.elements[i] = this.elements[i - 1];
        }
        this.elements[index] = element;
        this.size++;
    }

    public void add(int index, E element){
        checkIndex(index);
        insert(index, element);
    }
    public void remove(int index){
        checkIndex(index);
        E element = (E) elements[index];
        }


}
