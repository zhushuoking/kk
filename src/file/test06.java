package file;
import java.io.File;
import java.util.Arrays;
import java.io.IOException;

/*获取并遍历
*
* public static File[] listRoots() 获取系统中的根目录,盘符
* public String[] list() 获取目录中的文件和文件夹的名称数组
* (重点掌握)public File[] listFiles() 获取当前路径下所有内容*/
public class test06 {
    public static void main(String[] args) {
       /* File[] files = File.listRoots();
        System.out.println(Arrays.toString(files));//[C:\, D:\]*/
        File file = new File("D:\\java_code\\a2");
        String[] list = file.list();//获取目录中的文件和文件夹的名称数组
        for (String s : list) {
            System.out.println(s);
        }
        File f1=new File("D:\\java_code\\a2\\s.txt");
        try {
            f1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
