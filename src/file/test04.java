package file;

import java.io.File;

/*删除文件或文件夹*/
public class test04 {
    public static void main(String[] args) {
        File f1=new File("D:\\java_code\\a1");
        /*删除是直接删除 不会走回收站
        * 如果删除的是有内容的文件夹则删除失败*/
        boolean delete = f1.delete();
        System.out.println(delete);
    }
}
