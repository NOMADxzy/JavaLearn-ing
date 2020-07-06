package File;

import java.io.*;

public class fileoutputstream {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\JAVA\\test\\src\\File\\folder\\fileoutputstream.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        OutputStreamWriter osw = new OutputStreamWriter(fileOutputStream);
        //字节方式写
//        byte[] b = {97,98,99,100,65,66,67};
//        fileOutputStream.write(b);
//        fileOutputStream.close();
        //字符串方式写
        String s_writer = ("112233");
        osw.write(s_writer);
        osw.close();
        //

        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fileInputStream);
        //字节方式读
//        int c;
//        while (( c = fileInputStream.read())!=-1){
//            System.out.print(c+" ");
//        }
//        System.out.println("=======================");
        //字节流方式读
//        byte[] bytes = new byte[1024];
//        int leng = 0;
//        while (true) {
//            leng = fileInputStream.read(bytes);
//            if (leng != -1){
//                for(int i = 0;i<leng;i++) System.out.print(bytes[i]+" ");
//                System.out.println();
//            }
//            else break;
//        }
        //字符方式读
//        char[] s_reader = new char[256];
//        int len = 0;
//        len = isr.read(s_reader);
//        System.out.println(new String(s_reader,0,len));
    }
}
