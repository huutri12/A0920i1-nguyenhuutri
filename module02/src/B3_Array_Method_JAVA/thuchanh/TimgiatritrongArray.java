package B3_Array_Method_JAVA.thuchanh;

import java.util.Scanner;

public class TimgiatritrongArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String input_name = scanner.nextLine();

        //duyet mang sv khai bao:
        boolean isExist = false;
        for (int i = 0 ; i < students.length ; i++){
            if (students[i].equals(input_name)){
                System.out.println("Position of the students in the list " + input_name + " is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Not found " + input_name + " in the list.");
        }
    }
}
