package baithi.SP;

import baithi.Read_Write_file.Read_Write_File;
import baithi.modem.Sanphamxuatkhau;

import java.util.ArrayList;
import java.util.Scanner;

public class SPxuatkhau {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Sanphamxuatkhau> Spxuat = new ArrayList<Sanphamxuatkhau>();
    static final String PATH = "F:\\A0920I1-NguyenHuuTri\\module02\\src\\baithi\\data\\xuatkhau.csv";
    public static void AddnewSpxuat(){
        String id;
        System.out.println("Mời bạn nhập id sản phẩm: ");
        id = scanner.nextLine();

        String Masp;
        System.out.println("Moi ban nhap ma sp: ");
        Masp = scanner.nextLine();

        String Tensp;
        System.out.println("Moi ban nhap ten sp: ");
        Tensp = scanner.nextLine();

        double Giaban;
            System.out.println("Moi ban nhap gia ban: ");
            Giaban = scanner.nextDouble();

        int Soluong;
        do {
            System.out.println("Moi ban nhap so luong:");
            Soluong = scanner.nextInt();
        }while (Soluong > 0);

        String nhasanxuat;
        System.out.println("moi ban nhap nha san xuat: ");
        nhasanxuat = scanner.nextLine();

        double giaxuatkhau;
        do {
            System.out.println("Moi ban nhap gia xuat khau:");
            giaxuatkhau = scanner.nextDouble();
        }while (giaxuatkhau > 0);

        String Quocgianhap;
        System.out.println(" Moi ban nhap quoc gia Nhap san pham: ");
        Quocgianhap = scanner.nextLine();

        Sanphamxuatkhau sp = new Sanphamxuatkhau(id, Masp, Tensp, Giaban, Soluong, nhasanxuat,
                giaxuatkhau, Quocgianhap);
        Spxuat.add(sp);

        for (int i = 0 ; i < Spxuat.size() ; i++){
            Read_Write_File.write_File(PATH, Spxuat.get(i).toString());
        }
    }
    public static void ShowSPxuat(){
        for (int i = 0 ; i < Spxuat.size() ; i++){
            System.out.println(Spxuat.get(i).showInfor());
        }
    }
}
