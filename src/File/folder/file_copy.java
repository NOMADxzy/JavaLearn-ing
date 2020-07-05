package File.folder;

import java.io.*;

public class file_copy {
    public static void main(String[] args) throws IOException {
        File file_be_copyed = new File("C:\\JAVA\\test\\src\\File\\folder\\file_be_copyed.txt");
        File file_from_copy = new File("C:\\JAVA\\test\\src\\File\\folder\\file_from_copy");
        FileInputStream fis = new FileInputStream(file_be_copyed);
        FileOutputStream fos = new FileOutputStream(file_from_copy);
        int t = 0;
        while ((t = fis.read())!=-1){
            fos.write(t);
        }
        fis.close();
        fos.close();
    }
}
