package CaseStudy_modul2.Services;

import CaseStudy_modul2.Controller.Regex;
import CaseStudy_modul2.Models.House;
import CaseStudy_modul2.ReadAndWriteFile.Read_Write_File;

import java.util.ArrayList;
import java.util.Scanner;

public class HouseServices {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<House> House_List = new ArrayList<>();
    static final String PATH = "F:\\A0920I1-NguyenHuuTri\\module02\\src\\CaseStudy_modul2\\Data\\House.txt";

    public static void AddNewHouse(){
        String name;
        do {
            System.out.println("Mời bạn nhập tên House: ");
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

        System.out.println("Mời bạn nhập kiểu thuê: ");
        String rental_Type;
        rental_Type = scanner.nextLine();

        scanner.nextLine();

        String Id;
        do {
            System.out.println("Mời bạn nhập Id: ");
            Id = scanner.nextLine();

        }while (!Regex.Check_Id(Id));

        System.out.println("Mời bạn nhập tiêu chuẩn phòng: ");
        String Standard_Room;
        Standard_Room = scanner.nextLine();

        System.out.println("Mời bạn mô tả tiện nghi khác: ");
        String Description;
        Description = scanner.nextLine();

        System.out.println("Mời bạn nhập số tầng");
        int Floors;
        Floors =scanner.nextInt();

        House house = new House(name, area, rent, amount, rental_Type,
                Id, Standard_Room, Description, Floors);
        House_List.add(house);

        for (int i = 0 ; i < House_List.size() ; i++){
            Read_Write_File.write_File(PATH,House_List.get(i).toString());
        }

    }
    public static void ShowAllHouse(){
        for (int i = 0 ; i < House_List.size() ; i++){
            System.out.println(House_List.get(i).showInfor());
        }
    }
}
