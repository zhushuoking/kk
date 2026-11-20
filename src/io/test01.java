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
        //参数可以是路径也可以是File对象
        FileOutputStream fos = new FileOutputStream("a.txt");//如果文件不存在则创建文件,但父级路径要存在

        //2:写出数据
        fos.write(97);
        //如果文件已经存在,构造方法会清空文件
        //参数为整数则在文件中以ASCII码形式写入例如97写入的是a

        fos.close();//释放资源
        //每次使用后都要释放资源
        //不释放资源就相当于java会一直打开文件,占着文件,导致文件不能被其他程序使用

    }
}
