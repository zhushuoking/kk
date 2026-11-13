package file;
import java.io.File;

/*file中的方法(获取并遍历)*/
/*public File[] listFile() 获取当前该路径下所以内容
* 当前路径下没有内容时返回null
* 当路径表示的是文件时返回null
* 当是空文件夹时返回length为0的File对象数组
* 当前路径下有内容时返回File对象数组
* 当表示的是有权限的文件夹返回的是null*/
public class test05 {
    static void main(String[] args) {
        File f1=new File("D:\\java_code\\a2\\cc");
        File f2=new File("D:\\java_code\\a2");
        f1.mkdir();
        File[] files = f2.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
