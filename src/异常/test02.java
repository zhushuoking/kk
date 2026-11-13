package 异常;
/*try    catch捕获异常
* 格式:
* try{
*   可能出现异常的代码;
*   }catch(异常类型 变量名){
*   异常处理代码;
*   }
* */
public class test02 {
    static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        try {
            System.out.println(arr[10]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界了");
        }
        System.out.println("继续执行");
    }
}
