/*
Java中获取当前日期和时间很简单，使用Date对象的 toString()方法来打印当前日期和时间
*/
import java.util.Date;

public class Demo1{
  public static void main(String[] args){
    // 初始化Date对象
    Date date = new Date();

    // 使用 toString() 函数显示日期时间
    System.out.println(date.toString());
  }
}
