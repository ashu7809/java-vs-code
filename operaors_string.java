import java.util.*;
public class operaors_string {
    public static void main(String[] args) {

        System.out.println('a'+'b');
        
        System.out.println("a"+"b");
        
        System.out.println('a'+3);
        
        System.out.println((char)('a'+3));
        System.out.println("kuanl"+ new ArrayList<>());
       // System.out.println(new Integer(56)+ new ArrayList<>()); //this cannot be work 
       String n=new Integer(56)+ " " +new ArrayList<>();
       System.out.println(n);
    }
}
