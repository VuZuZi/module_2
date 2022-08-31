package ss10_dsa_list.practive.TrienKhaiLopListDonGian;

import java.sql.Array;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10; // lưu số phần tử đối đa trong danh sách mặc định là 10.
    private Object elements[];// Mảng đối tượng elements chứa các phần tử trong danh sách

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    };

    public void add(E e){//Phương thức thêm một phần tử mới vào danh sách: add()
                        // Mục đích: thêm một phần tử vào cuối của danh sách
            if (size == elements.length){
                ensureCapa();
            }
            elements[size++] = e; // truyền data e vào cuối danh sách vị trí size + 1
    }

    private void ensureCapa(){//Cài đặt phương thức ensureCapa() Mục đích: Tăng gấp đôi kích thước mảng chứa các phần tử
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }


}
