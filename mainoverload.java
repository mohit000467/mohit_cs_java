public class mainoverload{
public static void main(String[] args){
    System.out.println("hek");
    main(10);
    main();
}
public static void main(int x){
    System.out.println("x is " + x);
}
public static void main(){
    System.out.println("ha bhai !!" );
}

}