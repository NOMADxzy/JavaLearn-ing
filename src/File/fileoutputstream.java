package File;

import java.io.*;

public class fileoutputstream {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\JAVA\\test\\src\\File\\folder\\fileoutputstream");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] b = {97,98,99,100,65,66,67};
        fileOutputStream.write(b,0,7);
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(file);
        //字节方式读
//        int c;
//        while (( c = fileInputStream.read())!=-1){
//            System.out.print(c+" ");
//        }
//        System.out.println("=======================");
        //字节流方式读
        byte[] bytes = new byte[1024];
        int leng = 0;
        while (true) {
            leng = fileInputStream.read(bytes);
            if (leng != -1){
                for(int i = 0;i<leng;i++) System.out.print(bytes[i]+" ");
                System.out.println();
            }
            else break;
        }
    }
}
