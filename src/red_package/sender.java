package red_package;

import java.util.ArrayList;

public class sender extends user {
    public sender(String name, double money) {
        super(name, money);
    }
    protected ArrayList<Double> listofm = new ArrayList<>();
    public void send(double totalmoney,int times){
        if(this.money<totalmoney){
            System.out.println("余额不足");
            return;
        }
        double left = totalmoney;
        double[] randomnum = new double[times];
        double sumrandom =0;
        for(int i=0;i<times;i++)
        {
            randomnum[i] = Math.random();
            sumrandom+=randomnum[i];
        }
        for(int i=0;i<times-1;i++)
        {
            double x = (int)(Math.round((100*totalmoney-times+i+1)*randomnum[i]/sumrandom));
            x/=100;
            listofm.add(i,x);
            left-=x;
        }
        left = Math.round(left*100);
        listofm.add(times-1,left/100);
        this.money-=totalmoney;
    }
}
