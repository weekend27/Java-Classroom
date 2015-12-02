/*
一个目录其实就是一个File对象，它包含其他文件和文件夹。
如果创建一个File对象并且它是一个目录，那么调用isDirectory( )方法会返回true。
可以通过调用该对象上的list()方法，来提取它包含的文件和文件夹的列表。
*/

import java.io.File;

public class Demo7{
  public static void main(String[] args){
    String dirname = "/home/ztb/HuangwjProjects/code-java/Java-Classroom";
    File f1 = new File(dirname);
    if (f1.isDirectory()){
      System.out.println("Directory of " + dirname);
      String s[] = f1.list();
      for (int i = 0; i < s.length; i++){
        File f = new File(dirname + "/" +s[i]);
        if (f.isDirectory()){
          System.out.println(s[i] + " is a directory");
        }else {
          System.out.println(s[i] + " is a file");
        }
      }
    }else {
      System.out.println(dirname + " is not a directory");
    }
  }
}
