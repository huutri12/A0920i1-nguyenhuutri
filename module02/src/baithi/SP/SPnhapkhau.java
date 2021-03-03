package baithi.SP;

import baithi.Read_Write_file.Read_Write_File;
import baithi.modem.SanPhamnhapkhau;

import java.util.ArrayList;
import java.util.Scanner;

public class SPnhapkhau {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<SanPhamnhapkhau> SPnhap = new ArrayList<SanPhamnhapkhau>();
    static final String PATH = "F:\\A0920I1-NguyenHuuTri\\module02\\src\\baithi\\data\\nhapkhau.csv";
    public static void AddNewSPnhap(){
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

        double gianhapkhau;
        do {
            System.out.println("Moi ban nhap gia nhap khau:");
            gianhapkhau = scanner.nextDouble();
        }while (gianhapkhau > 0);

        String tinhthanhnhap;
        System.out.println("Moi ban nhap tinh thanh: ");
        tinhthanhnhap =scanner.nextLine();

        double thuenhapkhau;
        do {
            System.out.println("moi ban nhap thue: ");
            thuenhapkhau =scanner.nextDouble();
        }while (thuenhapkhau > 0);

        SanPhamnhapkhau sp = new SanPhamnhapkhau(id, Masp, Tensp, Giaban, Soluong, nhasanxuat,
                gianhapkhau, tinhthanhnhap, thuenhapkhau);
        SPnhap.add(sp);

        for (int i = 0 ; i < SPnhap.size() ; i++){
            Read_Write_File.write_File(PATH, SPnhap.get(i).toString());
        }
    }
    public static void ShowSPnhap(){
        for (int i = 0 ; i < SPnhap.size() ; i++){
            System.out.println(SPnhap.get(i).showInfor());
        }
    }
}
