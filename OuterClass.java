class OuterClass {

    int a = 5;

    class InnerClass {
        void display() {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
