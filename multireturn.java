import java.util.*;
public class multireturn {
    public static int calMultiplication(int a,int b){
        int multi=a*b;
        return multi;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int a=sc.nextInt();
        System.out.print("Enter b number");
        int b=sc.nextInt();
        int multi=calMultiplication(a, b);
        System.out.println(multi);
    }
}
