package ArrayList_Practive.Students.Test;

import ArrayList_Practive.Students.ArrayListStudents;
import ArrayList_Practive.Students.DanhSachSinhVien;
import ArrayList_Practive.Students.SinhVien;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon = 0;
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int idCheck;



        do {
            System.out.println("MENU ------- ");
            System.out.println(
                    "1. add student on list Students\n" +
                            "2. print List Students\n" +
                            "3. check the list is null\n" +
                            "4. get the number students on list\n" +
                            "5. check studentID\n" +
                            "6. remove a student on list\n" +
                            "7. find follow name\n" +
                            "8. print score high to low\n" +
                            "0. Exit\n" +
                            "--------------\n" +
                            "Add your choice option: "
            );
            luaChon = scanner.nextInt();
            if (luaChon <= 0 || luaChon > 8) {
                System.out.println("your option is error");
            }else {
                switch (luaChon){
                    case 1:
                        System.out.println("Input Mã Sinh Viên: ");
//                        int studentId = scanner.nextInt();
                        scanner.nextLine();
                        int maSinhVien = Integer.parseInt(scanner.nextLine());;

                        System.out.println("Input FullName: ");
                        String tenSinhVien = scanner.nextLine();

                        System.out.println("Input Score: ");
                        float diem = Integer.parseInt(scanner.nextLine());

                        System.out.println("Input Age: ");
                        int tuoi = Integer.parseInt(scanner.nextLine());

                        // gọi mảng và truyền các giá trị vào constactor add student

                        SinhVien sv = new SinhVien(maSinhVien,tenSinhVien,diem,tuoi);// tạo 1 sinh viên mới
                        System.out.println(sv.toString());
                        dssv.themSinhVien(sv); // add sinh viên vào arraylist

                    case 2:
                        dssv.inDanhSachSinhVien();
                        break;
                    case 3:
                        System.out.println("Danh Sách rỗng: "+dssv.kiemTraDanhSachRong());
                        break;
                    case 4:
                        System.out.println("Số lượng sinh viên trong danh sách: "+dssv.laySoLuongSinhVienTrongDanhSach());
                        break;
//                    case 5:// làm rỗng danh sách sinh viên
//                        dssv.lamRongDanhSach();
//                        break;
                    case 5: //checkID
                        dssv.inDanhSachSinhVien();
                        System.out.print("nhập mà sinh viên cần tìm: ");  idCheck = scanner.nextInt();
                        SinhVien sv1 = new SinhVien(idCheck);
                        scanner.nextLine();
                        System.out.println("ID: "+idCheck+" có trong danh sách hay không: "+dssv.kiemTraID(sv1));

                        break;
                    case 6: // xóa 1 sinh viên ở trong danh sách
                        dssv.inDanhSachSinhVien();
                        System.out.print("nhập mà ID sinh viên cần xóa: ");  idCheck = scanner.nextInt();
                        SinhVien sv2 = new SinhVien(idCheck);
                        scanner.nextLine();
                        dssv.xoaSinhVien(sv2);
                        dssv.inDanhSachSinhVien();
                        break;
                    case 7: // tìm sinh viên theo tên
                        System.out.println("nhập tên sinh viên muốn tìm");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        System.out.println("kết quả tìm kiếm: ");
                        dssv.timTheoTen(name);
                        break;
                    case 8: // im danh sách theo điểm giảm dần
                        dssv.sapXepSinhVienGiamDanTheoDiem();
                        dssv.inDanhSachSinhVien();
                        break;

                }
            }
        }while (luaChon != 0);
    }
}
