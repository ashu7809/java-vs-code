public class recurrsion_subsequences {
    public static void subsquences(String str,int idx,String newstr){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char current=str.charAt(idx);
        //to be
        subsquences(str, idx+1, newstr+current);
        //to not be
        subsquences(str, idx+1, newstr);
    }
    public static void main(String[] args) {
        String str="abc";
        subsquences(str, 0, "");
    }
}
