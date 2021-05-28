package B12_JavaCollection_Framework.Baitap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Product> ListProduct = new ArrayList<>();

    public static void AddProduct(){
        System.out.println("Nhập Id: ");
        int id = scanner.nextInt();

        System.out.println("Nhập Tên: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.println("Nhập Giá SP: ");
        double price = scanner.nextDouble();

        Product product = new Product(id, name, price);
        ListProduct.add(product);
    }

    public static void EditProduct(){
        System.out.println("Nhập Id Cần Tìm: ");
        int id = scanner.nextInt();
        for (int i = 0 ; i < ListProduct.size(); i++){
            if(id == ListProduct.get(i).getId()){
                System.out.println("Mời bạn nhập tên  mới:");
                scanner.nextLine();
                String NewName = scanner.nextLine();
                ListProduct.get(i).setName(NewName);
                System.out.println(ListProduct.get(i));
            }
        }
    }

    public static void editPriceProduct(){
        System.out.println("Nhập Id sản phẩm bạn muốn chỉnh sửa");
        int idPr = scanner.nextInt();
        for (int i = 0 ; i < ListProduct.size(); i++){
            if (idPr == ListProduct.get(i).getId()){
                System.out.println(ListProduct.get(i));
                System.out.println("Nhập giá mà bạn muốn thay đổi: ");
                double price = scanner.nextDouble();
                ListProduct.get(i).setPrice(price);
                System.out.println(ListProduct.get(i));
            }
        }
    }

    public static void DeleteProduct() {
        System.out.println("Nhập Id Muốn Xóa: ");
        int id = scanner.nextInt();
       for (int i = 0 ; i < ListProduct.size(); i++){
           if (id == ListProduct.get(i).getId()){
               ListProduct.remove(i);
               System.out.println("Removed Successfully");
           }
       }
    }

    public static void SearchProduct(){
        System.out.println("Nhập Tên Muốn Tìm Kiếm: ");
        scanner.nextLine();
        String nameProduct = scanner.nextLine();
        for (int i = 0 ; i < ListProduct.size();i++){
            if (nameProduct.equals(ListProduct.get(i).getName())){
                System.out.println(ListProduct.get(i));
            }
        }
    }

    public static void ShowProduct(){
        if (ListProduct.size() == 0){
            System.out.println("Không có sản phẩm ở đây");
        }else{
            for (int i = 0 ; i < ListProduct.size(); i++){
                System.out.println(ListProduct.get(i));
            }
        }
    }

    public static void sortIncrementByPrice(){
        Collections.sort(ListProduct, new SortIncrement());
        System.out.println(ListProduct);
    }

    public static void sortDescendingByPrice(){
        Collections.sort(ListProduct, new sortDescending());
        System.out.println(ListProduct);
    }

    public static void menu(){
        System.out.println(
                "\n"+
                "   1.Thêm Mới product \n" +
                "   2.Hiển Thị product \n"+
                "   3.Chỉnh Sửa Thông Tin product \n"+
                "   4.Xóa product \n"+
                "   5.Tìm Kiếm product \n"+
                "   6.Sắp Xếp product \n"
        );

        int choose = scanner.nextInt();
        switch (choose){
            case 1:
                AddProduct();
                menu();
                break;
            case 2:
                ShowProduct();
                menu();
                break;
            case 3:
                System.out.println("1.Edit Name");
                System.out.println("2.Edit Price");
                int ChooseEdit = scanner.nextInt();
                switch (ChooseEdit){
                    case 1:
                        EditProduct();
                        menu();
                        break;
                    case 2:
                        editPriceProduct();
                        menu();
                        break;
                }
                break;
            case 4:
                DeleteProduct();
                menu();
                break;
            case 5:
                SearchProduct();
                menu();
                break;
            case 6:
                System.out.println("1.Theo Thứ Tự Tăng Dần");
                System.out.println("2.Theo Thứ Tự Giảm Dần");
                int C = scanner.nextInt();
                switch (C){
                    case 1:
                        sortIncrementByPrice();
                        menu();
                        break;
                    case 2:
                        sortDescendingByPrice();
                        menu();
                        break;
                }
                break;
            default:
                System.out.println("Nhập số 1 đến số 7");
                break;
        }
    }
}
