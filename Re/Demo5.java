/*
Matcher 类也提供了appendReplacement 和appendTail 方法用于文本替换
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo5{
  private static String REGEX = "a*b";
  private static String INPUT = "aabfooaabfooabfoob";
  private static String REPLACE = "-";

  public static void main(String[] args){
    Pattern p = Pattern.compile(REGEX);
    // get matcher object
    Matcher m = p.matcher(INPUT);
    StringBuffer sb = new StringBuffer();
    while(m.find()){
      m.appendReplacement(sb,REPLACE);
    }
    m.appendTail(sb);
    System.out.println(sb.toString());
  }
}
