package CaseStudy_modul2.Services;

import CaseStudy_modul2.Controller.Regex;
import CaseStudy_modul2.Models.Room;
import CaseStudy_modul2.ReadAndWriteFile.Read_Write_File;

import java.util.ArrayList;
import java.util.Scanner;

public class RoomServices {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Room> Room_List = new ArrayList<>();
    static final String PATH = "F:\\A0920I1-NguyenHuuTri\\module02\\src\\CaseStudy_modul2\\Data\\Room.csv";
    public static void AddNewRoom(){
        String name;
        do {
            System.out.println("Mời bạn nhập tên Room: ");
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


        String ServicesFree;
        do {
            System.out.println("Mời bạn nhập dịch vụ miễn phí : ");
            ServicesFree = scanner.nextLine();
        }while (!Regex.Check_Service(ServicesFree));

        Room room = new Room(name, area, rent, amount, rental_Type,
                Id, ServicesFree);

        Room_List.add(room);

        for (int i = 0 ; i < Room_List.size() ; i++){
            Read_Write_File.write_File(PATH, Room_List.get(i).toString());
        }

    }
    public static void ShowAllRoom(){
        for (int i = 0 ; i < Room_List.size() ; i++){
            System.out.println(Room_List.get(i).showInfor());
        }
    }
}
