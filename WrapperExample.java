public class WrapperExample {
    public static void main(String[] args) {
        int x = 5;
        Integer wrappedX = Integer.valueOf(x);
        int unwrappedX = wrappedX.intValue();
        System.out.println("Wrapped Value: " + wrappedX + ", Unwrapped Value: " + unwrappedX);
    }
}