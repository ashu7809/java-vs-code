import java.util.*;
public class Scoping {
    public static void main(String[] args) {
         int a=10;
         int b=20;
         {
          // int  a=45; // already initialised outside the block in the same method,hence you cannot initialised it again
           a=100;//but you can change the value
           System.out.println(a);
            int c=99;
            // value intialised in this block,will remain in block
         }
         System.out.println(a);
         //System.out.println(c); //cannot use outside the block
    }
    static void random(int marks){
        int num=67;
        System.out.println(num);
        System.out.println(marks);
    }
}
