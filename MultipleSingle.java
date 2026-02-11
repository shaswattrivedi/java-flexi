public class MultipleSingle {
    public static void main(String[] args) {
        try {
            String str = "123a";
            int num = Integer.parseInt(str);
            int result = 10/0;
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Error: " + e.getClass().getSimpleName() + " occured.");
        }
        System.out.println("Program continues after exception handling");
    }
}
