/*
matches 和lookingAt 方法都用来尝试匹配一个输入序列模式。
它们的不同是matcher要求整个序列都匹配，而lookingAt 不要求。
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo3{
  private static final String REGEX = "foo";
  private static final String INPUT = "foooooooooooooooooooo";
  private static Pattern pattern;
  private static Matcher matcher;

  public static void main(String[] args){
    pattern = Pattern.compile(REGEX);
    matcher = pattern.matcher(INPUT);

    System.out.println("Current REGEX is: " + REGEX);
    System.out.println("Current INPUT is: " + INPUT);

    System.out.println("lookingAt(): " + matcher.lookingAt());
    System.out.println("matcher(): " + matcher.matches());
  }
}
