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
        * b为字节数组 off为从字节数组的off位置开始写 len为写len个字节
        * */
        //创建对象
        FileOutputStream fos = new FileOutputStream("a.txt");

        //写数据
        //fos.write(97);//a
        //fos.write(98);//b
        byte[] bytes = {97,98,99,100,101};
        //fos.write(bytes);//一次写一个字节数组数据
        fos.write(bytes,1,3);//一次写一个字节数组数据的部分数据
        //释放资源
        fos.close();

    }
}
