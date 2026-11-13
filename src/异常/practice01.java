package 异常;
/*需求:
* 键盘录入自己心仪的女朋友姓名和年龄.
* 姓名长度在3-10之间
* 年龄在18-40岁
* 超出这个范围的是异常数据不能赋值,需要重新录入一直录到正确为止
* 提示:
* 需要考虑用户在键盘录入时的所以情况.
* 比如:录入年龄超出范围,录入年龄时录入了abc等情况*/

import java.util.Scanner;

/*抛出:主要是告诉调用者有问题
* 捕获:不要让程序停止*/
public class practice01 {
    static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //创建girl对象
        practice01_Girlfriend girl = new practice01_Girlfriend();
        while (true) {
            try {
                System.out.println("请输入 girlfriend 的姓名:");
                String name=sc.nextLine();
                girl.setName(name);
                System.out.println("请输入 girlfriend 的年龄:");
                String ageStr=sc.nextLine();
                int age=Integer.parseInt(ageStr);
                girl.setAge(age);
                break;//如果没有出错就跳出循环
            } catch (NumberFormatException e) {
                System.out.println("输入的年龄格式不正确");
            }
            catch (RuntimeException e) {
                System.out.println("输入的年龄或者姓名有问题");

            }

        }
        System.out.println(girl);
    }
}
