package B10__DSA_DanhSach_JAVA.ThucHanh.Bai1;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    //phuong thuc ensure : Tăng gấp đôi phần tử
    private void ensureCapa(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    //phương thức add: thêm một phần tử vào cuối danh sách
    //tham số đầu vào: phần tử cần thêm vào danh sách
    public void add(E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }
    //phuong thuc get : trả về phần tử vừa ở vị trí i trong danh sách
    public E get(int i){
        if (i >= size || i < 0){
            throw new IndexOutOfBoundsException("Index: " + i +", Size" + i);
        }
        return (E) elements[i];
    }
}
