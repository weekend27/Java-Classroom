/*
当一个对象被创建时候，构造方法用来初始化该对象。构造方法和它所在类的名字相同，但构造方法没有返回值。
通常会使用构造方法给一个类的实例变量赋初值，或者执行其它必要的步骤来创建一个完整的对象。
不管你与否自定义构造方法，所有的类都有构造方法，因为Java自动提供了一个默认构造方法，它把所有成员初始化为0。
一旦你定义了自己的构造方法，默认构造方法就会失效。
*/

class MyClass{
  int x;

  // 构造函数
  MyClass(){
    x = 103;
  }
}

public class Demo5{
  public static void main(String[] args){
    MyClass t1 = new MyClass();
    MyClass t2 = new MyClass();
    System.out.println(t1.x + " " + t2.x);
  }
}
