package computer;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class UseCompute {
    private HashMap<String,compute> computes = new HashMap<String, compute>();
    private int outcome;
    private int x;
    private int y;
    private compute COM;
    private boolean out = false;
    private boolean wrong =false;
    public UseCompute(){
        computes.put("+", new add());
        computes.put("-", new subtract());
        computes.put("*", new multiply());
        computes.put("/", new divide());
        out = false;
        wrong = false;
    }
    public void getxy(String s){
        for(String k : computes.keySet()){
            if(s.contains(k))
            {
                this.COM = computes.get(k);
                int t = s.indexOf(k);
                this.x=Integer.parseInt(s.substring(0,t));
                this.y=Integer.parseInt(s.substring(t+1),10);
                return;
            }
        }
        if(s.equals("out")) out = true;
        else wrong = true;
    }
    public void useCom(compute com,int a,int b){
        this.outcome = com.computer(a,b);
    }
    public void run(){
        System.out.println("请输入你要计算的表达式，如：2+3,输入out结束运算");
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        this.getxy(line);
        if(!out&&!wrong)
        {
            this.useCom(COM,x,y);
            System.out.println(outcome);
        }

    }
    public static void main(String[] args){
        UseCompute Com = new UseCompute();
        while (!Com.out){
            Com.run();
        }
    }
}
