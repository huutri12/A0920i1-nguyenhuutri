package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();

        System.out.println("Nhập tuổi: ");
        int age = sc.nextInt();

        System.out.println("Nhập ĐTB: ");
        double dtb = sc.nextDouble();

        System.out.println("Tên: " + name +"\n" + "Tuổi: " + age +"\n" +"DTB: " + dtb);

    }
}
