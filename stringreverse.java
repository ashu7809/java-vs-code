public class stringreverse {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello");
        for(int i=0;i<sb.length()/2;i++){
             int front=i;
             int back=sb.length()-1-i;//5-1-i=4
             char frontC=sb.charAt(front);
             char backC=sb.charAt(back);
             sb.setCharAt(front,backC);
             sb.setCharAt(back,frontC);
        }
        System.out.println(sb);
    }
}
