public class NestedTryExample {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block started");
            try {
                System.out.println("Inner try block started");
                int result = 10/0;
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException in inner try block: " + e.getMessage());
            }
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointException in outer try block: " + e.getMessage());
        } finally {
            System.out.println("Finally block of outer try executed");
        }
        System.out.println("Program continues after nested try-catch blocks.");
    }
}
