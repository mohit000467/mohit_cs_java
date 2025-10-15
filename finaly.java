public class finaly {
    public static void main(String[] arg) {
        int a[] = new int[5];
        System.out.println("hello");
       try{ getnum(a);
    }catch(Exception e){
        System.out.println("may be ");
    }
        System.out.println("bye");
    }

    static void getnum(int a[]) throws ArithmeticException {
        System.out.println(a[8]);
    }
}