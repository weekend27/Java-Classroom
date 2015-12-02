/*
从标准输入读取一个字符串需要使用BufferedReader的readLine()方法。
它的一般格式是：
String readLine( ) throws IOException
*/

import java.io.*;

public class Demo2{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str;
    System.out.println("Enter lines of text.");
    System.out.println("Enter 'end' to quit.");
    do {
      str = br.readLine();
      System.out.println(str);
    } while(!str.equals("end"));
  }
}
