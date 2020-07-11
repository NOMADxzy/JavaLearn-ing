package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_test_3 {
    public static void main(String[] args) {
        String regex = "\\bcat\\b";
        Pattern pattern = Pattern.compile(regex);
        String content = "cat cat cat cat cat";
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("begin:"+matcher.start()+" "+"end:"+matcher.end());
        }
    }
}
