/*
大多时候需要一个有参数的构造方法。
*/

class MyClass{
  int x;

  // 构造函数
  MyClass(int i){
    x = i;
  }
}

public class Demo6{
  public static void main(String[] args){
    MyClass t1 = new MyClass(12);
    MyClass t2 = new MyClass(45);
    System.out.println(t1.x + " " + t2.x);
  }
}
