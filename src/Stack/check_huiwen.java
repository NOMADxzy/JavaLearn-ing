package Stack;

import java.util.Scanner;
import java.util.Stack;

public class check_huiwen {
    public static boolean is_huiwen(String s){
        String s1 = s.substring(0,s.length()/2);
        String s2;
        if(s.length()%2==0) s2 = s.substring(s.length()/2);
        else s2 = s.substring(s.length()/2+1);
        Stack<Character> stack = new Stack<>();
        char[] arr = s1.toCharArray();
        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }
        StringBuffer buf = new StringBuffer();
        while (!stack.empty()){
            buf.append(stack.pop().toString());
        }
        if(s2.equals(buf.toString())) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println("请输入数字");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(is_huiwen(s));
    }
}
