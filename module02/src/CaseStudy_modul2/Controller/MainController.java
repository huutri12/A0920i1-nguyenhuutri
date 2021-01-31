package CaseStudy_modul2.Controller;

import CaseStudy_modul2.Models.Room;
import CaseStudy_modul2.Models.Villa;
import CaseStudy_modul2.Services.HouseServices;
import CaseStudy_modul2.Services.RoomServices;
import CaseStudy_modul2.Services.VillaServices;

import java.util.Scanner;

public class MainController {
    static boolean outMenu = true;
    static Scanner scanner = new Scanner(System.in);
    public static void DisplayMainMenu(){
        int choose;
        do {
            System.out.println(
                    "1: Add New Services " + "\n"+
                            "2: Show Services" +"\n"+
                            "3: Add New Customer" +"\n"+
                            "4: Show Information Of Customer" +"\n"+
                            "5: Add New Booking" +"\n"+
                            "6: Show Information Of Employee" +"\n"+
                            "7: Exit"+"\n"+
                            "----------------------------------------"+"\n"+
                            "Please select the function:"
            );
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    AddNewServices();
                    break;
                case 2:
                    ShowServices();
                    break;
                case 3:
                    AddNewCustomer();
                    break;
                case 4:
                    ShowInformationOfCustomer();
                    break;
                case 5:
                    AddNewBooking();
                    break;
                case 6:
                    ShowInformationOfEmployee();
                    break;
                case 7:
                    outMenu = false;
                    break;

            }
        }while (outMenu);
    }
    public static void AddNewServices(){
        int chose;
        do {
            System.out.println(
                    "1: Add New Villa " + "\n"+
                            "2: Add New House " +"\n"+
                            "3: Add New Room " +"\n"+
                            "4: Back To Menu " +"\n"+
                            "5: Exit " +"\n"+
                            "----------------------------------------"+"\n"+
                            "Please select the function:"
            );
            chose = scanner.nextInt();
            switch (chose){
                case 1:
                    VillaServices.AddNewVilla();
                    break;
                case 2:
                    HouseServices.AddNewHouse();
                    break;
                case 3:
                    RoomServices.AddNewRoom();
                    break;
                case 4:
                    DisplayMainMenu();
                    break;
                case 5:
                    outMenu = false;
                    break;

            }
        }while (outMenu);
    }
    public static void ShowServices(){
        int chose;
        System.out.println(
                "1: Show All Villa " + "\n"+
                "2: Show All House " +"\n"+
                "3: Show All Room " +"\n"+
                "4: Show All Name Villa Not Duplicate" +"\n"+
                "5: Show All Name House Not Duplicate" +"\n"+
                "6: Show All Name Room Not Duplicate" +"\n"+
                "7: Back To Menu " +"\n"+
                "8: Exit " +"\n"+
                "----------------------------------------"+"\n"+
                "Please select the function:"
        );
        chose = scanner.nextInt();
        switch (chose){
            case 1:
                VillaServices.ShowAllVilla();
                break;
            case 2:
                HouseServices.ShowAllHouse();
                break;
            case 3:
                RoomServices.ShowAllRoom();
                break;

        }
    }
    public static void AddNewCustomer(){



    }
    public static void ShowInformationOfCustomer(){

    }
    public static void AddNewBooking(){

    }
    public static void ShowInformationOfEmployee(){

    }

    public static void main(String[] args) {
        DisplayMainMenu();
    }
}
