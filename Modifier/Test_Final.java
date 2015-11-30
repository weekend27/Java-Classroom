/*
Final变量能被显式地初始化并且只能初始化一次。
被声明为final的对象的引用不能指向不同的对象。
但是final对象里的数据可以被改变。
也就是说final对象的引用不能改变，但是里面的值可以改变。
Final修饰符通常和static修饰符一起使用来创建类常量。

类中的Final方法可以被子类继承，但是不能被子类修改。
声明final方法的主要目的是防止该方法的内容被修改。

Final类不能被继承，没有类能够继承final类的任何特性。

*/

public class Test_Final{
  final int value = 120;

  public static final int BOXWIDTH = 7;
  static final String TITLE = "Manager";

  public void changeValue(){
    value = 12;  // 错误: 无法为最终变量value分配值
  }
}
