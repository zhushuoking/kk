package 学习_方法引用01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

/*使用类名引用成员方法
格式：类名::方法名
练习:
集合里面一些字符串,要求变成大写后进行输出
* */
public class test04 {
    static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "bbb", "ccc");
       /* list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(System.out::println);*/
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
