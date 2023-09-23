import java.util.*;
public class greeting {
    // static void greintg(){
    //     System.out.println("heelo world");
    // }
    public static void main(String[] args) {
        // greintg();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter yout name");
        String name=sc.nextLine(); 
      //   String personalised =myGreet(name);
        System.out.println(myGreet(name));
    }
    static String myGreet(String str){
        String message="Hello "+str;
         return message;
    }
}
