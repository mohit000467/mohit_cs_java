import java.util.*;
public class arralist {
    public static void main(String[]arg){
        ArrayList<Integer> al = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        //String name = in.next();
        for(int i = 0 ; i < size ; i++){
            al.add(in.nextInt());
        }
        System.out.println(al);
        al.add(0,4);
         System.out.println(al);
         
    }
   
    
}