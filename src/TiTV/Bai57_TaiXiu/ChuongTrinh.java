package TiTV.Bai57_TaiXiu;

import TiTV.Bai57_TaiXiu.Loi.TaiXiu;

import java.util.Scanner;

public class ChuongTrinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String taiKhoan = "admin";
        String matKhau = "admin";
        int money = 0;
        String moneyInput;
        // đang nhập và kiểm tra tài khoản
        String tk, mk;
        do {
            System.out.println("*** Đăng Nhập ***");
            System.out.print("tài khoản: ");
            tk = scanner.nextLine();
            System.out.print("mật khẩu: ");
            mk = scanner.nextLine();
            if (!tk.equalsIgnoreCase(taiKhoan) && !mk.equals(matKhau)){
                System.out.println("tài khoản hoặc mật khẩu không chính xác, xin mời nhập lại");
                System.out.println("lưu ý: tài khoản không phân biệt chữ hoa còn mật khẩu thì có!");
            }
        }while (!tk.equalsIgnoreCase(taiKhoan) && !mk.equals(matKhau));

        // nhập số tiền trong tài khoản
        boolean check = true;
        do {
            System.out.print("Nhập số tiền trong tài khoản của bạn: ");
            moneyInput= scanner.nextLine();

            for (int i = 0; i < moneyInput.length(); i++) {
                if (moneyInput.charAt(i)>='0'&&moneyInput.charAt(i)<='9'){
                    System.out.println("1");
                    check = true;
                }else {
                    System.out.println("số tiền nhập vào không hợp lệ");
                    System.out.println("vui lòng nhập lại");
                    check = false;
                    break;
                }
            }

        }while (check == false);

        // sau khi nhập thành công thì gán vào tiền của tài khoản
        money = Integer.parseInt(moneyInput);
        System.out.println("bắt đầu chơi");

        // lựa chọn đặt cược hay thoát
        String luachon;
        boolean checkLuaChon = false;
        do {
            System.out.print("nhập lựa chọn của bạn: ");
            luachon = scanner.nextLine();
            for (int i = 0; i < luachon.length(); i++) {
                if (luachon.charAt(i) >= '0' && luachon.charAt(i) <= '3'){
                    checkLuaChon = true;
                }else {
                    System.out.println("lựa chọn của bạn không hợp lệ");
                    checkLuaChon = false;
                    break;
                }
            }
        } while (checkLuaChon == false);


        int choose = Integer.parseInt(luachon);
        TaiXiu taiXiu = new TaiXiu();
        System.out.println(taiXiu.xucXac());

    }
}
