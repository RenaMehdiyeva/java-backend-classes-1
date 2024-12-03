package az.edu.turing.module01.project1;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;

    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }
    public double calculateBonus(double percentage, double fixedAmount) {
        double languageBonus = 0;
        if (programmingLanguage.equalsIgnoreCase("Java")) {
            languageBonus = 500;
        } else if (programmingLanguage.equalsIgnoreCase("Python")) {
            languageBonus = 300;
        }
        return super.calculateBonus(percentage, fixedAmount) + languageBonus;
    }
}