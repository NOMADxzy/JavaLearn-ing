package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_test_4 {
    public static void main(String[] args) {
        String regex = "dog";
        String content = "dog dog and dog, there are too much dogs";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        System.out.println(matcher.replaceFirst("cat"));
        System.out.println(matcher.replaceAll("hog"));
        matcher.reset();
        StringBuffer buf = new StringBuffer();
        while (matcher.find()){
            matcher.appendReplacement(buf,"***");
        }
        matcher.appendTail(buf);
        System.out.println(buf.toString());
    }
}
