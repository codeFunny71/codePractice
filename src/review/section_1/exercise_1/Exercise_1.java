package review.section_1.exercise_1;

public class Exercise_1 {

    private static final double radius = 5.5;

    public static void main(String[] args) {

        System.out.println("Welcome to Java Review");

        for (int i = 0; i < 5; i++) {
            System.out.println("I'm a for loop");
        }

//        System.out.printf("%3s  |%5s  |%5s\n", "a", "a^2", "a^3");
//        for (int i = 1; i <= 4; i++) {
//            System.out.printf("%3d  |%5d  |%5d\n", i, i * i, i * i * i);
//        }

        System.out.println((9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5));

        int answer = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9;

        System.out.println("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = " + answer);

        double pi = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(pi);

//        double perimeter = 2 * radius * Math.PI;
//        double area = radius * radius * Math.PI;

//        System.out.println("Perimeter = " + perimeter);
//        System.out.println("Area = " + area);

        final double width = 4.5;
        final double height = 7.9;

        double area = width * height;

        System.out.printf("%.1f * %.1f = %.2f", width, height, area);

        double kilometers = 14.0;
        double miles = kilometers / 1.6;

        double rate = (45.5 * 60.0 + 30.0) / (60.0 * 60.0);
        double milesPerHour = miles / rate;

        System.out.println(milesPerHour);

    }
}
