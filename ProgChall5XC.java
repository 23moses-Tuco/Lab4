import java.util.Scanner;
/**
 * Progchall5XC aims to solve progress challenge 5 by counting the number of instances that a character appears within a string.
 *
 * @author Moses Mendez
 * @version v1.0
 * @since 9/26/26
 */
public class ProgChall5XC
{
    public static void main(String[] args)
    {
        //initialize variables;
        String promptString = "Enter a String: ";
        String promptChar = "Enter a char to be assessed: ";
        String itp = "In the phrase: ";
        
        String assessedString;
        char assessedChar;
        int accumulator = 0;
        
        Scanner stringIn = new Scanner(System.in);
        //Read String to be assessed
        System.out.print(promptString);
        assessedString = stringIn.nextLine();
        
        //Read Char to be assessed
        System.out.print(promptChar);
        assessedChar = stringIn.nextLine().trim().charAt(0);
        stringIn.close();
        
        for(int i=0;i<assessedString.length();i++){
            if(assessedString.charAt(i)==assessedChar){
                accumulator++;
            }else{
                continue;
            }
        }
        
        System.out.print(itp+assessedString+"\n"+"There are "+accumulator+" "+assessedChar+"'s");
    }
}