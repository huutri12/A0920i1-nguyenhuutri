package B1_Introduction_JAVA.thuc_hanh.hello_world;

import java.sql.SQLOutput;
import java.util.Scanner;

public class sudungtoantu {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Width: ");
        width=scanner.nextFloat();

        System.out.println("Enter Height: ");
        height=scanner.nextFloat();

        float area = width * height;
        System.out.println("Area is: "+ area);

    }
}
