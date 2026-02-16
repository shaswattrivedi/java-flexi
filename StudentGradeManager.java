import java.util.*;

class Student {
    String name;
    List <Double> Grades = new ArrayList<>(); 

    Student (String name) {
        this.name = name;
    }
    void addGrade(double grade) {
        Grades.add(grade);
    }

    double calcAverage() {
        double sum = 0;
        for(double g: Grades) {
            sum += g;
        }
        return sum/Grades.size();
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Grades: " + Grades);
        System.out.println("Average: " + calcAverage());
    }
}

class GradeManager {
    List<Student> students = new ArrayList<>();
    
    void addStudent(Student s) {
        students.add(s);
    }

    Student findStudentByName(String name) {
        for(Student s: students) {
            if (s.name.equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    void displayAllStudents() {
        for(Student s: students) {
            s.display();
        }
    }
}

public class StudentGradeManager {
    public static void main(String[] args) {
        GradeManager gm = new GradeManager();
        Student s1 = new Student("Rahul");
        s1.addGrade(80);
        s1.addGrade(100);
        s1.addGrade(120);
        gm.addStudent(s1);

        gm.displayAllStudents();
    }
}