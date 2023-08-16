public class recurrsoin_remove_dublicate_string {
   public static boolean[] map=new boolean[26];

   public static void removdupli(String str,int idx,String newstr){
    if(idx==str.length()){
        System.out.println(newstr);
        return;
    }

    char current=str.charAt(idx);
    if(map[current-'a']){
        removdupli(str, idx+1, newstr);
    }else{
        newstr+=current;
        map[current-'a']=true;
        removdupli(str, idx+1, newstr);
    }
   }
    public static void main(String[] args) {
        String str="abbccda";
        removdupli(str, 0, "");
    }
}
