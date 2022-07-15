package _SS3_arrayAndMedthod.practive.p5TimGTNNTrongMang;

import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        System.out.println("giá trị nhỏ nhất của mảng: "+arr[minValue(arr)]);

    }
    public static int minValue(int [] arr){
        int index = 0;
        for (int i = 0; i < arr.length;i++){
            if (arr[i]<arr[index]){
                index = i;
            }
        }
        return index;
    }
}
