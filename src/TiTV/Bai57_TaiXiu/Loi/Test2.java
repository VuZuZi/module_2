package TiTV.Bai57_TaiXiu.Loi;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = 100;
        int cuoc = 0;

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


    }
}
