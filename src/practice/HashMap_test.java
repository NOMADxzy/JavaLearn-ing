package practice;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_test {
    public static void main(String[] args) {
        HashMap<Character,Integer> numbersofeachchar = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.println("请输入字符串");
        String s = in.nextLine();
        for(Character c : s.toCharArray()){
            if(numbersofeachchar.containsKey(c))
            {
                numbersofeachchar.put(c,numbersofeachchar.get(c)+1);
            }
            else numbersofeachchar.put(c,1);
        }
        for (Character c:numbersofeachchar.keySet()
             ) {
            System.out.println(c+":"+numbersofeachchar.get(c));
        }
    }
}
