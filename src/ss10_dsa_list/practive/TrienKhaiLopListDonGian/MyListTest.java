package ss10_dsa_list.practive.TrienKhaiLopListDonGian;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println("element 4: "+listInteger.get(4));// vị trí thứ 4 là index = 4
        System.out.println("element 1: "+listInteger.get(1));// vị trí thứ 1 là index = 2
        System.out.println("element 2: "+listInteger.get(2));// vị trí thứ 2 là index = 3
    }
}
