import java.util.*;

import javax.lang.model.util.ElementScanner14;
import javax.sound.sampled.SourceDataLine;
public class Swtch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         int button=sc.nextInt();
        // if(button==1)
        // {
        //     System.out.println("Hello");
        // }
        // else if(button==2){
        //     System.out.println("Namste");
        // }
        // else{
        //     System.out.println("bonjour");
        // }

        switch (button) {
        //     case 1:System.out.println("hello");
        //   break;
        //   case 2:System.out.println("namste");
        //   break;
        //   case 3:System.out.println("bonjour");
        //   break;
        //     default:System.out.println("invallid");

        case 1-> System.out.println("hello");
       
        case 2-> System.out.println("namste");
    
        case 3-> System.out.println("bonjour");

        default->System.out.println("invalid");
       
        }

    }
}
