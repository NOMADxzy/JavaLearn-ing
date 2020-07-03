package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Collection_test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        Collections.addAll(list,"6","4","3","7");
        Collections.shuffle(list);
        System.out.println(list.toString()+list.size());

//匿名内部类
        Comparator comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o2) - Integer.parseInt(o1);
            }
        };
        Collections.sort(list,comparator);
        System.out.println(list);
        Collections.sort(list,comparator);
        System.out.println(list);

//Collections重写sort方法
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.parseInt(o2) - Integer.parseInt(o1);
//            }
//        });
//        System.out.println(list.toString());

//迭代器使用
//        Iterator<String> it = list.iterator();
//        boolean b = it.hasNext();
//        while (it.hasNext()){
//            System.out.print(it.next()+" ");
//        }
    }
}
