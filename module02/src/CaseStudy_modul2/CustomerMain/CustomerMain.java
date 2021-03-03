package CaseStudy_modul2.CustomerMain;

import CaseStudy_modul2.Comparator.Comparator;
import CaseStudy_modul2.Controller.Regex;
import CaseStudy_modul2.Exception_Cus.*;
import CaseStudy_modul2.Models.Customer;
import CaseStudy_modul2.ReadAndWriteFile.Read_Write_File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public  class CustomerMain {
    static ArrayList<Customer> customers = new ArrayList<>();
    static final String PATH = "F:\\A0920I1-NguyenHuuTri\\module02\\src\\CaseStudy_modul2\\Data\\Customer.csv";
    public static Scanner scanner = new Scanner(System.in);

    static  Name_Exception name_exception = new Name_Exception();
    static  Email_Exception email_exception = new Email_Exception();
    static  Gender_Exception gender_exception = new Gender_Exception();
    static   ID_Exception id_exception = new ID_Exception();
    static  BirthDay_Exception birthDay_exception = new BirthDay_Exception();
    static  Read_Write_File read_write_file = new Read_Write_File();
    static  Comparator comparator = new CaseStudy_modul2.Comparator.Comparator();

    public static void add_New_Customer() {
        System.out.println("Nhập thông tin khách hàng :");
        String name;
        while (true) {
            try {
                System.out.println("Họ Tên : ");
                name = scanner.nextLine();
                name = name+" ";
                if (name_exception.name_Ex(name)){
                    break;
                }
            } catch (Name_Exception e) {
                System.out.println(e.getMessage());
            }
        }

        String date;
        while (true) {
            try {
                System.out.println("Ngày Sinh : ");
                date = scanner.nextLine();
                if (birthDay_exception.birthday_ex(date)) {

                    break;
                }
            } catch (BirthDay_Exception e) {
                e.getMessage();
            }
        }

//        String gender;
//        do {
//            System.out.println("Giới tính: ");
//            gender = scanner.nextLine(); //feMALE
//        } while (gender_exception.Gender_Exception(gender));
//
//        gender = gender.substring(0, 1).toUpperCase() + gender.substring(1).toLowerCase();
//
        String gender;
        do {
            System.out.println("giới tính: ");
            gender = scanner.nextLine();

            gender = gender.substring(0, 1).toUpperCase() + gender.substring(1).toLowerCase();
        }while (!Regex.Check_sex(gender));


        String indentity_Card;
        while (true) {
            try {
                System.out.println("Id : ");
                indentity_Card = scanner.nextLine();
                String ID = indentity_Card + " ";
                if (id_exception.Id_Exception(ID)) {
                    break;
                }
            } catch (ID_Exception id) {
                id.getMessage();
            }
        }

        System.out.println("SĐT : ");
        int phone_Number = scanner.nextInt();
        scanner.nextLine();

        String email;
        while (true) {
            try {
                System.out.println("Email : ");
                email = scanner.nextLine();
                if (email_exception.Email_Exception(email)) {
                    break;
                }
            } catch (Email_Exception ex) {
                ex.getMessage();
            }

        }
        System.out.println("Type customer : ");
        String type_Customer = scanner.nextLine();
        System.out.println("Địa chỉ : ");
        String address = scanner.nextLine();
        customers.add(new Customer(name, date, gender, phone_Number
                , email, type_Customer, address));
        Collections.sort(customers, comparator);
        String string = "";
        for (int index = 0; index < customers.size(); index++) {
            string +=  customers.get(index).getName_Customer()+","+
                    customers.get(index).getDate_ofbirth()+","+
                    customers.get(index).getSex()+","+
                    customers.get(index).getCMND()+","+
                    customers.get(index).getEmail()+","+
                    customers.get(index).getType()+","+
                    customers.get(index).getAddress()+","+
                    customers.get(index).getServices()+"\n";
        }
        System.out.println(PATH );
        Read_Write_File.write_File(PATH , string);
    }

    // show information of customer
    public static void show_Information_Of_Customer() {
        for (int index = 0; index < customers.size(); index++) {
            System.out.println(customers.get(index).showInfor(index));
        }
    }
}
