/*
finally关键字
finally关键字用来创建在try代码块后面执行的代码块。
无论是否发生异常，finally代码块中的代码总会被执行。
在finally代码块中，可以运行清理类型等收尾善后性质的语句。
finally代码块出现在catch代码块最后，语法如下：
 try{
    // 程序代码
 }catch(异常类型1 异常的变量名1){
    // 程序代码
 }catch(异常类型2 异常的变量名2){
    // 程序代码
 }finally{
    // 程序代码
 }


注意下面事项：
  catch不能独立于try存在。
  在try/catch后面添加finally块并非强制性要求的。
  try代码后不能既没catch块也没finally块。
  try, catch, finally块之间不能添加任何代码。
*/

import java.io.*;

public class Demo2{
  public static void main(String[] args){
    int a[] = new int[2];
    try{
      System.out.println("Access element three: " + a[3]);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Exception thrown: " + e);
    }
    finally{
      a[0] = 45;
      System.out.println("First element value: " + a[0]);
      System.out.println("The finally statement is executed");
    }
  }
}
