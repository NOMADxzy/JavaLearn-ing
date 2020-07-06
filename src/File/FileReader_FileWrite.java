package File;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader_FileWrite {
    public static void main(String[] args) throws IOException {
        File file_folder = new File("C:\\JAVA\\test\\src\\File\\folder");
        if(file_folder.exists()){
            System.out.println("文件夹已存在.");
        }
        else {
            file_folder.mkdir();
        }
        File file1 = new File("C:\\JAVA\\test\\src\\File\\folder\\file_test.txt");
        if(file1.exists()){
            System.out.println("文件已存在.");
        }
        else {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileWriter fileWriter = new FileWriter(file1);
        String k = ("写入了字符串");
        fileWriter.write(k);
        fileWriter.close();
        FileReader fileReader =new FileReader(file1);
        try {
            char[] ch = new char[100];
            fileReader.read(ch);
            System.out.println(ch);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
