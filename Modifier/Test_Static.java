/*
Static修饰符
静态变量：
Static关键字用来声明独立于对象的静态变量，无论一个类实例化多少对象，它的静态变量只有一份拷贝。 静态变量也被成为类变量。局部变量能被声明为static变量。
静态方法：
Static关键字用来声明独立于对象的静态方法。静态方法不能使用类的非静态变量。静态方法从参数列表得到数据，然后计算这些数据。
*/

public class Test_Static{
  private static int numInstances = 0;
  protected static int getCount(){
    return numInstances;
  }

  private static void addInstance(){
    numInstances++;
  }

  Test_Static(){
    Test_Static.addInstance();
  }

  public static void main(String args[]){
    System.out.println("Starting with " +
    Test_Static.getCount() + " instances");
    for (int i = 0; i < 500; i++){
      new Test_Static();
    }
    System.out.println("Created " +
    Test_Static.getCount() + " instances");
  }
}
