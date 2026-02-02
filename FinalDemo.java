final class FinalDemo {

    final int x = 10;

    final void display() {
        System.out.println("Value of x: " + x);
    }

    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        obj.display();
    }
}
