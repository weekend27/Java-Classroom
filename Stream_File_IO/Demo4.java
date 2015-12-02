/*
下面是一个演示InputStream和OutputStream用法的例子：
*/

import java.io.*;

public class Demo4{
  public static void main(String[] args){
    try{
      byte bWrite[] = {11,22,33,44,55};
      OutputStream os = new FileOutputStream("test.txt");
      for (int x = 0; x < bWrite.length; x++){
        os.write(bWrite[x]);
      }
      os.close();

      InputStream is = new FileInputStream("test.txt");
      int size = is.available();

      for (int i = 0; i < size; i++){
        System.out.print((char)is.read() + " ");
      }
      is.close();
    }catch(IOException e){
      System.out.print("Exception");
    }
  }
}
