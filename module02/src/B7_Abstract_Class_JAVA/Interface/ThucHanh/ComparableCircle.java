package B7_Abstract_Class_JAVA.Interface.ThucHanh;

import B6_Access_Modifier_JAVA.KeThua.ThucHanh.Circle;

public class ComparableCircle extends Circle
        implements Comparable<ComparableCircle>{
    public ComparableCircle(){
    }

    public ComparableCircle(double radius){
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled){
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
