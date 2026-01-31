import java.util.Scanner;

class WrapperEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float f = sc.nextFloat();
        Integer i = f.intValue();
        System.out.println(i);
    }
}
