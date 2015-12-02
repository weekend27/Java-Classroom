/*
通过使用关键字extends，子类可以继承父类的除private属性外所有的属性。
我们通过使用instanceof 操作符，能够确定Mammal IS-A Animal
*/

class Animal{
}

class Mammal extends Animal{
}

class Reptile extends Animal{
}

public class Dog extends Mammal{
  public static void main(String[] args){
    Animal a = new Animal();
    Mammal m = new Mammal();
    Dog d = new Dog();

    System.out.println(m instanceof Animal);
    System.out.println(d instanceof Mammal);
    System.out.println(d instanceof Animal);
  }
}
