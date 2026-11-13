package 学习_方法引用01;
import java.util.ArrayList;
import java.util.Collections;

/*2,引用成员方法
* 格式：对象名::成员方法名
* 其他类:类名::成员方法名
* 本类this::方法名
* 父类super::方法名
*
* 集合中有一些名字按照要求进行过过滤
* 要求:只要以张开头且名字是三个字的*/
public class test02 {
    static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list, "张三", "张三丰", "张无忌", "赵六", "王五");
       /* list.stream().filter(s->s.startsWith("张")&&s.length()==3)
                .forEach(s-> System.out.println(s));*/

        //引用成员方法
        /*list.stream().filter(new fun()::fun01)
                .forEach(s-> System.out.println(s));*/

        //引用成员方法
        list.stream().filter(new test02()::fun01)//无法使用this只能创建对象
                .forEach(s-> System.out.println(s));


    }
    public boolean fun01(String s){
        return s.length()==3&&s.startsWith("张");
    }//static静态方法是没有this的

}
