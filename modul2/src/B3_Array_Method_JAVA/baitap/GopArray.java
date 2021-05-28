package B3_Array_Method_JAVA.baitap;

import java.util.Scanner;

public class GopArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size arr1: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];

        for (int i = 0 ; i < arr1.length ; i++){
            System.out.println("Nhap element "+ ( i + 1 )+ "of arr1");
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Enter size arr2: ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];

        for (int i = 0 ; i < arr2.length ; i++){
            System.out.println("Nhap element "+ ( i + 1 )+"of arr2");
            arr2[i] = scanner.nextInt();
        }

        int[] arr3 = new int[size1 + size2 ];
        for (int i = 0 ; i < arr1.length ; i++){
            arr3[i] = arr1[i];
        }
        int j = 0;
        for (int i =arr1.length ; i < arr3.length ; i++){
            arr3[i] = arr2[j];
            j++;
        }

        for (int i = 0 ; i < arr3.length ; i++){
            System.out.println(arr3[i] + "\t");
        }
    }
}
