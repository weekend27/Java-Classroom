// import java.io.*;

public class ClassVar{
  // salary是静态的私有变量
  private static double salary;
  // DEPARTMENT是一个常量
  public static final String DEPARTMENT = "CS";
  public static void main(String args[]){
    salary = 25000;
    System.out.println(DEPARTMENT + "average salary: " + salary);
  }
}
