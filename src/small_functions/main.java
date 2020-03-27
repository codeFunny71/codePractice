package small_functions;

import java.util.Scanner;

public class main {

    public static boolean isPalindrome(String word){

        word = word.toLowerCase();
        int first = 0;
        int last = word.length()-1;

        while (first < last){
            if (word.charAt(first) != word.charAt(last)){
                return false;
            }
            first++;
            last--;
        }

        return true;
    }

    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        //calculate area
        int radius = 5;
        double result = main.area(radius);
        System.out.println("Your area is " + result);

        //admissions filter

//        Scanner console = new Scanner(System.in);
//
//        System.out.println("University admission program");
//        System.out.print("What is your GPA? ");
//        double GPA = console.nextDouble();
//        System.out.print("What is your SAT score? ");
//        int SAT = console.nextInt();
//        if (GPA < 1.8) {
//            System.out.println("Your GPA is too low.");
//        } else if (SAT < 900) {
//            System.out.println("Your SAT score is too low.");
//        } else {
//            System.out.println("You were accepted!");
//        }

        //palindrome

//        String pal = "Anna";
//        boolean test = main.isPalindrome(pal);
//        System.out.println("It is " + test + " that " + pal +" is a palindrome.");

        //Convert feet into meters

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a value for feet: ");
//        double feet = input.nextDouble();
//        double meters = feet * 0.305;
//        System.out.println(feet + " feet is " + meters + " meters");

        //Compute the volume of a cylinder

//        Scanner input = new Scanner(System.in);

//        System.out.print("Enter the radius and the length of a cylinder: ");
//        double radius = input.nextDouble();
//        double length = input.nextDouble();
//
//        double area = radius * radius * 3.14159265359;
//        double volume = area * length;
//
//        System.out.println("The area is " + area);
//        System.out.println("The volume is " + volume);

        //Convert Celsius to Fahrenheit

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a degree in Celsius: ");
//        double celsius = input.nextDouble();
//
//        double fahrenheit = (9.0 / 5.0) * celsius + 32.0;
//        System.out.println(celsius + " degree Celsius is equal to " + fahrenheit + " in Fahrenheit");




    }

}
