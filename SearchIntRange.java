public class SearchIntRange {
    public static void main(String[] args) {
        int arr[]={12,45,45,7,15,4,56,4};
        int target=12;
        System.out.println(linearSearch(arr,target,1,3));
        
    }
    static int linearSearch(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }

        for(int index=start;index<end;index++){
            int element =arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}
