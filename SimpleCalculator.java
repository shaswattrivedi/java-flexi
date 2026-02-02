import java.util.Scanner;

abstract class Calculator {
    abstract int add(int a, int b);
    abstract int subtract(int a, int b);
    abstract int multiply(int a, int b);
    abstract int divide(int a, int b);
}

class SimpleCalculator extends Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        SimpleCalculator calc = new SimpleCalculator();

        System.out.println(calc.add(a, b));
        System.out.println(calc.subtract(a, b));
        System.out.println(calc.multiply(a, b));
        System.out.println(calc.divide(a, b));
    }
}
