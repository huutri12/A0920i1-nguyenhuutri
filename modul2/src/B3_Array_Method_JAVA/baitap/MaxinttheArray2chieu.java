package B3_Array_Method_JAVA.baitap;

import java.util.Scanner;

public class MaxinttheArray2chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soDong, soCot;

        System.out.println("Nhập vào số dòng của mảng: ");
        soDong = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        soCot = scanner.nextInt();

        // khai báo và cấp phát bộ nhớ cho mảng
        int[][] A = new int[soDong][soCot];

        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Mảng vừa nhập: ");
        int max =A[0][0];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                if (max < A[i][j]){
                    max = A[i][j];
                }
            }
        }
        System.out.print(max + "\t");
    }
}
