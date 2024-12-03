package az.edu.turing.module01.project1;

public class Employee {
    private static int idCounter = 1;
    private int id;
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.id = idCounter++;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Employee id: " + id);
        System.out.println("Employee name: " + name);
        System.out.println("Employee salary: " + salary);
    }

    public double calculateBonus() {
        return salary * 0.1;
    }

    public double calculateBonus(double percentage, double fixedAmount) {
        return salary * (percentage / 100) + fixedAmount;
    }
}

