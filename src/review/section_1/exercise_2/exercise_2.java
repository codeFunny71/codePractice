package review.section_1.exercise_2;

public class exercise_2 {
    /*
    *
    * (Population projection) The U.S. Census Bureau projects
    * population based on the following assumptions:
         ■ One birth every 7 seconds
         ■ One death every 13 seconds
         ■ One new immigrant every 45 seconds
         Write a program to display the population for each
         of the next five years. Assume the current population
         is 312,032,486 and one year has 365 days. Hint: In Java,
         if two integers perform division, the result is an integer.
         The fractional part is truncated. For example, 5 / 4 is 1
         (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate
         result with the fractional part, one of the values involved
         in the division must be a number with a decimal point.
         For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
    */
    public static void main(String[] strings) {

        double birthRateInSeconds = 7.0;
        double deathRateInSeconds = 13.0;
        double newImmigrantInSeconds = 45.0;
        double secondsInMinute = 60.0;
        double minutesInhour = 60.0;
        double hoursInDay = 24.0;
        double daysInYear = 365.0;



        double currentPopulation = 312032486;

        double secondsInYears = secondsInMinute * minutesInhour * hoursInDay * daysInYear;

        double numBirths = secondsInYears / birthRateInSeconds;
        double numDeaths = secondsInYears / deathRateInSeconds;
        double numImmigrants = secondsInYears / newImmigrantInSeconds;

        for (int i = 1; i <= 5; i++) {
            currentPopulation += numBirths + numImmigrants - numDeaths;
            System.out.println("Year " + i + " = " + (int)currentPopulation);

        }

    }

}
