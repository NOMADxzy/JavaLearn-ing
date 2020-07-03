package red_package;

import java.util.ArrayList;
import java.util.Scanner;

public class fahongbao {
    private ArrayList<user> users = new ArrayList<user>();
    public void initUser(String s){
        String[] names = {"小红","小华","小伟","小芳"};
        for(String k:names){
            if(k.equals(s)) users.add(new sender(k,10));
            else users.add(new reciever(k,10));
        }
    }
    public static void main(String[] args) {
        fahongbao fhb=new fahongbao();
        System.out.println("请输入需要发红包的人：");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        fhb.initUser(s);
        sender sd = new sender("无",0);
        System.out.println("请输入红包金额：");
        double total = in.nextDouble();
        System.out.println("请输入红包个数：");
        int n = in.nextInt();
        for(int i=0;i<fhb.users.size();i++)
        {
            if(fhb.users.get(i).name.equals(s)){
                sd = (sender)fhb.users.get(i);
                if(total>sd.money) {
                    System.out.println("余额不足");
                    return;
                }
                sd.send(total,n);
                System.out.println(sd.name+"余额："+sd.money);
            }
        }
        for(int i =0,j=0;i<fhb.users.size();i++)
        {
            if(!fhb.users.get(i).name.equals(s)){
                reciever rc = (reciever)fhb.users.get(i);
                System.out.println(rc.name+"得到了"+sd.listofm.get(j));
                rc.recieve(sd.listofm.get(j));
                j++;
            }
        }

    }
}
