import java.util.Scanner;

class MethodExample {

    static void staticMethod(int a) {
        System.out.println(a * 2);
    }

    void instanceMethod(int b) {
        System.out.println(b + 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        staticMethod(x);

        MethodExample obj = new MethodExample();
        obj.instanceMethod(y);
    }
}
