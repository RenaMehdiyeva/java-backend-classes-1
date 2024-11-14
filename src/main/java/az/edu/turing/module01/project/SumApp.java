package az.edu.turing.module01.project;

public class SumApp {

    public static void main(String[] args) {

        int[] nums = {5, 6};
        int sum = sum(nums);
        System.out.println(sum);
    }

    public static int sum(int[] vekils) {
        int sum = vekils[0]+vekils[1];
        return sum;
    }
}
