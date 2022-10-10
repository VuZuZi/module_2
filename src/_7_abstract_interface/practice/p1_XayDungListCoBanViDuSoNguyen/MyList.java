package _7_abstract_interface.practice.p1_XayDungListCoBanViDuSoNguyen;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private int SoLuongPhanTuToiDa = 10;
    private Object element[];//các phần tử trong danh sách

    public MyList(){
        element = new Object[SoLuongPhanTuToiDa];
    }

    public MyList(int size, int soLuongPhanTuToiDa, Object[] element) {
        this.size = size;
        SoLuongPhanTuToiDa = soLuongPhanTuToiDa;
        this.element = element;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSoLuongPhanTuToiDa() {
        return SoLuongPhanTuToiDa;
    }

    public void setSoLuongPhanTuToiDa(int soLuongPhanTuToiDa) {
        SoLuongPhanTuToiDa = soLuongPhanTuToiDa;
    }

    public Object[] getElement() {
        return element;
    }

    public void setElement(Object[] element) {
        this.element = element;
    }

    public void TangKichThuocCuaMang(){ //ensureCapa
        int newSize = SoLuongPhanTuToiDa*2; // tăng kích thước của mảng lên 2
        element = Arrays.copyOf(element,newSize);// mảng mới bằng copy tất cả mảng cũ
    }

    public void add(E e){
        if (size == element.length){ // nếu kích thước đà full thì tăng kích thước lên
            TangKichThuocCuaMang();
        }
            element[size++]= e; // gán giá trị e vào vị trí tiếp theo của mảng
    }
    public E get(int i){
        if (i >=0 && i <=size){
        return (E) element[i];
    }else {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
    }
}
