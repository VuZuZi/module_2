package _7_abstract_interface.practice.p2TrienKhaiLinkedListDonGian;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(10);// tạo 1 list mới với head ban đầu là 10
        linkedList.addFirst(1);
        linkedList.addLast(50);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);
        linkedList.add(4,9);
        linkedList.add(4,9);
        linkedList.printList();
    }
}
