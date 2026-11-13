package file;
/*
* public File(String pathname) 根据文件路径创建文件对象
* public File(String parent, String child) 根据父路径和子路径创建文件对象
* public File(File parent, String child) 根据父文件对象和子路径创建文件对象
* 路径:"C:\Users\48639\Desktop\a.txt"
* */
import java.io.File;
public class test01 {
    static void main(String[] args) {
        String str="C:\\Users\\48639\\Desktop\\a.txt";
        File file=new File(str);//根据文件路径创建文件对象,变成对象的目的就是使用对象调用方法
        System.out.println(file);
        //C:\Users\48639\Desktop父级路径
        //a.txt 子级路径
    }
}
