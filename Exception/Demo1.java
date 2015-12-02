/*
下面的例子中声明有两个元素的一个数组，当代码试图访问数组的第三个元素的时候就会抛出一个异常。
*/

import java.io.*;
public class Demo1{
  public static void main(String[] args){
    try{
      int a[] = new int[2];
      System.out.println("Access element three: " + a[3]);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Exception thrown: " + e);
    }
    System.out.println("Out of the block");
  }
}
