package B5_Access_Modifier_JAVA.ThucHanh;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda3","Skyactiv 3");
        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mazda6","Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
}
