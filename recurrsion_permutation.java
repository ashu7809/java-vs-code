public class recurrsion_permutation {
    public static void printper(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
             return;
        }
        for(int i=0;i<str.length();i++){
            char current=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            printper(newstr, permutation+current);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        printper(str, "");
    }
}
