import java.util.*;
public class selection_sort {
    public static void main(String[] args) {
            int arr[]={41,5,6,42,21,};
            sort(arr);
            System.out.println(Arrays.toString(arr));
    }
    static void sort(int []arr){
        for(int i=0;i<arr.length-1;i++){
           int small=i;
           for(int j=i+1;j<arr.length;j++){
            if(arr[small]>arr[j]){
                small=j;
            }

           }
           int temp=arr[small];
           arr[small]=arr[i];
           arr[i]=temp;
        }
    }
}
