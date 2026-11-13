package 学习_方法引用01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collectors;

/*方法引用的分类
1,静态方法引用
格式：类名::静态方法名
需求:
把集合中的数据改为int型数据
* */
public class test01 {
    static void main(String[] args) {
        //创建集合并添加元素
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");//添加元素
        //一般方法转换
         /*list.stream().map(new Function<String, Integer>() {
             @Override
             public Integer apply(String s) {
                 int i=Integer.parseInt(s);
                 return i;
             }
         }).forEach(s-> System.out.println(s));*/
        //使用方法引用
        /*1,方法需要已经存在
        * 2,方法的形参和返回值需要和抽象方法的形参返回值一样
        * 3,方法的功能需要把形参的字符串转换成整数*/
        list.stream().map(Integer::parseInt).forEach(s-> System.out.println(s));
    }
}
/*方法引用时注意
* 1,需要有函数式接口
* 2,被引方法必须已经存在
* 3,被引用方法的形参和返回值需要和抽象方法保持一致
* 4,被引用方法的功能要满足当前的需求*/