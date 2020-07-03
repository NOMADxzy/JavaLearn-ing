package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class general_object {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        ArrayList<String > list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        general_print(list1);
        general_print(list2);
    }
    public static void general_print(ArrayList<?> list){
        Iterator<?> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
