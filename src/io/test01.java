package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

/*io的概述
*
* 纯文本文件:电脑能够用记事本打开且可以直接看懂的文件,例如:txt,md文件
*
* FileOutputStream:操作本地文件的字节输出流,可以吧程序中的数据写到本地文件中
* 书写步骤:1,创建字节输出流对象
*         2,写数据
*         3,释放资源
* */
public class test01 {
    public static void main(String[] args) throws IOException {
        //1:创建对象
        FileOutputStream fos = new FileOutputStream("a.txt");
        //2:写出数据
        fos.write(97);
        fos.close();
    }
}
