/*
使用 BufferedReader 在控制台读取字符
*/

import java.io.*;

public class Demo1{
  public static void main(String args[]) throws IOException{
    char c;
    // 使用 System.in 创建 BufferedReader
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter characters, 'q' to quit.");
    // 读取字符
    do {
      c = (char)br.read();
      System.out.println(c);
    } while(c != 'q');
  }
}
