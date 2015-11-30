/*
instanceOf 运算符
该运算符用于操作对象实例，检查该对象是否是一个特定类型（类类型或接口类型）。
instanceof运算符使用格式如下：
( Object reference variable ) instanceOf  (class/interface type)
*/

class Vehicle{}

public class Car extends Vehicle{
  public static void main(String args[]){
    Vehicle a = new Car();
    boolean result = a instanceof Car;
    System.out.println(result);
  }
}
