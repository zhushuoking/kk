package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*换行和续写
*换行:
* 在要换行的位置写入换行符即可换行
* 在win里换行符为: \r\n win有优化可以简写\r或\n表示回车换行
* linux:\n  表示换行
* mac:\r  表示换行
*
* 续写:
* 在创建文件输出流对象的时候("a.txt",true),后面一个参数改为true即可实现续写,也就是不会删除原有内容,而是继续写入
* */
public class test03 {
    public static void main(String[] args) throws IOException {
        //换行写
        FileOutputStream fos = new FileOutputStream("a.txt",true);
        String str1 = "helloworld";
        byte[] bytes = str1.getBytes(StandardCharsets.UTF_8);
        fos.write(bytes);

        fos.write("\r\n".getBytes(StandardCharsets.UTF_8));//换行

        String str2 = "你好世界";
        byte[] bytes2 = str2.getBytes(StandardCharsets.UTF_8);
        fos.write(bytes2);

        fos.write("\r\n".getBytes(StandardCharsets.UTF_8));
        fos.close();
    }
}
