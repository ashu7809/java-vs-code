public class arr23 {
    public static void main(String[] args) {
      /*   int [] rev={7,9,12,11};
        for(int i=rev.length-1;i>=0;i--){
            System.out.print(rev[i] + " ");
        }
        */
         //problem 05
      /*   int arr[]={1,2,3,4,5,6};
       int l=arr.length;
       int n=Math.floorDiv(l,  2);
       for(int i=0;i<n;i++){
           //swap a[i] and a[l-1-i]
           int temp=arr[i];
           arr[i]=arr[l-i-1];
           arr[l-i-1]=temp;
       }
       for(int e:arr){
        System.out.printf(e + " ");
       }
       */
       //problem 6

    /*     int [] arr={45,-65,5,-89,98,75,};
       int max=Integer.MIN_VALUE;
       for(int e:arr){
        if(e>max){
            max=e; 
        }
       }
       System.out.println(max);
    
  */  

  //problem 7
     
     int arr[]={5,2,3,4,5,34,67};;
     int flag=0;
     for(int i=0;i<arr.length-1;i++){
        if(arr[i]<arr[i+1]){
           continue;
        }
        else{
            flag++;
        }
     }
     if(flag>0)
     System.out.println("false");
     else
     System.out.println("true");
       
    }
}
