//Yup you guessed it we need to import something to get user keyboard input
import java.util.Scanner;

/**
 * This program aims to assess whether or not a word can be reversed and remain the same word. The program can read from a list seperated by simple spaces,
 * but the user should end the list with 'quit' as the program searches for this value to end the while loop.
 * 
 * @author Moses Mendez
 * @version v1.0
 * @since 9/26/26
 */

public class ReverseWord{ //Remove _Starter.
    public static void main (String[] args){
        ////vars section
        String promptIn = "Enter words separated by a space ending with the word quit: ";
        String promptAgain = "Enter yes to process another line? ";
        String sentinel = "quit";
        //String for word, remaining, combined, and flipped
        String word, remaining, combined, flipped;
        //char for firstLetter
        char firstLetter, yesOrNo;

        //Create Scanner object to get input
        Scanner keyboardIn = new Scanner(System.in);
        do{
            ////optional do while.  Get main program up and running and then the do while
            ////this program allows for adding all words with quit as last word
            System.out.print(promptIn);
            word = keyboardIn.next().toLowerCase();
            while(!word.equals(sentinel)){
                combined = "";
                flipped = "";
                firstLetter = word.charAt(0);
                remaining = word.substring(1);
                combined = remaining+firstLetter;
                
                for(int i = combined.length()-1;i>=0;i--){
                flipped += combined.charAt(i);
                }
                if(flipped.equals(word)){
                    System.out.println(word+" works");
                }else{
                    System.out.println(word+" does not work");
                }
                word = keyboardIn.next().toLowerCase();
            }
            System.out.print(promptAgain);
            yesOrNo = keyboardIn.next().trim().toLowerCase().charAt(0);
        }while(yesOrNo!='n');
    }////end main ()
}////end class