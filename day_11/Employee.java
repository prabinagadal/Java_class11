package day_11;

public class Employee {
    String name;
    double basicSalary;
    double bonus;

    Employee(String name, double salary){
        this.name = name;
        this.basicSalary = salary;

        if (basicSalary > 3000){
            this.bonus = basicSalary * 0.10;  // 10%
        }
        else{
            this.bonus = basicSalary * 0.05;  // 5%
        }
    }

    void display(){
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (basicSalary + bonus));
    }

    public static void main(String[] args){
        Employee emp1 = new Employee("Shristi", 2500);
        emp1.display();
    }
}
