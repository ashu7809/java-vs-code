import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        //fun(2,3,4,54,56,64,23);
       
        multiple(2, 4, "kunal");
    }
    static void multiple(int a,int b,String str){
      System.out.print(a);

    }
    // static void fun(int ...v){
    //     System.out.println(Arrays.toString(v));//This method returns a string representation of the contents of the specified array
    // }
}
