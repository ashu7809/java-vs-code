public class bit {
    public static void main(String[] args) {
        int n=5;
        int pos=1;
        int bitmask=1<<pos;
        if((bitmask & n)==0){
            System.out.println("bit mask is zero");
        }else{
            System.out.println("bit mask is one");
        }
    }
}
