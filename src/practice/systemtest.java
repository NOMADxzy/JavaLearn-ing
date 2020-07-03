package practice;

import java.io.DataInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class systemtest {
    public static void main(String[] args) throws ParseException {
//        long start = System.currentTimeMillis();
//        for(int i=1;i<=9999;i++) System.out.println(i);
//        long end = System.currentTimeMillis();
//        System.out.println("程序耗时："+(end-start));

//        int[] a = {0,1,2,3,4,5};
//        int[] b = new int[10];
//        System.arraycopy(a,3,b,0,2);
//        for(int i:b) System.out.println(i);

//        Date date = new Date();
//        System.out.println(date);
//        System.out.println(date.getTime());
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月 dd日 hh时 mm分 ss秒");
//        System.out.println(sdf.format(date));

//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月 dd日 hh时 mm分 ss秒");
//        try{
//            Date date = sdf.parse("2020年07月 01日 11时 29分 59秒");
//            System.out.println(date);
//        }catch (ParseException e){
//            System.out.println("格式不对");
//        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月 dd日 hh时 mm分 ss秒");
        Date date = sdf.parse("2020年07月 01日 11时 29分 59秒");
        Date born_date = sdf.parse("1999年12月 07日 11时 29分 59秒");
//        System.out.println(date.getTime()+" "+born_date);
        int days = (int)((date.getTime()-born_date.getTime())/1000/3600/24);
        System.out.println("你活了"+days+"天");


    }
}
