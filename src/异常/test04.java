package 异常;
/*如果try中遇到的问题没有被捕获那么怎么执行
* 相当于try  catch的代码白写了最终交给jvm处理
* 如果try中遇到问题那么try的下面就不会执行,直接进入到catch里执行*/
public class test04 {
    static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        try{
            System.out.println(arr[10]);
            System.out.println("看看自己执行吗");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界了");
        }
        System.out.println("继续执行");
    }
}
