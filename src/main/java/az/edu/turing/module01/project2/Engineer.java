package az.edu.turing.module01.project2;

import java.util.Objects;

public class Engineer extends Human {
    private int experienceYear;

    public Engineer(String name, int age, double salary, int experienceYear) {
        super(name, age, salary);
        this.experienceYear = experienceYear;
    }


    public int getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Engineer engineer = (Engineer) o;
        return experienceYear == engineer.experienceYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experienceYear);
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "experienceYear=" + experienceYear +
                '}';
    }
}