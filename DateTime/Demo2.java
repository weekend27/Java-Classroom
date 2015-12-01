/*
SimpleDateFormat是一个以语言环境敏感的方式来格式化和分析日期的类。
SimpleDateFormat允许你选择任何用户自定义日期时间格式来运行。
*/

import java.util.*;
import java.text.*;

public class Demo2{
  public static void main(String[] args){
    Date dNow = new Date();
    SimpleDateFormat ft =
    new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

    System.out.println("Current Date: " + ft.format(dNow));
  }
}
