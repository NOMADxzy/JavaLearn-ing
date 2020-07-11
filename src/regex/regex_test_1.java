package regex;

import java.util.regex.Pattern;

public class regex_test_1 {
    public static void main(String[] args) {
        String content = ("www.java.com");
        String pattern = ".*java.*";
        boolean is_include = Pattern.matches(pattern,content);
        boolean is_totally_match = Pattern.matches(pattern,content);
        System.out.println("字符串"+content+"包含了"+"java吗？"+is_include);
        System.out.println(is_totally_match);
    }
}
