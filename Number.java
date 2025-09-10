
class Number {
    private double value;

    public Number(double value) {
        this.value = value;
    }

    public boolean isZero() {
        return value == 0;
    }

    public boolean isPositive() {
        return value > 0;
    }

    public boolean isNegative() {
        return value < 0;
    }

    public boolean isOdd() {
        if (value % 1 != 0)
            return false;
        return ((int) value) % 2 != 0;
    }

    public boolean isEven() {
        if (value % 1 != 0)
            return false;
        return ((int) value) % 2 == 0;
    }

    public boolean isPrime() {
        if (value % 1 != 0 || value < 2)
            return false;
        int n = (int) value;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
        
    public boolean isArmstrong() {
        if (value % 1 != 0 || value < 0)
            return false;
        int n = (int) value;
        int temp = n, sum = 0;
        int digits = String.valueOf(n).length();

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Number num = new Number(153);

        System.out.println("Zero = " + num.isZero());
        System.out.println("Positive = " + num.isPositive());
        System.out.println("Negative = " + num.isNegative());
        System.out.println("Odd = " + num.isOdd());
        System.out.println("Even = " + num.isEven());
        System.out.println("Prime = " + num.isPrime());
        System.out.println("Armstrong = " + num.isArmstrong());
    }
}
