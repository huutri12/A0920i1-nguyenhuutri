package B5_Access_Modifier_JAVA.BaiTap;

import B6_Access_Modifier_JAVA.KeThua.ThucHanh.Shape;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();

        Circle circle = new Circle(a);
        System.out.println(circle.getRadius());

        System.out.println(circle.getArea());
    }
}
