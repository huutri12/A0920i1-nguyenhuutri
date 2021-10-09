package B1_Introduction_JAVA.bai_tap;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);
        int A[] = new int[n];
        System.out.println("Nhập giá trị cho các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }
        int test = 1;
        for (int i = 0; i < n / 2; i++) {
            if (A[i] != A[n - i - 1]) {
                test = 0;
                break;
            }
        }
        if (test == 0) {
            System.out.println("Mảng một chiều vừa nhập không là mảng đối xứng");
        } else {
            System.out.println("Mảng một chiều vừa nhập là mảng đối xứng");
        }
    }
}
