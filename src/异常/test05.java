package 异常;
/*异常中常见的的方法*/
/*public String getMessage()：返回异常的描述信息
* public String toString()：返回异常的类型和描述信息
* public void printStackTrace()：打印异常的类型、描述信息和堆栈信息*/
public class test05 {
    static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};

        try {
            System.out.println(arr[10]);//选中可能出异常的代码按住c加a加t可以自动生成
        } catch (ArrayIndexOutOfBoundsException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
        System.out.println("继续执行");
    }
}
