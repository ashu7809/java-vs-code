import java.util.*;
public class average {
    public static float avgAAA(float a,float b,float c){
       float avg=(a+b+c)/3;
        return avg;
      }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 number");
        // float a,b,c,avg;
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        // avg=(a+b+c)/3;
        System.out.println(avgAAA(a,b,c));
    }
}
