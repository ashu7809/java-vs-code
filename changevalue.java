import java.util.*;
public class changevalue {
  public static void main(String[] args) {
    int[] arr={1,2,45,6,6,};
    change(arr);
    System.out.println(Arrays.toString(arr));
  }
  static void change(int [] nums){
    nums[0]=99;
  }
}
