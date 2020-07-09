package lambda_test;
@FunctionalInterface
interface MathOperation{
    int operation(int a,int b);

    default void sayhello() {
        System.out.println("欢迎使用计算器");
    }
}
@FunctionalInterface
interface GreetOperation{
    void operation(String message);
}
public class lambda_test_1 {

    public static void main(String[] args) {
        MathOperation add = (a,b)->a+b;
        MathOperation substract = (a,b)->a-b;
        MathOperation multiply = (a,b)->a*b;
        MathOperation division = (int a,int b)->a/b;
        add.sayhello();
        GreetOperation hello = message -> System.out.println("hello "+message);
        GreetOperation nihao = message -> System.out.println("你好 "+message);
        System.out.println(substract.operation(3,1));
        System.out.println(multiply.operation(5,12));
        hello.operation("xuzuyun");
        nihao.operation("徐祖云");
    }
}
