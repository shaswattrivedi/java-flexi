public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: NULL pointer exception! Object is NULL.");
        } catch (Exception e) {
            System.out.println("Some other error occured.");
        }
        System.out.println("Program continues after exception handling");
    }
}
