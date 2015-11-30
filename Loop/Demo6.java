/*
continue
*/

public class Demo6{
  public static void main(String args[]){
    int[] nums = {12, 23, 34, 45, 56};
    for (int num : nums){
      if (num == 34){
        continue;
      }
      System.out.println(num);
    }
  }
}
