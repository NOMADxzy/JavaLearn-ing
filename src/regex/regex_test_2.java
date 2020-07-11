package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//捕获组
public class regex_test_2 {
    public static void main(String[] args) {
        String content = "www.java123.com";
        String pattern = "(\\D*)(\\d+)(.*)";
        Pattern pattern1 = Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(content);
        if(matcher.find()){
            System.out.println("find value:"+ matcher.group(0));
            System.out.println("find value:"+ matcher.group(1));
            System.out.println("find value:"+ matcher.group(2));
            System.out.println("find value:"+ matcher.group(3));
            System.out.println(matcher.end(2));
        }
        else System.out.println("no match");
    }
}
