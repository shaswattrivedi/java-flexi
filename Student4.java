class Student4{
    String name;
    String division;

    Student4(String name, String division) {
        this.name = name;
        this.division = division;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Division: " + division);
    }

    public static void main(String[] args) {

        Student4 s1 = new Student4("Shashank Rai", "A");

        s1.display();
    }
}
