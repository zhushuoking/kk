package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*字节输入流
*
* 步骤：1.创建字节输入流对象
*      2.读数据
*      3.释放资源*/
public class test04_Filein {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        int data = fis.read();//返回的int类型数据，表示读到的字节数据，如果返回-1表示读到文件末尾
        System.out.println((char)data);//强制转换为char类型


        fis.close();//释放资源

    }
}
