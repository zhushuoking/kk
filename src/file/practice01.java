package file;
import java.io.File;
import java.io.IOException;

/*在a2中创建aaa文件夹中创建a.txt文件*/
public class practice01 {
    static void main(String[] args) throws IOException {
        File f1 = new File("D:\\java_code\\a2\\aaa");
        f1.mkdirs();
        File f2 = new File(f1, "a.txt");

        boolean b = f2.createNewFile();
        if (b){
            System.out.println("文件创建成功");
        }else{
            System.out.println("文件创建失败");
        }
    }
}
