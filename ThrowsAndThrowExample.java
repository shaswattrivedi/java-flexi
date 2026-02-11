import java.io.IOException;

class ThrowsAndThrowExample {

    static void checkAge(int age) throws IOException {
        if (age < 18) {
            throw new IOException("Age is less than 18. Not eligible.");
        }
        System.out.println("Eligible to vote.");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }
}

