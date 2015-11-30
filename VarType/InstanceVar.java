import java.io.*;

public class InstanceVar{
  public String name;

  private double salary;

  public InstanceVar(String empName){
    name = empName;
  }

  public void setSalary(double empSal){
    salary = empSal;
  }

  public void printEmp(){
    System.out.println("name: " + name);
    System.out.println("salary: " + salary);
  }

  public static void main(String args[]){
    InstanceVar emp = new InstanceVar("weekend");
    emp.setSalary(200000);
    emp.printEmp();
  }
}
