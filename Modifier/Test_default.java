/*
使用默认访问修饰符声明的变量和方法，对同一个包内的类是可见的。
接口里的变量都隐式声明为public static final,
而接口里的方法默认情况下访问权限为public。
*/

public class Test_default{
  String version = "1.7.0_76";
  boolean processOrder(){
    return true;
  }
}
