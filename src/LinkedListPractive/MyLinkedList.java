package LinkedListPractive;

public class MyLinkedList<E> {

    private class Node {
        private Node next;
        private Object data;

        public Node(E e) {
        }

//        public Node(E e) {
//        }

        public Object getData() {
            return data;
        }
    }

    private Node head;
    private int numNodes = 0;

    // phương thức khởi tạo không tham số
    public MyLinkedList() {
        MyLinkedList myLinkedList = new MyLinkedList();
    }

    public int size() {
        return numNodes;
    }

    public void add(int index, E data) {
        // khai báo 1 node temp để chứa node đầu tiên là head
        Node temp = head;

        // khai báo 1 biến holder
        Node holder;

        // cho control chạy đến vị trí index
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;//holder chỉ đến vị trí control tiếp theo
        temp.next = new Node(data);// tạo Node mới truyền dữ liệu data đầu vào vào node mới
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }

    //getvalue của 1 index nào đó //Object node?
    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;

    }

    //xóa 1 phần tử ở vị trí index
    public void removeIndex(int index) {
        //kiểm tra điều kiện index, thow exeption nếu index < 0 hoặc index > số lượng node
        if (index < 0 || index > numNodes){
            throw new IndexOutOfBoundsException();
        }
        // khai báo 1 node trỏ đến head


        //////chạy được nhưng yêu cầu nhập đúng index có trong list
//        Node temp = head;
//        Node temp2 = head.next;
//        for (int i = 0; i < index - 1; i++) {//lỗi nếu index  == 0
//            temp = temp.next;
//            if (temp2.next != null) {
//                temp2 = temp2.next;
//            }
//        }
//        if (temp2.next != null) {
//            temp.next = temp2.next;
//        }
    }

    //kiểm tra danh sách có phần tử value truyền vào hay không
    public boolean contains(E e) {
        Node node = head;
        while (node.next != null) {
            if (node.data.equals(e)) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    // trả về vị trí của value truyền vào trong danh sách
    public int indexOf(E e) {
        Node node = head;
        int index=0;
        for (int i = 0; i < numNodes; i++) {
            if (node.data.equals(e)){
                return i;
            }
        }
        return -1;
    }

}
