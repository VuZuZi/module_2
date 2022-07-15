package _SS2_arrayInJava.exersice.e5HienThiCacSNTnhoHon100;

public class e5 {
    public static void main(String[] args) {
        int count = 2;
        boolean check = true;
        int num = 0;
        System.out.println("số nguyên tố thứ nhất là 1");
        System.out.println("số nguyên tố thứ hai là 2");
        for (int i = 2; num < 100 ; i++) {
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
                num = i;
                if (num > 100){
                    System.out.println("/* số nguyên tố tiếp theo > 100 */");
                    break;
                }
                count ++;
                System.out.println("số nguyên tố thứ "+count+" là "+i);
            }
        }
    }
}
