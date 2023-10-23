import java.util.*;
public class arraysof_object {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the name");
    String[] str=new String[4];
    for(int i=0;i<str.length;i++){
        str[i]=sc.next();
    }
    System.out.println(Arrays.toString(str));
    //modify
    str[2]="kunal";
     System.out.println(Arrays.toString(str));
    }
}
