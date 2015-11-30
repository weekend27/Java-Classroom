import java.io.*;

public class EmployeeTest{
  public static void main(String[] args){
    Employee empOne = new Employee("Lebron James");
    Employee empTwo = new Employee("Kobe Bryant");

    empOne.empAge(30);
    empOne.empDesignation("黑猩猩");
    empOne.empSalary(1200);
    empOne.printEmployee();

    empTwo.empAge(37);
    empTwo.empDesignation("黑曼巴");
    empTwo.empSalary(2300);
    empTwo.printEmployee();
  }
}
