package enum_;

public class enum_test {
    enum Color{
        blue,red,green,yellow
    }

    public static void main(String[] args) {
        System.out.println(Color.red);

        Color my_color = Color.blue;
        switch (my_color){
            case red:
                System.out.println("红色");
                break;
            case blue:
                System.out.println("蓝色");
                break;
            case green:
                System.out.println("绿色");
                break;
            case yellow:
                System.out.println("黄色");
                break;
        }
        System.out.println("--------------------");
        Color[] colors = Color.values();
        for(Color k : colors){
            System.out.println(k+" at index of "+k.ordinal());
        }
        System.out.println("返回yellow的枚举常量为"+Color.valueOf("yellow"));
    }
}
