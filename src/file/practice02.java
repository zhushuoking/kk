package file;

import java.io.File;

/*定义一个方法找某一个文件夹中是否以txt结尾的文件(暂不考虑子文件夹)*/
public class practice02 {
    public static void main(String[] args) {
        File f1=new File("D:\\java_code\\a2");
        System.out.println(findTxtFile(f1));
    }

    public static boolean findTxtFile(File file){
        File [] files = file.listFiles();
        if(files!=null){
            for (File file1 : files) {
                if (file1.isFile() && file1.getName().endsWith(".txt")) {
                    System.out.println(file1);
                    return true;
                }


            }
        }

        return false;
    }
}
