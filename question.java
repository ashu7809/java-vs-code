import java.util.*;
public class question {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        //  boolean ans=isPrime(n);
        //  System.out.println(ans);
      //  System.out.println(isArmstrong(n));
      for(int i=100;i<=999;i++){
        if(isArmstrong(i))
        System.out.println(i);
      }
    }


    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        if(c*c>n){
            return true;
        }
        return false;
    }

    //armstromg 3digit number
    static boolean isArmstrong(int n){
        int org=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum=sum+(rem*rem*rem);
        }
        return sum==org;
    }
}
