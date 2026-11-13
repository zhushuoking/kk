package 学习_方法引用01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Arrays;

/*练习2:
* 创建集合添加学生对象,学生对象属性:name,age
* 只获取姓名放到数组当中，使用方法引用完成*/
public class practice02 {
    static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();
        list.add(new student("张三", 23));
        list.add(new student("李四", 24));
        list.add(new student("王五", 25));

        String[] array = list.stream().map(student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(array));
    }
}
