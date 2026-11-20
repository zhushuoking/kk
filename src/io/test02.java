package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*字符的写入操作*/
public class test02 {
    public static void main(String[] args) throws IOException {
        /*
        * void write(int b) 一次写一个字节数据
        * void write(byte[] b)  一次写一个字节数组数据
        * void write(byte[] b,int off,int len) 一次写一个字节数组数据的部分数据
        * */
        //创建对象
        FileOutputStream fos = new FileOutputStream("a.txt");

        //写数据
        fos.write(97);//a
        fos.write(98);//b

        //释放资源
        fos.close();

    }
}
