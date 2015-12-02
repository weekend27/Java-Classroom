/*
重写(Override)
重写是子类对父类的允许访问的方法的实现过程进行重新编写！返回值和形参都不能改变。即外壳不变，核心重写！
重写的好处在于子类可以根据需要，定义特定于自己的行为。
也就是说子类能够根据需要实现父类的方法。
在面向对象原则里，重写意味着可以重写任何现有方法。
*/

class Animal{
  public void move(){
    System.out.println("动物可以移动");
  }
}

class Dog extends Animal{
  public void move(){
    System.out.println("狗可以跑和走");
  }
}

public class TestDog{
  public static void main(String[] args){
    Animal a = new Animal();   //Animal对象
    Animal b = new Dog();   // Dog对象

    a.move();

    b.move();
  }
}
