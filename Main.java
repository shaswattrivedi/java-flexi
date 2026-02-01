class Parent {
    int value = 10;

    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    int value = 20;

    Child() {
        super();
        System.out.println("Child constructor");
    }

    void display() {
        System.out.println(this.value);
        System.out.println(super.value);
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
