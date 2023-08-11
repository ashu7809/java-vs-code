public class fact_recursion {
    public static int Calfact(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact= Calfact(n-1);
        int factorial=n*fact;
        return factorial;
    }
    public static void main(String[] args) {
        int n=5;
       System.out.println(Calfact(n));
    }
}
