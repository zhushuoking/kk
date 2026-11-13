package 异常;
/*抛出异常
* 抛出异常：throw
* 声明异常：throws
* 需求:定义一个方法求数组最大值*/
public class test06 {
    public static void main(String[] args) {
        int[] arr=null;
        int max = 0;
        try {
            max = getMax(arr);
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("越界异常");
        }
        System.out.println(max);

    }
    public static int getMax(int[] arr) throws NullPointerException,ArrayIndexOutOfBoundsException{
        if (arr==null){//数组为空
            throw new NullPointerException("数组为空");//抛出空指针异常,之后的代码就不执行了
        }
        if (arr.length==0){//数组长度为0
            throw new ArrayIndexOutOfBoundsException("数组长度为0");//抛出数组越界异常,之后的代码就不执行了
        }


        System.out.println("看看有没有执行");
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
