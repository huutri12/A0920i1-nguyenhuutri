package B1_Introduction_JAVA.bai_tap;

import java.util.Scanner;

public class hienthiloichao {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.printf("Hello: "+name);
    }
}
