class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}
class clac{
    int add(int a, int b) {
        return a + b;
    }
    
}
class mohit{
    int add(int a, int b) {
        return a + b ;
    }
}

public class overrinding {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        clac a = new clac();
        mohit b = new mohit();
        System.out.println("Sum of 2 ints: " + c.add(5, 10));
        System.out.println("Sum of 2 doubles: " + a.add(5, 4));
        System.out.println("Sum of 3 ints: " + b.add(1, 2));
    }
}


