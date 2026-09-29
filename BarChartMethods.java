//import class to generate random numbers
import java.util.Random;
/**
 * This program aims to generate three random numbers and display a bar chart associated with those numbers. Stars will only be printed out for each 100
 * of the random number, if the number is less than 0, then the program will print out a message stating this as opposed to stars.
 * 
 * @author Moses Mendez
 * @version v1.0
 * @since 9/26/2026
 */
public class BarChartMethods{ //Remove _Starter.
    public static void main (String[] args) {
        ////vars section
        //int vars for first, second, third
        int first, second, third;
        String titre = "NUMBER BAR CHART";

        ////generate and assign random numbers section
        //Create a Random object (ie generator)
        Random generator = new Random();
        
        //Use generator to create a random number btw 0 and 999 and assign to first.  Do the same for second and third
        first = generator.nextInt(1000);
        second = generator.nextInt(1000);
        third = generator.nextInt(1000);

        ////Print out numbers
        System.out.printf("Number 1 is: %s %n", first);
        System.out.printf("Number 2 is: %s %n", second);
        System.out.printf("Number 3 is: %s %n", third);
        System.out.println();
        //Message to print out something like, Number 1 is: XXX. Do the same for Number 2 and 3
        //Print blank line

        ////Bar Chart Section
        //Print out NUMBER BAR CHART as a header
        System.out.println(titre);
        
        ////first stars
        //Print out "Number 1: " without a line break
        //printStars(first);
        System.out.print("Number 1: ");
        printStars(first);
        
        ////second stars
        //Print out "Number 2: " without a line break
        //printStars(second);
        System.out.print("Number 2: ");
        printStars(second);
        
        ////third stars
        //Print out "Number 3: " without a line break
        //printStars(third);
        System.out.print("Number 3: ");
        printStars(third);
    }////end main()

    /**
     * Accepts int input and prints stars
     * @param input - number of stars to print out
     */
    public static void printStars(int input){
        if (input<100){
            System.out.print("<100 no stars\n");
        }else{
            for(int i=0;i<input/100;i++){
                System.out.print("*");
            }
        }
        System.out.println();
    }////end printStars()
}////end Grades