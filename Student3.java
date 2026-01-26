class Student3{
    String name;
    int rollNumber;

    Student3(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }

    public static void main(String[] args) {

        Student3 s1 = new Student3("Shashank Rai", 101);

        s1.displayDetails();
    }
}
