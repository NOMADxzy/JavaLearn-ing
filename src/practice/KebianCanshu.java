package practice;
//测试可变参数和内部类
public class KebianCanshu {
    int num = 10;
    public void use_inner(){
        new inner().menthod();
    }
    public class inner{
        int num = 9;
        public void menthod(){
            int num = 8;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(KebianCanshu.this.num);
        }
    }
    public static int add(Integer ...arr){
        int sum=0;
        for(int k:arr){
            sum+=k;
        }
        return sum;
    }
    public static void main(String[] args) {
//        int i = add(1,2,3,4,5,6,7,8,9);
//        System.out.println(i);
        System.out.println("=====================");

        KebianCanshu.inner obj = new KebianCanshu().new inner();
        KebianCanshu kbcs = new KebianCanshu();
        kbcs.use_inner();
        obj.menthod();

    }
}

