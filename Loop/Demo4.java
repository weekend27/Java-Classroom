/*
another for loop, so simple
format:
for(声明语句 : 表达式)
{
   //代码句子
}
*/

public class Demo4{
  public static void main(String args[]){
    int[] nums = {12, 23, 34, 45, 56};
    for (int num : nums){
      System.out.println(num);
    }

    String[] names = {"James", "Paul", "Tom"};
    for (String name : names){
      System.out.println(name);
    }
  }
}
