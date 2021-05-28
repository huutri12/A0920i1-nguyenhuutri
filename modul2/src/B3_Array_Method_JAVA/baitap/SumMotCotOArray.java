package B3_Array_Method_JAVA.baitap;

import java.util.Scanner;

public class SumMotCotOArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n ;
        int sum = 0;
        System.out.println("Bậc của ma trận : ");
        n = scanner.nextInt();

        int A[][] = new int[n][n];

        System.out.println("Nhập các phần tử cho ma trận ");
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                System.out.println("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                if (i == j){
                    sum += A[i][j];
                }
            }
        }
        System.out.println("Tổng các phần tử nằm trên đường chéo chính = " + sum);
    }
}
