/*
有时候你希望运行一个程序时候再传递给它消息。这要靠传递命令行参数给main()函数实现。
命令行参数是在执行程序时候紧跟在程序名字后面的信息。
*/
public class Demo4{
  public static void main(String[] args){
    for (int i = 0; i < args.length; i++){
      System.out.println("args[" + i + "]: " + args[i]);
    }
  }
}
