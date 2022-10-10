package _7_abstract_interface.practice.p2TrienKhaiLinkedListDonGian;

import javax.xml.soap.Node;

public class MyLinkedList<E> {
    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    private Node head;
    private int numNodes = 0;

    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }

    // Phương thức khởi tọa không tam số
    public MyLinkedList() {
    }

    //phương thức add vào vị trí index
    public void add(int index, E e) {
        Node temp = head;
        Node hoder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        hoder = temp.next;
        temp.next = new Node(e);
        temp.next.next = hoder;
        numNodes++;
    }

    // phương thức add 1 phần tử vào vị trí đầu tiên
    public void addFirst(E e) {
        // khai báo 1 node temp tham chiếu đến giá trị head
        Node temp = head;
        // head nhận giá trị mới
        head = new Node(e);
        // trỏ head tới vị trí head cũ
        head.next = temp;
        // tăng giá trị size lên
        numNodes++;
    }

    // phương thức thêm 1 giá trị vào cuối
    public void addLast(E e) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        for (int i = 0; i < numNodes ; i++) {
            if (i == 0){
                System.out.println("Head có dữ liệu: "+temp.data);
                temp = temp.next;
            }else {
                System.out.println("Ví trí Node: " + i + " có dữ liệu: " + temp.data);
                temp = temp.next;
            }
        }

    }


}
