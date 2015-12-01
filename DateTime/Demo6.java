/*
SimpleDateFormat 类有一些附加的方法，特别是parse()，
它试图按照给定的SimpleDateFormat 对象的格式化存储来解析字符串。
*/

import java.util.*;
import java.text.*;

public class Demo6{
  public static void main(String[] args){
    SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");

    String input = args.length == 0 ? "1818-11-11" : args[0];

    System.out.print(input + " Parses as ");

    Date t;

    try {
      t = ft.parse(input);
      System.out.println(t);
    } catch(ParseException e){
      System.out.println("Unparseable using " + ft);
    }
  }
}
