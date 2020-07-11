package review.section_1;

public class Exercise_1 {

    public static void main(String[] args) {

        System.out.println("Welcome to Java Review");

        for (int i = 0; i < 5; i++) {
            System.out.println("I'm a for loop");
        }

        System.out.printf("%3s  |%5s  |%5s\n", "a", "a^2", "a^3");
        for (int i = 1; i <= 4; i++) {
            System.out.printf("%3d  |%5d  |%5d\n", i, i * i, i * i * i);
        }


    }
}
