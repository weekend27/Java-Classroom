/*
使用printf格式化日期:
printf方法可以很轻松地格式化时间和日期。
使用两个字母格式，它以t开头并且以下面表格中的一个字母结尾。
*/

import java.util.Date;

public class Demo3{
  public static void main(String[] args){
    // 初始化 Date 对象
    Date date = new Date();

    // 使用toString()显示日期和时间
    String str = String.format("Current Date/Time : %tc", date);

    System.out.printf(str);
  }
}
