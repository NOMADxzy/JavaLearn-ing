package practice;

public class teststring {
    public static void main(String[] args) {
        String s = "asd+fg";
        String[] word = s.split("\\+");
        System.out.println(word[0]+"   "+word[1]);
        System.out.println("======================");

        String a = "asd";
        String b = "asd";
        System.out.println(a==b);
        System.out.println(a.equals("asd"));
    }
}
