//import the thingy to be able to read from the keyboard :-)
import java.util.Scanner;
/**
 * This program will take in a double of any value and character of either f, c, C, or F, and return a temperature conversion depending on what unit is
 * associated with the temperature given. If the use fails to provide a valid unit, the program will continue to prompt for a valid unit until a valid
 * unit is given. Once a calculation is done, the program will ask the user if they would like to calculate another value.
 * 
 * @author Moses Mendez
 * @version v1.0
 * @since 9/26/2026
 */
public class Temperature{  //Remove _Starter.
    public static void main (String[] args){
        ////vars section
        String promptIn = "Enter a whole number, a space, and C or F (ie 100 F converts to Cels): ";
        String promptInUnit = "Enter C to convert to F or vice versa: ";
        String converted = " converted is: ";
        String again = "Do you want to calculate another temp? If so, enter yes otherwise no: ";
        //create vars for inputTemp, output (num with decimal), and char inputUnit
        double inputTemp, output;
        char inputUnit, yesOrNo;

        //create Scanner object to read in keyboard
        Scanner keyboardIn = new Scanner(System.in);

        do{  ////create working program and then put in do-while
            System.out.print(promptIn);
            inputTemp = keyboardIn.nextDouble();
            inputUnit = keyboardIn.nextLine().trim().toUpperCase().charAt(0);
            
            while(inputUnit!='F'&&inputUnit!='C'){
                System.out.print(promptInUnit); 
                inputUnit = keyboardIn.nextLine().trim().toUpperCase().charAt(0);
            }
            
            if(inputUnit=='C'){
                output = (double)((inputTemp*1.8)+32.0);
                System.out.printf("%.1f %c%s%.1f %s%n", inputTemp, inputUnit, converted, output, "F");
            }else if(inputUnit=='F'){
                output = (double)((inputTemp-32.0)*(1.0/1.8));
                System.out.printf("%.1f %c%s%.1f %s%n", inputTemp, inputUnit, converted, output, "C");
            }
            
            System.out.print(again);
            yesOrNo = keyboardIn.nextLine().trim().toUpperCase().charAt(0);
        }while(yesOrNo=='Y');
        //      toUpperCase/toLowerCase and then grab charAt(0) and have the while evaluate to == 'Y' (or 'y')
    }//// end main ()
}//// end class