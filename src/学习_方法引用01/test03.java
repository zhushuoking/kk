package 学习_方法引用01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/*引用构造方法
* 格式 类名::new
*
* 练习 集合中存储姓名和年龄例如 朱硕,23
* 把数据封装成student对象并将收集到list集合中*/
public class test03 {
    static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "朱硕,23", "张三,18", "李四,20");
       /* List<student> students = list.stream().map(new Function<String, student>() {
            @Override
            public student apply(String s) {
                String[] split = s.split(",");
                String name = split[0];
                int age = Integer.parseInt(split[1]);
                return new student(name, age);
            }
        }).collect(Collectors.toList());
        System.out.println(students);没有使用方法引用的情况*/
        List<student> students01 = list.stream().map(student::new).collect(Collectors.toList());
        System.out.println(students01);//引用构造方法
    }
}
