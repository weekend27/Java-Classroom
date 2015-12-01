/*
start 和end 方法
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2{
  private static final String REGEX = "\\bcat\\b";  //   \b匹配一个字边界，即字与空格间的位置。例如，"er\b"匹配"never"中的"er"，但不匹配"verb"中的"er"。
  private static final String INPUT = "cat cat cat cattie cat";

  public static void main(String[] args){
    Pattern p = Pattern.compile(REGEX);
    Matcher m = p.matcher(INPUT);   // 获取 matcher 对象
    int count = 0;
    while(m.find()){
      count++;
      System.out.println("Match number " + count);
      System.out.println("start(): " + m.start());
      System.out.println("end(): " + m.end());
    }
  }
}
