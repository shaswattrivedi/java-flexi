public class Student2 {
    static String rollPrefix = "SIT2025";

    int rollCounter;

    Student2(int rollCounter) {
        this.rollCounter = rollCounter;
    }

    void display(String name) {
        System.out.println("Username: " + name);
        System.out.println("Roll Number: " + rollPrefix + rollCounter);
        System.out.println();
    }

    public static void main(String[] args) {

        Student2 s1 = new Student2(101);
        Student2 s2 = new Student2(102);
        Student2 s3 = new Student2(103);

        s1.display("Shaswat Trivedi");
        s2.display("Sayantan Nandi");
        s3.display("Glock Rai");
    }
}
