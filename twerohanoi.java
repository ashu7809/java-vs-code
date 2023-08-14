public class twerohanoi {
    public static void towerofhan(int n,String source,String help,String desti){
        if(n==1){
         System.out.println("Transfer disk" + n + "from" + source + "to" + desti);
         return;
        }
         towerofhan(n-1,source,desti,help);
         System.out.println("Transfer disk" + n + "from" + source + "to" + desti);
         towerofhan(n-1,help,source,desti);
     }
     public static void main(String[] args) {
           int n=3;
           towerofhan(n,"S","H","D");
     }
}
