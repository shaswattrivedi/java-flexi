class Student {
    String name;
    int age;
    Student() {
        name = "Shaswat";
        age = 19;
    }
    
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class constructor {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.display();
    }
}
