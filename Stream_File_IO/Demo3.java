/*
PrintStream 继承了OutputStream类，并且实现了方法write()。这样，write()也可以用来往控制台写操作。
PrintStream 定义write()的最简单格式如下所示：
void write(int byteval)
*/

import java.io.*;

// 演示 System.out.write().
// 注意：write()方法不经常使用，因为print()和println()方法用起来更为方便。
public class Demo3{
  public static void main(String[] args){
    int b = 'A';
    System.out.write(b);
    System.out.write('\n');
  }
}
