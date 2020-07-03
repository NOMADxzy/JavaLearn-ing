package practice;

import LIST.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

//
public class List_test {
    public static void main(String[] args) {
        java.util.List<String> list1 = new ArrayList<>();
        list1.add("I");
        list1.add("love");
        list1.add("you");
        System.out.println(list1);
        list1.add(1,"dont");
        System.out.println(list1);
        System.out.println("----------------");

        ArrayList list = new ArrayList();
        list.add("asd");
        list.add(123);
        list.add(23.56);
        System.out.println(list);
        System.out.println("----------------");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addAll(list1);
        linkedList.addFirst("yes");
        linkedList.addLast("!");
        linkedList.clear();
        System.out.println(linkedList);
        System.out.println("-----------------");

        HashSet<String> set = new LinkedHashSet<>();
        set.add("I");
        set.add("love");
        set.add("you");
        System.out.println(set);
    }
}
