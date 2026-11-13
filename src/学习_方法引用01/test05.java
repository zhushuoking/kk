package 学习_方法引用01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.IntFunction;
import java.util.Arrays;


/*引用数组的构造方法
格式: 数组类型[]::new
规范: int[]::new

练习
集合中存储一些整数,收集到数组当中
* */
public class test05 {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5);
        Integer[] array1 = list.stream().toArray(Integer[]::new);
        Integer[] array = list.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));

    }
}
