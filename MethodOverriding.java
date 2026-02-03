class Calculator {
    int add(int a, int b) {
        return a+b;
    }
    double add(double a, double b) {
        return a+b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5,10));
        System.out.println(calc.add(5.5,2.2));
        System.out.println(calc.add(1,2,3));
    }
}
