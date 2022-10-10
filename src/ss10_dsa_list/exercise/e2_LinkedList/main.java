package ss10_dsa_list.exercise.e2_LinkedList;

public class main {
    public static void main(String[] args) throws Exception {
        MyLinkedList linkedList = new MyLinkedList<Integer>(1);
        linkedList.addFirst(2);
        linkedList.addLast(3);
        linkedList.addFirst(4);
        linkedList.addFirst(5);
//        linkedList.remove(2);
        linkedList.printList();
        System.out.println("size: "+linkedList.size());
    }
}
