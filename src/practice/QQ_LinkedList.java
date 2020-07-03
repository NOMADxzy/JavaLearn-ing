package practice;

import java.util.Iterator;
import java.util.LinkedList;

public class QQ_LinkedList {
    public static void print(LinkedList<String> list){
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
    public static void main(String[] args) {
        LinkedList<String> QQnumbers = new LinkedList<>();
        String[] s = {"3302309675","3294393410","18326283492","3302309675"};
        for(String k:s){
            if(!QQnumbers.contains(k)) QQnumbers.add(k);
        }
        print(QQnumbers);
    }
}
