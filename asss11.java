import java.util.*;
public class asss11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int t=sc.nextInt();
        int b[]=new int[t];   int f=0;
         for(int i=0;i<t;i++){
            int sum=0;
            int m=sc.nextInt();
            int a[] = new int[m];
          
         
            for(int j = 0; j<m;j++){
                a[j] = sc.nextInt();
                sum=sum+a[j];
            }
            b[f]=sum/m;
            f++;m=0;
             sum=0;
        }     
          for(int j = 0; j<t;j++)
          System.out.println(b[j]);
     }
}