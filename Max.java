import java.util.*;
public class Max {
    public static void main(String[] args) {
        int[] arr={1,3,12,18,5};
        System.out.println(max(arr));//println(arr,0,5);
    }

    //imagine that arr is not empty
    static int max(int[] arr){   //(int []arr,int start,int end)
        int maxVal=arr[0];
        for(int i=0;i<arr.length;i++){
         if(arr[i]>maxVal){
            maxVal=arr[i];
         }
        }
       return maxVal;

    }
}
