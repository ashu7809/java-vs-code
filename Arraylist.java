import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //syntax
    ArrayList<Integer> list=new ArrayList<>(10);

//     list.add(67);
//     list.add(69);
//     list.add(45);
//     list.add(65);

//    System.out.println(list.contains(67));
//     System.out.println(list);
   
//    list.set(1,99);
//     System.out.println(list);

//     list.remove(2);
//     System.out.println(list);

for(int i=0;i<5;i++){
    list.add(sc.nextInt());
}

//get item at any index
  for(int i=0;i<5;i++){
    System.out.println(list.get(i));//pass index here,list index will not work here
  }
    }
}
