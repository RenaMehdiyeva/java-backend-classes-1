package az.edu.turing.module01.project1;

public class EmployeeApp {
    public static void main(String[] args) {

        Employee[] employees = {
                new Manager("Alfredo", 7000, 6),
                new Developer("Peter", 4000, "Java"),
                new Manager("Charlie", 5000, 12),
                new Developer("Anna", 4500, "Python")
        };

        for (Employee emp : employees) {
            emp.displayInfo();
            System.out.println("Bonus (percentage only): " + emp.calculateBonus());

            if (emp instanceof Manager) {
                Manager manager = (Manager) emp;
                System.out.println("Bonus (with fixed amount): " + manager.calculateBonus(10, 500));
            } else if (emp instanceof Developer) {
                Developer developer = (Developer) emp;
                System.out.println("Bonus (with fixed amount): " + developer.calculateBonus(10, 300));
            }
            System.out.println("-----------------------------");
        }
    }
}