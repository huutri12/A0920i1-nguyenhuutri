package B3_Array_Method_JAVA.thuchanh;

import java.util.Scanner;

public class MaxintheArray {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("Size does not exceed 20");
            }
        }while (size > 20);

        array = new int[size];
        int n = 0;
        while (n < array.length){
            System.out.print("Enter element " + (n + 1) + ": ");
            array[n] = scanner.nextInt();
            n++;
        }

        System.out.printf("%-20s%s", "Element in array: ", "");
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int i = 0;i < array.length ; i++){
            if (array[i] > max){
                max = array[i];
                index = i + 1;
            }
        }
        System.out.println("element max: " +  max  + " index: " + index);
    }
}
