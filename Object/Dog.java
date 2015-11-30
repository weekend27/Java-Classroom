public class Dog{
  int age;
  String color;

  public void barking(){
    System.out.println("wang!wang!!wang!!!");
  }
  public void hungry(){
    System.out.println("I am hungry!!!");
  }
  public void sleeping(){
    System.out.println("Sleeping...Do not disturb me!");
  }

  public static void main(String[] args){
    Dog dog = new Dog();
    dog.age = 13;
    dog.color = "yellow";

    System.out.println(dog.age);
    System.out.println(dog.color);

    dog.barking();
    dog.hungry();
    dog.sleeping();
  }
}
