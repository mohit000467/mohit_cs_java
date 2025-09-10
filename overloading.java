class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class overloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum of 2 ints: " + c.add(5, 10));
        System.out.println("Sum of 2 doubles: " + c.add(5.5, 4.5));
        System.out.println("Sum of 3 ints: " + c.add(1, 2, 3));
    }
}

