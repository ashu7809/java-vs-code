public class stringbuilder1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);

        //char index
        System.out.println(sb.charAt(2));//  o/p:-n   

        //set charAt
        sb.setCharAt(0,'p');   //output:- pony
        System.out.println(sb);

        // insert
        System.out.println(sb.insert(0,'s'));// o/p:-Spony

        //delete 
        System.out.println(sb.delete(2,4));  // o/p:-spy
        
    }
}
