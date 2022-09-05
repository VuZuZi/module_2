package LearningExeption;

import java.util.Scanner;

public class TestTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số: ");
        String number = scanner.nextLine();
        try{    // khối lệnh bình thường nếu không gặp lỗi hay ngoại lệ
            int a = Integer.parseInt(number);
            System.out.println("thành công, "+a);
        }catch(Exception e){ // khối lệnh xử lý khi có lỗi hay ngoại lệ xẩy ra ví dụ chia 1 số cho 0
                            // hoặc parInt() một chuỗi
            System.out.println("lỗi");
        }finally { // có thể có hoặc không
            System.out.println("Finally!"); // câu lệnh vẫn thực thi dù lỗi hay không
        }
    }
}
