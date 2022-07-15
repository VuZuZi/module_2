package _SS2_arrayInJava.exersice.e2HienThi20SoNguyenToDauTien;

public class e2 {
    public static void main(String[] args) {
        int count = 0;
        boolean check = true;
        int num;
        System.out.println("số nguyên tố thứ nhất là 1");
        for (int i = 2; count < 20 ; i++) {
            if (i == 2){
                continue;
            }
            check = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    check = false;
                }

            }
            if (check){
                count ++;
                System.out.println("số nguyên tố thứ "+count+" là "+i);
            }
        }
    }
}
