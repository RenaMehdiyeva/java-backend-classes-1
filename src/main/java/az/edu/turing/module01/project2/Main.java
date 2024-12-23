package az.edu.turing.module01.project2;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Lale", 29, 5000);
        Human human2 = new Teacher("Lale", 29, 5000,"Math");
        Human human3 = new Engineer("Lale", 29, 5000, 5);
        System.out.println(human2 instanceof Engineer);
        Teacher teacher = (Teacher) human2;
        teacher.setSubject("Physics");
        System.out.println(teacher.getSubject());


    }
}
