package file;
import java.io.File;

/*(重点掌握)public File[] listFiles() 获取当前路径下所有内容*/
public class test07 {
   public  static void main(String[] args) {
        File f1=new File("D:\\java_code\\a2");
        File[] files = f1.listFiles();//获取当前路径下所有内容
        for (File file : files) {
            // 判断是否是文件且文件名以.txt结尾
            if(file.isFile() && file.getName().endsWith(".txt")){
                System.out.println(file);
            }
        }
    }
}
