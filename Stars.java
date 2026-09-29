//import for Scanner;
import java.util.Scanner;
/**
 * This program aims to take a user input known as 'width' and converts that into a diamond of that width. Should a user input an even width, the width
 * will be increased by one before returning a diamond of that width.
 * 
 * @author Moses Mendez
 * @version v1.0
 * @since 9/26/2026
 */

public class Stars{ //Remove _Starter.
    public static void main (String args[]){
        
        int width;//also total rows
        int n;//top rows to middle
        String promptIn = "Enter max width of diamond: ";
        
        //prompt for max width
        System.out.print(promptIn);
        Scanner keyboardIn = new Scanner(System.in);
        width = keyboardIn.nextInt();
        if(width%2==0){
            width+=1;
        }
        n  = (width+1)/2;
        
        char spaces, stars;
        spaces = ' ';
        stars = '*';
        String res;
        res = "";
        
        for(int i = 1; i<=width; i++){
            if(i<=n){
                /*while i is less than or equal to middle row, increase stars and reduce
                spaces*/
                res += String.valueOf(spaces).repeat(n-i)+
                    String.valueOf(stars).repeat(2*i-1)
                    +"\n";
                continue;
            }
            else{
                /* After middle row, reduce stars and increase spaces
                */
                res = res+
                String.valueOf(spaces).repeat(i-n)+
                    String.valueOf(stars).repeat(width-(2*(i-n)))
                    +"\n";
                continue;
            }
        }
        System.out.println(res);  //this gets to next line
        }
    }  ////end main()
 ////end class