public class FindMin {
    public static void main(String[] args) {
        int [] arr={189,265,49,-5965,46};
        System.out.println(min(arr));
    }

    //assume arr.lenght is not 0
    //retrun the minimum value
    static int min(int[] arr){
      int ans=arr[0];
      for(int i=0;i<arr.length;i++){
       if(arr[i]<ans){
        ans=arr[i];
       }
      }
      return ans;
    }
}
