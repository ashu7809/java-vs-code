import java.util.*;
public class sum_function {
    static void sum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1:");
        int a=sc.nextInt();
        System.out.println("Enter number 2");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sum();sum();
    }
}
