import java.util.*;
public class calculator {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int ans=0;
        while(true){
          System.out.println("Enter the operator:-");
            char op=sc.next().trim().charAt(0);
             if( op == '*' || op == '/' || op =='+' || op =='-' || op=='%'){
                System.out.println("Enter a");
                int a=sc.nextInt();
                System.out.println("Enter b");
                int b=sc.nextInt();
                  if(op=='+'){
                    ans=a+b;
                  }
                  if(op=='-'){
                    ans=a-b;
                  }
                  if(op=='*'){
                    ans=a*b;
                  }
                 if(op=='/'){
                  if(b!=0)
                    ans=a/b;
                  } 
                  if(op=='%'){
                    ans=a%b;
                  }
        } else if(op=='x'||op=='X'){
          break;
        }else{
          System.out.println("inavlid operator");
        }
        System.out.println(ans);
    }
    
    
}
}
