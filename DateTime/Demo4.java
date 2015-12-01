/*
使用printf格式化日期:
如果你需要重复提供日期，那么利用这种方式来格式化它的每一部分就有点复杂了。
因此，可以利用一个格式化字符串指出要被格式化的参数的索引。
索引必须紧跟在%后面，而且必须以$结束。
*/

import java.util.Date;

public class Demo4{

  public static void main(String[] args){
    // 初始化 Date 对象
    Date date = new Date();

    // 使用toString()显示日期和时间
    System.out.printf("%1$s %2$tB %2$td, %2$tY",
                      "Due date: ", date);
  }
}
