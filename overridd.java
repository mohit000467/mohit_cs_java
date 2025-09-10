class person{
    public void show(){
        System.out.println("hello");
    }
}
class emp extends person{
    public void show(){
        System.out.println("hii");
    }
}
public class overridd{
    public static void main(String[] args){
       person s1 = new person();
        s1.show();
         emp s2 = new emp();
        s2.show();
    }
}