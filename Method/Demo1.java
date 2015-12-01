/*
方法调用
*/

public class Demo1{
  /** 主方法 **/
  public static void main(String[] args){
    int a = 23;
    int b = 24;
    int larger = max(a, b);
    System.out.println("Larger one between 23 and 24 is " + larger);
  }

  /** 返回两个数值的较大者 **/
  public static int max(int num1, int num2){
    return (num1 > num2) ? num1 : num2;
  }
}
