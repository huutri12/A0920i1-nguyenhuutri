package B7_Abstract_Class_JAVA.Interface.BaiTap.baitapColorable;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

        circle.howToColor();
        System.out.println(circle);
    }
}
