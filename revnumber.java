import java.util.*;
public class revnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem;
        int c=0;
        for(int i=1;i<n;i++){
             rem=n%10;
             n=n/10;
            c=c*10+rem;
        }
          System.out.println(c);
        
    }
}
