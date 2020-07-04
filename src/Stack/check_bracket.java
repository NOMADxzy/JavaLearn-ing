package Stack;

import java.util.HashMap;
import java.util.Scanner;

public class check_bracket {
    private static HashMap<Character,Character> brackets = new HashMap<>();
    public static void initBrackets(){
        brackets.put('(',')');
        brackets.put('[',']');
        brackets.put('{','}');
    }
    public static boolean check(String s){
        char[] arr = s.toCharArray();
        stack stack1 = new stack();
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(brackets.keySet().contains(arr[i]))
            {
                stack1.addBracket(arr[i]);
            }
            else if(brackets.values().contains(arr[i])){
                if(arr[i]==brackets.get(stack1.getTop()))
                {
                    stack1.pop();
                }
                else
                {
                    flag = false;
                    break;
                }
            }
            else continue;
        }
        if(stack1.getSize()==0) flag = true;
        return flag;
    }

    public static void main(String[] args) {
        initBrackets();
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入表达式：");
        s = in.nextLine();
        System.out.println(check(s));
    }
}
