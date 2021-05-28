package B5_Access_Modifier_JAVA.BaiTap;

import java.awt.geom.Area;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    public Circle(){
    }
    public Circle (double r){
        this.radius=r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius *radius;
    }
}
