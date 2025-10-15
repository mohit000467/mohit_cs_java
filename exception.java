public class exception {
    public static void main(String[] arg) {
        int a[] = new int[5];
        System.out.println("hello");
        try {
            System.out.println(a[7]);
            int result = 5 / 0;
        } catch (Exception e) {
            System.out.println("may be ");
        }

        System.out.println("bye");
    }
}
