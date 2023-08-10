import java.util.*;
public class greater_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the number");
        // int n=sc.nextInt();
        // if(n%2==0)
        // {
        //     System.out.println("Even");
        // }
        // else{
        //     System.out.println("ODD");
        // }

        System.out.println("Enter the number a");
        int a=sc.nextInt();
        System.out.println("Enter the number b");
        int b=sc.nextInt();
        // if(a==b)
        // {
        //     System.out.println("Equal");
        // }
        // else if(a>b)
        // {
        //     System.out.println("a is greater than b");
        // }
        // else
        // System.out.println("b is greater ");
         

        if(a==b)
        {
            System.out.println("EQUAL");
        }
        else{
            if(a>b)
         {
            System.out.println("a is greater than b");
         }
         else
         {
            System.out.println("b is greater");
         }
        }
    }
}