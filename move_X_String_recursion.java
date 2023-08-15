public class move_X_String_recursion {
    public static void moveX(String str, int idx,int count,String newStr){
        if(idx==str.length()){
            for(int i=0;i<=count;i++){
                newStr+='x';
            }      
            System.out.println(newStr);
            return;
        }
        char current=str.charAt(idx);
            if(current=='x'){
                count++;
              moveX(str, idx+1, count, newStr);
            }else{
                newStr+= current;
                moveX(str, idx+1, count, newStr);
            }
        }
    public static void main(String[] args) {
        String str="abxcxxd";
        moveX(str,0,0,"");
    }
}
