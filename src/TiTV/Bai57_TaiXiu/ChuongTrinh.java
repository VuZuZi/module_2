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
            if (!(tk.equalsIgnoreCase(taiKhoan)) || !(mk.equals(matKhau))){
                System.out.println("tài khoản hoặc mật khẩu không chính xác, xin mời nhập lại");
                System.out.println("lưu ý: tài khoản không phân biệt chữ hoa còn mật khẩu thì có!");
            }
        }while (!(tk.equalsIgnoreCase(taiKhoan)) || !(mk.equals(matKhau)));

        // nhập số tiền trong tài khoản
        boolean check = true;
        do {
            System.out.print("Nhập số tiền trong tài khoản của bạn: ");
            moneyInput= scanner.nextLine();

            moneyInput = moneyInput.replaceAll(" ", "");

            for (int i = 0; i < moneyInput.length(); i++) {
                if (moneyInput.charAt(i)>='0'&&moneyInput.charAt(i)<='9'){
//                    System.out.println("1");
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
        boolean checkLuaChon = true;
        do {
            System.out.println("1: cược XỈU\n" +
                    "2: cược TÀI\n" +
                    "enything to EXIT");
            System.out.print("nhập lựa chọn của bạn: ");
            luachon = scanner.nextLine();
//            luachon = luachon.replaceAll(" ", "");
            for (int i = 0; i < luachon.length(); i++) {
                if (luachon.charAt(i) >= '0' && luachon.charAt(i) < '3'){
                    checkLuaChon = true;
                    int choose = Integer.parseInt(luachon);
                    GameTaiXiu taiXiu = new GameTaiXiu();
                    //nhập số tiền cược
                    boolean checkTienCuoc = true;
                    int tienCuoc = 0;
                    do {
                        String copyMoney = String.valueOf(money);
                        System.out.println("Tiền của bạn: "+money);
                        System.out.print("Nhập tiền cược: ");
                        String tienCuocString = scanner.nextLine();
                        tienCuocString = tienCuocString.replaceAll(" ", "");
                        for (int j = 0; j < tienCuocString.length(); j++) {
                            if (tienCuocString.charAt(j) >= '0' && tienCuocString.charAt(j) <= '9') {
                                checkTienCuoc = true;
                                tienCuoc = Integer.parseInt(tienCuocString);
                            }else {
                                System.out.println("số tiền cược nhập vào không hợp lệ");
                                System.out.println("vui lòng nhập lại");
                                checkTienCuoc = false;
                                break;
                            }
                        }
                        if (tienCuoc > money) {
                            System.out.println("tài khoản của bạn " + money + " < tiền cược");
                            System.out.println("vui lòng nhập lại");
                            checkTienCuoc = false;
                        }
                    }
                    while (checkTienCuoc == false) ;
                    //****************//


                    String kq = taiXiu.xucXac();
                    System.out.println(money);
                    System.out.println(taiXiu.xucXac());
                    if (kq.startsWith("Xỉu")&&choose==1){
                        money+=tienCuoc;
                        System.out.println("tiền của bạn: "+money);
                    }else {
                        money-=tienCuoc;
                        System.out.println("tiền của bạn: "+money);
                    }
                }else {
                    System.out.println("EXIT");
                    checkLuaChon = false;
                    break;
                }
            }
        } while (checkLuaChon == true);

    }
}
