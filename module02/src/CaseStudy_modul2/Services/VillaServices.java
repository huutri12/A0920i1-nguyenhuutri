package CaseStudy_modul2.Services;

import CaseStudy_modul2.Controller.Regex;
import CaseStudy_modul2.Models.Villa;
import CaseStudy_modul2.ReadAndWriteFile.Read_Write_File;

import java.util.ArrayList;
import java.util.Scanner;

public class VillaServices {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Villa> Villa_List = new ArrayList<>();
    static final String PATH = "F:\\A0920I1-NguyenHuuTri\\module02\\src\\CaseStudy_modul2\\Data\\Villa.txt";

    public static void AddNewVilla(){

        String name;
         do {
             System.out.println("Mời bạn nhập tên Villa: ");
             name = scanner.nextLine();
         }while (!Regex.Check_Name(name));


        int area;
        do {
            System.out.println("Mời bạn nhập diện tích: ");
            area = Integer.parseInt(scanner.nextLine());

        } while (area < 30);

        double rent ;
        do {
            System.out.println("Mời bạn nhập chi phí thuê: ");
            rent = Double.parseDouble(scanner.nextLine());
        }while (rent < 0);


        int amount;
        do {
            System.out.println("Mời bạn nhập số lượng tối đa: ");
            amount = Integer.parseInt(scanner.nextLine());

        }while (amount < 0 || amount > 20);


        String rental_Type;
        do {
            System.out.println("Mời bạn nhập kiểu thuê: ");
            rental_Type = scanner.nextLine();
        }while (!Regex.Check_Id(rental_Type));

        String Id;
        do {
            System.out.println("Mời bạn nhập Id: ");
            Id = scanner.nextLine();

        }while (!Regex.Check_Id(Id));


        String Standard_Room;
        do {
            System.out.println("Mời bạn nhập tiêu chuẩn phòng: ");
            Standard_Room = scanner.nextLine();
        }while (!Regex.Check_Id(Standard_Room));


        System.out.println("Mời bạn mô tả tiện nghi khác: ");
        String Description;
        Description = scanner.nextLine();


        double AreaPool;

        do {
            System.out.println("Mời bạn nhập diện tích hồ bơi: ");
            AreaPool = Double.parseDouble(scanner.nextLine());;
        }while ( AreaPool < 30 && AreaPool > 0);



        int Floors;
        do {
            System.out.println("Mời bạn nhập số tầng: ");
            Floors = Integer.parseInt(scanner.nextLine());
        }while (Floors < 0);


        Villa villa = new Villa(name, area,rent,amount, rental_Type,
                Id, Standard_Room,Description, AreaPool,Floors);

        Villa_List.add(villa);
        //Read_Write_File.write_File(PATH,"");
        for (int i = 0 ; i < Villa_List.size() ; i++){
            Read_Write_File.write_File(PATH,Villa_List.get(i).toString());
        }
    }
    public static void ShowAllVilla(){
        for (int i = 0 ; i < Villa_List.size() ; i ++){
            System.out.println(Villa_List.get(i).showInfor());
        }
    }
}

