public class LocalVar{
  public void pupAge(){
    int age = 0;
    age += 7;
    System.out.println("Puppy age is: " + age);
  }

  public static void main(String args[]){
    LocalVar lvTest = new LocalVar();
    lvTest.pupAge();
  }
}
