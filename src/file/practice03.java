package file;
import java.io.File;

/*定义一个方法找到所有以txt结尾的文件
*
* 使用递归*/
public class practice03 {
    public static void main(String[] args) {
        File f1=new File("D:\\java_code\\a2");
        findTxtFile(f1);



    }

    public static void findTxtFile(File file){
        File [] files = file.listFiles();
        if(files!=null){
            for (File f1 : files) {
                if(f1.isFile()){
                    String name = f1.getName();
                    if(name.endsWith(".txt")){
                        System.out.println(f1);
                    }
                }
                else {
                    findTxtFile(f1);
                }
            }



        }




    }
}
