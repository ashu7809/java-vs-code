public class overloading {
    public static void main(String[] args) {
        System.out.println(sum(5,7));
       System.out.println( sum(6,8,6));
        fun(67);
        fun("kunann");
    }

    
    static int sum(int a,int b){
        return a+b;
    }


    static int sum(int a,int b,int c){
        return a+b+c;
    }


    static void fun(int a){
       System.out.println(a);
    }


    static void fun(String name){
        System.out.println(name);
    }
}