package practice;

import java.io.*;
import java.util.Scanner;

public class testtxtreadwrite {
    public static void main(String[] args) {
        byte[] buf = new byte[10];
        int i;
        for(i=0;i<buf.length;i++)
        {
            buf[i] = (byte)i;
        }
        try {
            PrintWriter out = new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    new FileOutputStream("a.txt"))));
//            DataInputStream in =new DataInputStream(new BufferedInputStream(new FileInputStream("a.dat")));
            String s = "今天非常热，6月30日。";
            out.close();
            out.println(s);
            BufferedReader in =  new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("C:/JAVA/test/src/practice/Coin.java")));
            String line;
            while ((line = in.readLine())!=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
