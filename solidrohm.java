public class solidrohm {
    public static void main(String[] args) {
        int n=5;
        //spaces
         for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
         }
    }
}
