package practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Bus_Station {
    private static LinkedHashMap<Integer,String> stations = new LinkedHashMap<>();
    public static void Init_Bus_Station(){
        stations.put(1, "朱辛庄");
        stations.put(2, "育知路");
        stations.put(3, "平西府");
        stations.put(4, "回龙观东大街");
        stations.put(5, "霍营");
        stations.put(6, "育新");
        stations.put(7, "西小口");
        stations.put(8, "永泰庄");
        stations.put(9, "林萃桥");
        stations.put(10, "森林公园南门");
        stations.put(11, "奥林匹克公园");
        stations.put(12, "奥体中心");
        stations.put(13, "北土城");
    }
    public static int getIndex(String s){
        for(int k:stations.keySet()){
            if(stations.get(k).equals(s)) return k;
        }
        return 0;
    }
    public static int getPrice(String s1,String s2){
        int index1 = getIndex(s1);
        int index2 = getIndex(s2);
        while (index1!=0&&index2!=0){
            int price = 3;
            int abs = Math.abs(index1-index2);
            if(abs<=3) price = 3;
            else if(abs<=5) price = 4;
            else{
                price+=(abs - 5)*2;
                if(price>10) price=10;
            }
            return price;
        }
        return 0;
    }

    public static void main(String[] args) {
        String start_station;
        String end_station;
        Init_Bus_Station();
        Scanner in = new Scanner(System.in);
        System.out.println("请输入上车站");
        start_station = in.nextLine();
        while (getIndex(start_station)==0){
            System.out.println("您输入的车站:"+start_station+"不存在，请从新输入");
            start_station = in.nextLine();
        }
        System.out.println("请输入到达站");
        end_station = in.nextLine();
        while ((getIndex(end_station))==0){
            System.out.println("您输入的车站"+end_station+"不存在，请重新输入");
            end_station = in.nextLine();
        }
        int price = getPrice(start_station,end_station);
        int time = Math.abs(getIndex(start_station)-getIndex(end_station))*2;
        System.out.println("从"+start_station+"到"+end_station+"大约需要"+time+"分钟，收费"+price+"元,祝您旅途愉快");//TODO
    }
}
