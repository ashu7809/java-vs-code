import java.util.*;
public class Innput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the input");

        int arr[]=new int [5];
       //arr[]={23,5,2,14,63};
        // arr[0]=23;
        // arr[1]=39;
        // arr[2]=54;
        // arr[3]=98;
        // arr[4]=56;
       // System.out.println(arr[2]);
        for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
// System.out.println(arr[i]);
        }
        //  for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]+ " ");

        // }
       System.out.println(Arrays.toString(arr));

        // for(int num:arr){
        //     System.out.print(num +" ");
        // }
    }
}
