import java.util.*;
public class meth {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int aver,t,sum=0;
     int count=1;
     int n=sc.nextInt();
     while(count<=n){
         t=sc.nextInt();
         sum+=t;
        count++;
     }
      aver=sum/n;
      System.out.println(aver);
    }
}
