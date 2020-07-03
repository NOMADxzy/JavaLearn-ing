package LIST;

import java.util.Scanner;

public class addList {
    public static List add(List list1,List list2){
        int c=0;
        ListNode p1=list1.firstNode;
        ListNode p2=list2.firstNode;
        List list3 = new List();
        ListNode newnode,currentnode;
        int val = p1.getval()+p2.getval();
        newnode = new ListNode(val%10);
        currentnode = newnode;
        list3.firstNode = currentnode;
        list3.Listlength++;
//        if(val >10){
//            newnode = new ListNode(val - 10);
//            currentnode.next=newnode;
//            currentnode = newnode;
//            list3.Listlength++;
//        }
        c = val/10;
        while (p1.next!=null&&p2.next!=null)
        {
            p1 = p1.next;
            p2 = p2.next;
            val = p1.getval()+p2.getval()+c;
            newnode = new ListNode(val%10);
            currentnode.next=newnode;
            currentnode = newnode;
            list3.Listlength++;
            c = val/10;
        }
        if(p1.next==null&&p2.next==null&&c!=0){
            newnode = new ListNode(c);
            currentnode.next=newnode;
            currentnode = newnode;
            list3.Listlength++;
        }
        while (p1.next!=null)
        {
            p1 = p1.next;
            val = p1.getval()+c;
            newnode = new ListNode(val%10);
            currentnode.next=newnode;
            currentnode = newnode;
            list3.Listlength++;
            c = val/10;
        }
        while (p2.next!=null)
        {
            p2 = p2.next;
            val = p2.getval()+c;
            newnode = new ListNode(val%10);
            currentnode.next=newnode;
            currentnode = newnode;
            list3.Listlength++;
            c = val/10;
        }
        if(c!=0){
            newnode = new ListNode(c);
            currentnode.next=newnode;
            list3.Listlength++;
        }
        return list3;
    }

    public static void main(String[] args) {
        System.out.println("请输入list1和list2存放的数值");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        List list1=new List(x);
        List list2=new List(y);
        List list3 = new List();
        list3 = add(list1,list2);
        list1.show();
        System.out.println();
        list2.show();
        System.out.println();
        list3.show();
    }
}
