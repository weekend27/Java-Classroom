/*
创建字符串
String类有11种构造方法，这些方法提供不同的参数来初始化字符串，比如提供一个字符数组参数:

注意:String类是不可改变的，所以你一旦创建了String对象，那它的值就无法改变了。
如果需要对字符串做很多修改，那么应该选择使用StringBuffer & StringBuilder 类。
*/
public class Demo1{
  public static void main(String args[]){
    char[] helloArray = {'h', 'e', 'l', 'l', 'o', '.'};
    String helloString = new String(helloArray);
    System.out.println(helloString);
  }
}
