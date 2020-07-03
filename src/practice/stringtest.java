package practice;
//给定一个字符串，请你找出其中不含有重复字符的最长子串的长度。

import java.util.Scanner;

public class stringtest {
    public static void main(String[] args) {
        String s;
        char[] s_arr;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入字符串：");
        s = in.nextLine();
        s_arr = s.toCharArray();
        int low=0;
        int p =1;
        int max=0;
        for(int i=1;i<s.length();i++){
            for(p=low;p<i;p++)
            {
                if(s_arr[i]==s_arr[p])
                {
                    low = p+1;
                    if(max<i-p) max = i-p;
                    break;
                }
            }
            if((p==i)&&(max<i-low+1)) max =i-low+1;
        }
        System.out.println(max+" "+s.length());
    }
}
