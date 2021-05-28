package B4_Oop_Object_JAVA.baitap;

import java.lang.reflect.Constructor;

public class ClassFan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int Speed = SLOW;
    private boolean On = false;
    private double Radius = 5;
    private String Color = "Blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public boolean isOn() {
        return On;
    }

    public void setOn(boolean on) {
        On = on;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public ClassFan(int speed, boolean on, double radius, String color) {
        Speed = speed;
        On = on;
        Radius = radius;
        Color = color;
    }
    public ClassFan(){
    }

    public String toString(){
        if (On == true){
            return "Speed: "+ Speed + "Color: "+ Color + "Radius: " + Radius + "Fan is On";
        }else{
            return "Color: "+ Color + "Radius: " + Radius + "Fan is Off";
        }
    }

    public static void main(String[] args) {
        ClassFan Fan1 = new ClassFan(ClassFan.FAST,true,10,"Yellow");
        ClassFan Fan2 = new ClassFan(ClassFan.MEDIUM,false,5,"Blue");
        System.out.println(Fan1.toString());
        System.out.println(Fan2.toString());
    }
}
