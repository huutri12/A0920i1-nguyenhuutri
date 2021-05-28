package B3_Array_Method_JAVA.baitap;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class TinhTongomotcot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soDong, soCot;

        System.out.println("Nhap so Dong: ");
        soDong = scanner.nextInt();

        System.out.println("Nhap so Cot: ");
        soCot = scanner.nextInt();

        int A[][] = new int[soDong][soCot];

        for (int i = 0 ; i < soDong ; i++){
            for (int j = 0 ; j < soCot ; j++){
                System.out.println("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0 ; i < soDong ; i++){
            for (int j = 0 ; j < soCot ; j++){

                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Nhap cot muon tinh: ");
        int n = scanner.nextInt();
        int cout = 0;
        for(int i = 0 ; i < soDong ; i++) {
            for(int j = 0; j < soCot ;j++) {
                if (j == n) {
                    cout += A[i][j];
                }
            }
        }
        System.out.println("tong la: " + cout);
    }

}

