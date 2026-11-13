package file;

import java.io.File;

/*删除一个多级文件夹*/
public class practice04 {
    public static void main(String [] args){
        File f1=new File("D:\\java_code\\a2\\cc");//创建文件路径
        deleteDir(f1);
    }


    public static void deleteDir(File dir){
        if(dir.exists()&&dir.isDirectory()){
            File [] files=dir.listFiles();
            for (File file : files) {
                if(file.isDirectory()){
                    deleteDir(file);
                }
                file.delete();
            }
        }
        dir.delete();


    }
}
