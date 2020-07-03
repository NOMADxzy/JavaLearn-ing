package practice;

import java.util.Scanner;

public class numbertest {
    public static boolean isprime(int x){
        boolean isp = false;
        if(x==1) isp = true;
        else
        {
            int i;
            for(i=2; i<x; i++)
            {
                if(x%i==0) break;
            }
            if(i==x) isp =true;
        }
        return isp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入该偶数");
        int n = in.nextInt();
        int k,j=0;
        int[] prime = new int[n];
        for(k=1;k<n;k++){
            if(isprime(k)&&isprime(n-k)){
                prime[j] = k;
                j++;
            }
        }
        for(j=0;j<prime.length;j++){
            if(prime[j]!=0&&(prime[j]<=n/2))
            System.out.println(prime[j]+" "+(n-prime[j]));
        }
    }
}
