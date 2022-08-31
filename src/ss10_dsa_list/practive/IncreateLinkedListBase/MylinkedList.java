package ss10_dsa_list.practive.IncreateLinkedListBase;

public class MylinkedList<E> {
   private Node head;
   private int numNodes;



    public MylinkedList(Object data){
        head = new Node(data);
    }
    public void add(int index, Object data){
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(Object data){
        Node temp = head;
        head.data = data;
        head = new Node(data);
        numNodes++;
    }





    private  class Node{
        private Node next;
        private Object data;



        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }}



        public Node get(int index){ // lấy giá trị thông qua vị trí index truyền vào
            Node temp = head; // gán giá trị đầu tiên vào 1 biến tạm của linkedlist
            for (int i = 0; i < index; i++) {
                temp = temp.next;   // cho vòng for chạy tới biến cần lấy ra
            }
            return temp;
        }
        // in ra danh sách của linkedlist
        public void printList(){
            Node temp = head; // gán giá trị đầu tiên head vào 1 biến tạm
            while(temp != null){ // nếu biến tạm khác rỗng thì thực thi
                System.out.println(temp.data);// temp.data là dữ liệu của node
                temp = temp.next;
            }
        }

}
