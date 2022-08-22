package ArrayList_Practive.Students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach; //sinh vien la class muon tao arraylist || danh sach la ten bien arraylist

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<SinhVien>();// khai báo 1 arraylist
    }// constructor rỗng



    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public void themSinhVien(SinhVien sv){
        this.danhSach.add(sv);
            // .add là java đã tự động có
    }
    // 2 in danh sách ra màn hình

    public void inDanhSachSinhVien(){
        for (SinhVien sinhVien: danhSach
             ) {
            System.out.println(sinhVien);
        }
    }

    // 3 kiểm tra danh sách sinh viên có rỗng hay không
    public  boolean kiemTraDanhSachRong(){
        return this.danhSach.isEmpty();

    }
    // 4 lấy ra số lượng sinh viên trong danh sách
    public int laySoLuongSinhVienTrongDanhSach(){
        return this.danhSach.size();
    }

    //  làm rỗng danh sách sinh viên
    public void lamRongDanhSach(){
        this.danhSach.removeAll(danhSach);
    }

    //5. kiểm tra mã sinh viên có tồn tại trong danh sách hay không
    public boolean kiemTraID(SinhVien sv){
        return this.danhSach.contains(sv);
    }

    //6. xóa 1 sinh viên ra khỏi danh sách

    public boolean xoaSinhVien(SinhVien sv2){
        return this.danhSach.remove(sv2);
    }

    //7. tìm sinh viên theo tên

    public void timTheoTen(String name){
        for (SinhVien sinhvien: danhSach
             ) {
            if (sinhvien.getHoVaTen().indexOf(name)>=0){
                System.out.println(sinhvien);
            }else {
                System.out.println("Không tìm thấy! "+name+" trong danh sách sinh viên");
            }
        }
    }
    public void sapXepSinhVienGiamDanTheoDiem(){
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if (sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()){
                    return -1;
                }else if (sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()){
                    return -1;
                }else return 0;
            }
        });
    }

}
