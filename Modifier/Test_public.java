/*
被声明为public的类、方法、构造方法和接口能够被任何其他类访问。
如果几个相互访问的public类分布在不用的包中，则需要导入相应public类所在的包。
由于类的继承性，类所有的公有方法和变量都能被其子类继承。
*/

public class Test_public{
  public static void main(String args[]){
    System.out.println("public modifier");
  }
}
