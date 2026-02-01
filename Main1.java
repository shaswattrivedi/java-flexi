class Parent {
    void show() {
        System.out.println("Method from Parent class");
    }
}

class Child extends Parent {
    void show() {
        super.show();
        System.out.println("Method from Child class");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
