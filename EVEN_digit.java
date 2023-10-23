public class EVEN_digit {
    public static void main(String[] args) {
        int[] nums={18,124,9,1764,98,1};
        System.out.println(find(nums));
    }
    static int find(int[]nums){
        int coun=0;
        for(int i=0;i<nums.length;i++){
            if(even(nums[i])){
                coun++;
               // System.out.println("4");
            }
        }
        return coun;
    }

    static boolean even(int i){
      if(digit(i)%2==0){
        return true;
      }
      return false;
    }

    static int digit(int i){
        int count=0;
        while(i>0){
            count++;
            i=i/10;
        }
        return count;
    }
    
}
