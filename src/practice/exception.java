package practice;

import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        int[] a = new int[10];
        int index;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入数字");
        index = in.nextInt();
        try{
            try {
                a[index] = 10;
                System.out.println("hello");
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
                throw  e;
            }

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("重新捕获到异常");
        }

    }
}
