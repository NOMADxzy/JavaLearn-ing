package File;

import java.io.File;
import java.io.IOException;

public class fileclass {
    public static void main(String[] args) throws IOException {
        File file = new File(".\\file_test_1.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.getCanonicalPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());

        File path = new File("C:\\JAVA\\test\\src\\File\\folder");
        File file1 = new File(path,"child.txt");
//        System.out.println(file1.length());
// 打印path下每一个文件
//        String[] arr = path.list();
//        for(String k:arr){
//            System.out.println(k);
//        }

    }
}
