package file;

import java.io.File;
import java.io.IOException;

/*file的成员方法(创建 删除)*/
/*public boolean createNewFile() 创建一个新的空文件夹
* public boolean mkdir() 创建一个单级文件夹
* public boolean mkdirs() 创建多级文件夹
* public boolean delete() 删除文件夹*/
public class test03 {
    public static void main(String[] args) throws IOException {
        /*File f1=new File("D:\\java_code\\b.txt");//如果当前路径文件不存在方法返回true，存在返回false
        boolean newFile = f1.createNewFile();//createNewFile创建的一定是文件

        File f2=new File("D:\\java_code\\a1");
        *//*如果路径已存在则创建失败
        * 只能创建单级目录*//*
        boolean mkdir = f2.mkdir();//mkdir创建的一定是文件夹*/

        File f3=new File("D:\\java_code\\a2\\a3");
        /*如果路径已存在则创建失败
        * 可以创建多级目录*/
        boolean mkdirs = f3.mkdirs();//mkdirs创建的一定是文件夹
    }
}
