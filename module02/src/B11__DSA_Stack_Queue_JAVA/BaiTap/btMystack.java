package B11__DSA_Stack_Queue_JAVA.BaiTap;

import java.util.Stack;

public class btMystack {
    public static void main(String[] args) {
        int a[] = {1, 15, 12, 16, 20};

        Stack stack = new Stack();


        for (int i = 0 ; i < a.length; i++){
            stack.push(a[i]);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
