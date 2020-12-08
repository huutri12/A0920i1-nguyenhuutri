package B3_Array_Method_JAVA.baitap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        int n, i, c;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử mảng: ");
            n = scanner.nextInt();
        }while (n <= 0);

        int A[] = new int[n];
        System.out.println("Nhập các phần tử cho mảng: ");

        for ( i = 0 ; i < n ; i++){
            System.out.println("Nhập phần tử thử " + i + ": ");
            A[i] = scanner.nextInt();
        }

        System.out.println("Nhập số nguyên k: ");
        int k = scanner.nextInt();
        // xóa phần tử k ra khỏi mảng
        // vòng lặp for sẽ khởi tạo c = i = 0
        // và duyệt i từ 0 đến n
        // nếu phần tử tại vị trí i khác với số nguyên k
        // thì gán phần tử tại i cho phần tử tại k
        // sau đó tăng c lên 1

        for (c = i = 0 ; i < n ; i++){
            if (A[i] != k){
                A[c] = A[i];
                c++;
            }
        }
        n = c;

        System.out.println("Mảng mới sau khi xóa đi " + k + "Là: " );

        for (i = 0 ; i < n ; i++){
            System.out.println(A[i]);
        }
    }
}
