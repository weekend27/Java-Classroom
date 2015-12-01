/*
JDK 1.5 开始，Java支持传递同类型的可变参数给一个方法。
方法的可变参数的声明如下所示：
typeName... parameterName
在方法声明中，在指定参数类型后加一个省略号(...) 。
一个方法中只能指定一个可变参数，它必须是方法的最后一个参数。任何普通的参数必须在它之前声明。
*/

public class Demo7{
  public static void main(String[] args){
    // 调用可变参数的方法
    printMax(34, 3, 3, 2, 75.6);
    printMax(new double[]{1, 2, 3});
  }

  public static void printMax(double... nums){
    if (nums.length == 0){
      System.out.println("No argument passed");
      return;
    }

    double result = nums[0];
    for (int i = 1; i < nums.length; i++){
      if (nums[i] > result)
        result = nums[i];
    }
    System.out.println("The max value is " + result);
  }
}
