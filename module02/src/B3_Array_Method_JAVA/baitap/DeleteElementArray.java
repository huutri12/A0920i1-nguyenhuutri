package B3_Array_Method_JAVA.baitap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {6, 8, 10, 34, 12, 2};

        System.out.print("Nhập Phần Tử Muốn Xóa: ");
        int element = scanner.nextInt();

        for(int i = arr.length-1; i > element; i--){
//            if(arr[i] == element){
//                // shift elements to the left
//                for(int j = i; j < arr.length - 1; j++){
//                    arr[j] = arr[j+1];
//                }
//                break;
//            }

        }

        System.out.println("Mảng sau khi xóa 1 ptu: " );
        for(int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }


    }
}
