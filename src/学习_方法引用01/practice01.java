package 学习_方法引用01;

import java.util.ArrayList;
import java.util.Collections;

/*练习1:
集合中存储一些字符串的数据,比如:张三,23
收集到student类型的数组中(使用方法引用完成)
* */
public class practice01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三,23", "李四,24", "王五,25");
        student[] students = list.stream().map(student::new).toArray(student[]::new);
    }
}
