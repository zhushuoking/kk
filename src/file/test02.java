package file;
/*file的常见成员方法(判断,获取)
* 判断:isFile()是否是文件 isDirectory()是否是目录 exists()是否存在 length()长度
* 获取:getName()获取文件名 getAbsolutePath()获取绝对路径 getParent()获取父级路径
* */
import java.io.File;
public class test02 {
    static void main(String[] args) {
        File file=new File("C:\\Users\\48639\\Desktop\\a.txt");
        System.out.println("是否为目录:"+file.isDirectory());
        System.out.println("是否为文件:"+file.isFile());
        long l = file.length();/*length() 返回的是字节数如果我们要m,g可以不断的除以1024进行转换
        这个方法只能获得文件的字节数,文件夹的大小获取不了*/
        System.out.println("文件长度:"+l);
        String path1=file.getAbsolutePath();
        System.out.println("绝对路径:"+path1);
    }
}
