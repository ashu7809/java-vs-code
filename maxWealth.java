public class maxWealth {
    public static void main(String[] args) {
       int [][] arr={
        {1,2,3},
        {4,5,6},
        {7,8,9}
       };
       System.out.println(Maxx(arr));
    }
    static int Maxx(int arr[][]){
        int ans=0;
        for(int []i:arr){
            int sum=0;
                for(int j:i){
                  sum+=j;
                }
                if(sum>ans){
                    ans=sum;
                }
        }
        return ans;
    }

    
}
