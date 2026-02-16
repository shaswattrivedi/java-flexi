import java.util.*;

class Employee {
    String employeeId;
    String name;
    String role;
    double baseSalary;
    double deduction=0;

    Employee(String id,String name,String role,double baseSalary){
        this.employeeId=id;
        this.name=name;
        this.role=role;
        this.baseSalary=baseSalary;
    }

    double calculateSalary(){
        double salary=0;
        switch(role){
            case "Manager": salary=baseSalary*1.2; break;
            case "Developer": salary=baseSalary*1.1; break;
            case "Designer": salary=baseSalary*1.05; break;
            case "Intern": salary=1000; break;
        }
        return salary-deduction;
    }

    void applyDeduction(double amount){
        deduction+=amount;
    }

    void displayEmployeeDetails(){
        System.out.println(employeeId+" "+name+" "+role+" Salary:"+calculateSalary());
    }
}

class Payroll {
    List<Employee> employees=new ArrayList<>();

    void addEmployee(Employee e){ employees.add(e); }

    Employee findEmployeeById(String id){
        for(Employee e:employees)
            if(e.employeeId.equals(id)) return e;
        return null;
    }

    void calculateAllSalaries(){
        for(Employee e:employees) e.displayEmployeeDetails();
    }
}

public class EmployeePayrollSystem {
    public static void main(String[] args) {
        Payroll p=new Payroll();
        Employee e1=new Employee("E1","Raj","Manager",50000);
        e1.applyDeduction(2000);
        p.addEmployee(e1);
        p.calculateAllSalaries();
    }
}
