package baithi.Controller;

import baithi.SP.SPnhapkhau;
import baithi.SP.SPxuatkhau;

import java.util.Scanner;

public class MainController {
    static boolean outMenu = true;
    static Scanner scanner = new Scanner(System.in);

    public static void DisplayMainMenu(){
        int choose;

        do {
            System.out.println(
                    "1: Thêm Mới " + "\n" +
                            "2: Xóa " + "\n"+
                            "3: Xem danh sách các sản phẩm " + "\n"+
                            "4: Tìm kiếm " + "\n"+
                            "5: Thoát "
            );
            choose  = scanner.nextInt();
            switch (choose){
                case 1:
                    AddSp();
                    break;
                case 2:

                    break;
                case 3:
                    ShowSp();
                    break;
                case 4:

                    break;
                case 5:
                    outMenu = false;
                    break;
            }

        }while (outMenu);
    }
    public static void AddSp(){
        int chose;
        do {
            System.out.println(
                    "1: Sản Phẩm Nhập Khẩu: " + "\n "+
                            "2: Sản Phẩm Xuất Khẩu "
            );
            chose = scanner.nextInt();
            switch (chose){
                case 1:
                    SPnhapkhau.AddNewSPnhap();
                    break;
                case 2:
                    SPxuatkhau.AddnewSpxuat();
            }
        }while (outMenu);
    }
    public static void ShowSp(){
        int choose;
        System.out.println(
                "1: Sản Phẩm Nhập Khẩu: " + "\n "+
                        "2: Sản Phẩm Xuất Khẩu "
        );
        choose = scanner.nextInt();
        switch (choose){
            case 1:
                SPnhapkhau.ShowSPnhap();
                break;
            case 2:
                SPxuatkhau.ShowSPxuat();
        }
    }

    public static void main(String[] args) {
        DisplayMainMenu();
    }
}
