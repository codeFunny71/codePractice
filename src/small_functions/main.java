package small_functions;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //Compute the volume of a cylinder

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and the length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * 3.14159265359;
        double volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);

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
