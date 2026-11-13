package 异常;
/*try中遇到多个问题怎么办
* 写多个catch进行捕获
* 如果捕获多个异常存在父子关系那么父类Exception要放在最后*/
public class test03 {
    static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        try{
            System.out.println(arr[10]);
            System.out.println(10/0);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界了");
        }catch (ArithmeticException e){
            System.out.println("除零错误");
        }
    }
}
