package az.edu.turing.module01.tasks;

import java.util.Random;

public class SeatAssignmentApp {

    public static void main(String[] args) {

        String[] people = {"Rena", "Lala", "Senuber", "Revan1", "Revan2", "Ramina", "Fexri", "Muhammed", "Ella", "Aynur", "Dilber", "Ibrahim", "Seyran", "Famil", "Yetar", "Ruslan", "Guler", "Gunay", "Nicat", "Omer", "AliMurad", "Tural", "Nihat"};
        int totalSeats = 30;
        assignSeats(people, totalSeats);
    }
    public static void assignSeats(String[] people, int totalSeats) {
        boolean[] seatsAssigned = new boolean[totalSeats];
        Random random = new Random();

        for (String person : people) {
            int seat;
            do {
                seat = random.nextInt(totalSeats);
            } while (seatsAssigned[seat]);

            seatsAssigned[seat] = true;
            System.out.println(person + " - Seat " + (seat + 1));
        }
    }
}

