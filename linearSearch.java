import java.util.*;
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

    //    System.out.println("enter the values");
    //    int n=sc.nextInt();
       int[] arr=new int[4];

//System.out.println("enter" +n+"values");

       for(int i=0;i<arr.length;i++)
       arr[i]=sc.nextInt();

       System.out.println("Enter element you want to search?");
       int target=sc.nextInt();
       
       for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
        System.out.println("At index"+i +"found");
        }
       }
    }
}
