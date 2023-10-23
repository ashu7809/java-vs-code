import java.util.*; 
public class Multidimension {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*1 2 3
          4 5 6
          7 8 9
         */
        // int[][] arr=new int[3][3];

        // int[][] arr={

        //     {1, 2, 3},//0th index
        //     {4, 5,},//1st index
        //     {6,7, 8, 9}//2nd index
        // };


       int[][] arr=new int[3][3];
        System.out.println(arr.length);//number of rows
       
        //input
        
        for(int row=0; row<arr.length; row++){
           //for each coloumn
           for(int col=0; col<arr[row].length;col++){
            arr[row][col]=sc.nextInt();
            
           }
        }
       

        // //output
        // for(int row=0; row<arr.length; row++){
        //     //for each coloumn
        //     for(int col=0; col<arr[row].length;col++){
        //      System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        //  }


        //   output     //another way b 
        //  for(int row=0; row<arr.length; row++){  
        //     System.out.println(Arrays.toString(arr[row]));  
        //  }
        for(int []a:arr){  
            System.out.println(Arrays.toString(a));  
         }
    }
}
