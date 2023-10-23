import java.util.Arrays;

public class binary2Dsearch {
    public static void main(String[] args) {
        int arr[][]={
          {1,  2,  3,  4},
          {5,  6,  7,  9},
          {10, 11, 12, 13},
          {14, 15, 16, 17},
        };
        System.out.println(Arrays.toString(search(arr, 12)));
        
    }
    static int[] search(int[][] arr,int target){
    int r=0;
    int c=arr.length-1;
    while(r<arr.length &&c>=0){
        if(arr[r][c]==target){
            return new int[]{r,c};
        }
        else if(arr[r][c]<target){
            r++;
        }else{
            c--;
        }
    }
    return new int[]{-1,-1};
}
}
