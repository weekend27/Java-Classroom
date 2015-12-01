/*
首先声明了一个数组变量myList，接着创建了一个包含10个double类型元素的数组，并且把它的引用赋值给myList变量。
*/
public class Demo1{
  public static void main(String[] args){
    // 数组大小
    int size = 10;
    // 定义数组
    double[] myList = new double[size];
    myList[0] = 12.4;
    myList[1] = 14.6;
    myList[2] = 12.6;
    myList[3] = 11.8;
    myList[4] = 13.5;
    myList[5] = 12.4;
    myList[6] = 13.7;
    myList[7] = 13.9;
    myList[8] = 12.5;
    myList[9] = 13.8;
    // 计算所有元素的总和
    double total = 0.0;
    for (int i = 0; i < size; i++){
      total += myList[i];
    }
    System.out.println("总和为：" + total);
  }
}
