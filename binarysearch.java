public class binarysearch {
    public static void main(String[] args) {
        int arr[]={-18,-14,-2,0,1,3,3,4,5,12,13,23,45,78};
        int target=3;
        System.out.println(binary(arr, target));
    }


    static int binary(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){

          int mid=start+(end-start)/2;
          if(target<arr[mid]){
            end=mid-1;
          }
          else if(target>arr[mid]){
            start=mid+1;
          }
          else{
            return mid;
          }

        }
        return -1;
    }
}
