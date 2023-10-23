import java.util.Arrays;

public class maxin2Darr {
    public static void main(String[] args) {
        int[][] arr={
          {23,4,1},
          {18,12,3,9},
          {78,99,34,56},
          {18,12},
        };
       // int target=34;
        //int[] ans=search(arr,target);
        System.out.println(max(arr));
    }
    static int max(int[][] arr){
        int max=0;        
        for(int i=0;i<arr.length;i++){    //for(int[] ints:arr)
            for(int j=0;j<arr[i].length;j++){ //for(int element:ints)
                if(arr[i][j]>max){         //if(elements>max)
                    max=arr[i][j];                 //max=element
                }
            }
        }
        return max;
    }
}
