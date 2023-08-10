import java.util.*;

public class condition1 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the number");
        int age=a.nextInt();
        if(age>18){
            System.out.println("adult");
       }
       else
       System.out.println("not adlut");
    }
}