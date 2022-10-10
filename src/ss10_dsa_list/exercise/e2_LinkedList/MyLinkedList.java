package ss10_dsa_list.exercise.e2_LinkedList;

public class MyLinkedList<E>{
    public MyLinkedList() {

    }

    public class Node {
        Node next;
        Object data;

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

    public void add(int index, E e) {// thêm vào vị trí nếu không tồn tại thì thêm vào cuối mảng
        Node temp = head;
        for (int i = 0; i < index && temp.next != null; i++) {
            temp = temp.next;
        }
        Node holder = temp.next;
        temp.next = new Node(e);
        temp.next.next = holder;
        numNodes++;

    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next=temp;
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

    public void remove(int index) {
        Node temp = head;
        Object data;
        try {
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            numNodes--;
            temp.next=temp.next.next;

        }catch (NullPointerException e){
//            System.out.println(e);
            System.out.println("đã xẩy ra lỗi Input");
        }
    }
    public boolean remove(E e){
        if (head.data.equals(e)){
            remove(0);
            numNodes--;
            return true;
        }else {
            Node temp = head;
            while (temp.next!=null){
                if (temp.next.data.equals(e)){
                    temp.next=temp.next.next;
                    numNodes--;
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
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
    public void getIndex(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public int size(){
        return numNodes;
    }

    // hàm sao chép LinkedList
    public MyLinkedList<E> clone(){
        if (numNodes==0){
            System.out.println("trong list không có phần tử nào");
        }
        MyLinkedList<E> temp = new MyLinkedList<E>();
        // khai báo 1 node gắn bằng Head
        Node tempNode = head;
        // thêm head vào danh sách trả về
        temp.addFirst((E) tempNode.data);
        // trỏ đến node kế tiếp
        tempNode = tempNode.next;
        // thêm tất cả node kế tếp vào danh sách
        while (tempNode!=null){
            temp.addLast((E) tempNode.data);
            tempNode=tempNode.next;
        }
        return temp;
    }

    public boolean contains(E e){
        Node temp = head;
        while (temp.next!=null){
            if (temp.next.data.equals(e)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
