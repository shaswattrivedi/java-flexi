class Student {
    String name;
    int age;

    Student(String n, int a) {
       name = n;
       age = a;
    }

    void display() {
       System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class parameterised {
    public static void main(String[] args) {
        Student student1 = new Student("Shaswat" , 19);
        student1.display();
    }
}