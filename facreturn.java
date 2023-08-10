import java.util.*;
public class facreturn {
    public static void printFact(int n){
        if(n<0){
            System.out.println("inval");
            return;
           }
       int fac=1;
       for(int i=n;i>=1;i--){
        fac=fac*i;
       } 
    
       System.out.println(fac);
       return;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printFact(n);
    }
}
