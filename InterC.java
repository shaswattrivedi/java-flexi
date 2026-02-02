interface A {
    default void show() {
        System.out.println("Show from A");
    }
}

interface B {
    default void show() {
        System.out.println("Show from B");
    }
}

class InterC implements A, B {

    public void show() {
        A.super.show();
        B.super.show();
        System.out.println("Show from C");
    }

    public static void main(String[] args) {
        InterC obj = new InterC();
        obj.show();
    }
}
