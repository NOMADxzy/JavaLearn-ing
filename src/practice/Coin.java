package practice;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Scanner;

public class Coin {
    private HashMap<Integer,String> coinnames = new HashMap<Integer, String>();
    public Coin(){
        coinnames.put(1, "penny");
        coinnames.put(10, "dime");
        coinnames.put(25, "quarter");
        coinnames.put(50, "half-dollar");
    }

    public String getname(int amount){
        if(coinnames.containsKey(amount)) return coinnames.get(amount);
        else return "NotFound";
    }

    public static void main(String[] args){
        Coin coin = new Coin();
        Scanner in = new Scanner(System.in);
        System.out.println("输入你想查找的数字：");
        int amount = in.nextInt();
        System.out.println(coin.getname(amount));
//        for(Integer k : coin.coinnames.keySet()){
//            String s = coin.coinnames.get(k);
//            System.out.println(s);
//        }
    }
}
