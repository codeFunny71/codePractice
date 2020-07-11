package small_functions;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

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

    public static int[] countLastDigits(int[] list){
        int[] count = new int[10];
        for (int i = 0; i < list.length; i++){
            count[list[i] % 10] = count[list[i] % 10]+1;
        }
        return count;
    }

    public static void makeChange(double changeDue) {
        int change = (int)(Math.ceil(changeDue*100));
        int dollars = Math.round((int)change/100);
        change=change%100;
        int quarters = Math.round((int)change/25);
        change=change%25;
        int dimes = Math.round((int)change/10);
        change=change%10;
        int nickels = Math.round((int)change/5);
        change=change%5;
        int pennies = Math.round((int)change/1);

        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }

    public static int[] mergeArrays(int[] myArray, int[] alicesArray) {

        // set up our mergedArray
        int[] mergedArray = new int[myArray.length + alicesArray.length];

        int currentIndexAlices = 0;
        int currentIndexMine   = 0;
        int currentIndexMerged = 0;

        while (currentIndexMerged < mergedArray.length) {

            boolean isMyArrayExhausted = currentIndexMine >= myArray.length;
            boolean isAlicesArrayExhausted = currentIndexAlices >= alicesArray.length;

            // case: next comes from my array
            // my array must not be exhausted, and EITHER:
            // 1) Alice's array IS exhausted, or
            // 2) the current element in my array is less
            //    than the current element in Alice's array
            if (!isMyArrayExhausted && (isAlicesArrayExhausted
                    || (myArray[currentIndexMine] < alicesArray[currentIndexAlices]))) {

                mergedArray[currentIndexMerged] = myArray[currentIndexMine];
                currentIndexMine++;

                // case: next comes from Alice's array
            } else {
                mergedArray[currentIndexMerged] = alicesArray[currentIndexAlices];
                currentIndexAlices++;
            }

            currentIndexMerged++;
        }

        return mergedArray;
    }

    public static void main(String[] args) {


        //merge 2 arrays as one sorted array
//        int[] myArray = new int[]{3, 4, 6, 10, 11, 15};
//        int[] alicesArray = new int[]{1, 5, 8, 12, 14, 19};
//
//        int[] result = mergeArrays(myArray, alicesArray);
//        System.out.println(Arrays.toString(result));

//        Stream<int[]> a1Stream = Stream.of(myArray);
//        Stream<int[]> a2Stream = Stream.of(alicesArray);
//
//        Stream<int[]> finalArray = Stream.concat(a1Stream, a2Stream).sorted();
//        finalArray.forEach(System.out::println);

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number in pounds: ");
//
//        double pounds = input.nextDouble();
//        double kilograms = pounds * 0.454;
//
//        System.out.println(pounds + " pounds is " + kilograms + " kilograms.");

//        double change = 7.59;
//        main.makeChange(change);


        //calculate area
//        int radius = 5;
//        double result = main.area(radius);
//        System.out.println("Your area is " + result);

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
