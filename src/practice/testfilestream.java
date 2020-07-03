package practice;

import java.io.*;

public class testfilestream {
    public static void main(String[] args) {
        byte[] buf = new byte[10];
        int i;
        for(i=0;i<buf.length;i++)
        {
            buf[i] = (byte)i;
        }
        try {
            DataOutputStream out = new DataOutputStream( new BufferedOutputStream(new FileOutputStream("a.dat")));
            DataInputStream in =new DataInputStream(new BufferedInputStream(new FileInputStream("a.dat")));
            int k = 123456;
            out.writeInt(k);
            out.close();
            int j = in.readInt();
            System.out.println(j);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
