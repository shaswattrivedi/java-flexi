public class ChainedEX {
    public static void main(String[] args) {

        try {

            try {
                int[] n = new int[5];
                int divisor = 0;

                for (int i = 0; i < n.length; i++) {
                    int res = n[i] / divisor;
                    System.out.println(res);
                }
            }

            catch (ArithmeticException e) {
                throw new RuntimeException("Error: Division by zero occurred", e);
            }

        } 
        
        catch (RuntimeException e) {
            System.out.println("Caught RuntimeException");
            System.out.println(e.getMessage());

            System.out.println("\nOriginal Cause:");
            System.out.println(e.getCause());
        }
    }
}
