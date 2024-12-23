package az.edu.turing.module01.familyapp;

public class Main {
    public static void main(String[] args) {


        Human mother = new Human("Rena", "Mehdiyeva", 1997);
        Human father = new Human("Ali", "Mehdiyev", 1995);
        Family family = new Family(mother, father);

        Human child1 = new Human("Sofia", "Mehdiyeva", 2005);
        Human child2 = new Human("Mark", "Mehdiyev", 2010);

        family.addChild(child1);
        family.addChild(child2);

        Pet pet = new Pet(Species.DOG, "Şarik");
        family.setPet(pet);

        System.out.println("Family information: " + family);
        System.out.println("Number of members: " + family.countFamily());


        family.deleteChild(0);
        System.out.println("A child has been deleted: " + family);

        family.deleteChild(child2);
        System.out.println("Another child has been deleted: " + family);

        System.out.println("Last number of members: " + family.countFamily());


    }
}