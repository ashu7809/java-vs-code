import java.util.*;
public class Shadowing {
    static int x=90;
    public static void main(String[] args) {
        int x;
    // System.out.println(x);//it will show an error u have to print after initialisation
      x=40;
     System.out.println(x);
     fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
