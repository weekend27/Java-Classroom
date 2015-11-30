public class ConstantNum{
  public static void main(String args[]){
    final double PI = 3.1415926;
    int decimal = 100;
    int octal = 0144;
    int hexa = 0x64;
    char a = '\u0001';
    String b = "\u0001";

    System.out.println("PI = " + PI);
    System.out.println("decimal = " + decimal);
    System.out.println("octal = " + octal);
    System.out.println("hexa = " + hexa);
    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
}
