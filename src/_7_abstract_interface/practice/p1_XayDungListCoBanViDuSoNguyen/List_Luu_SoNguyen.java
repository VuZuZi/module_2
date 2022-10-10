package _7_abstract_interface.practice.p1_XayDungListCoBanViDuSoNguyen;

public class List_Luu_SoNguyen {
    public static void main(String[] args) {
        MyList<Integer> listSoNguyen = new MyList<Integer>();
        listSoNguyen.add(1);
        listSoNguyen.add(2);
        listSoNguyen.add(3);
        listSoNguyen.add(4);
        listSoNguyen.add(5);
        listSoNguyen.add(6);
        listSoNguyen.add(7);
        listSoNguyen.add(8);
        listSoNguyen.add(9);
        listSoNguyen.add(10);
        listSoNguyen.add(11);
        listSoNguyen.add(12);
        listSoNguyen.add(13);
        listSoNguyen.add(14);

        for (int i = 0; i < listSoNguyen.getSize(); i++) {
            System.out.println("vị trí "+i+" trong mảng là "+listSoNguyen.get(i));
        }

        System.out.println(listSoNguyen.get(-1));


    }
}
