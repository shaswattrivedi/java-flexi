class Employee {
    String name;
    float salary;

    Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public float calculateSalary() {
        return salary + (0.05f * salary); 
    }
}

class Manager extends Employee {
    Manager(String name, float salary) {
        super(name, salary);
    }

    @Override
    public float calculateSalary() {
        return super.calculateSalary() + 2000f; 
    }
}

class Executive extends Manager {
    Executive(String name, float salary) {
        super(name, salary);
    }

    @Override
    public float calculateSalary() {
        return (super.calculateSalary() + (0.1f * salary));
    }
}

public class OverridingCS {
    public static void main(String args[]) {
        Employee e1 = new Employee("Alice", 10000f);
        System.out.println("salary --> " + String.format("%.2f", e1.calculateSalary()));

        Employee e2 = new Manager("Bob", 10000f);
        System.out.println("salary --> " + String.format("%.2f", e2.calculateSalary()));

        Employee e3 = new Executive("Charlie", 10000f);
        System.out.println("salary --> " + String.format("%.2f", e3.calculateSalary()));
    }
}