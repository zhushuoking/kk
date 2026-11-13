package 异常;
/*自定义异常类*/
/*运行时异常:继承RuntimeException
* 编译时异常:继承Exception 核心提醒程序员检查本地信息*/
public class NameFormatException extends RuntimeException{
    public NameFormatException() {
    }//无参构造

    public NameFormatException(String message) {
        super(message);
    }//有参构造
}
