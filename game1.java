import java.util.Scanner;
import java.util.Random;
public class game1 {
    public static void main(String[] args) {

//  0-- Rock 

//  1-- Paper 

//  2--scissor 


        Random rd = new Random();
        int cumINput = rd.nextInt(3);

System.out.println("-------------------------------------------------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("  0-- Rock  1-- Paper   2--scissor \n ");
        System.out.println("enter your num \n");

        int userInput = sc.nextInt();


        if(userInput==cumINput){
            System.out.println("\n the computer input is --"+cumINput+"--- the mach is drow---");
        }
        else if(userInput == 0 && cumINput==1 || userInput==1 && cumINput==2 || userInput==2 && cumINput==0){

            System.out.println("the computer input is "+cumINput +"--- your loose the game--"+userInput);

        }
          else if(userInput == 1 && cumINput==0 || userInput==2 && cumINput==1 || userInput==0 && cumINput==2){
            
            System.out.println("     the computer input is "+cumINput +"--- your you win the game---  "+userInput);
        }
        else if (userInput>2){ 
            System.out.println("entry valid input ");

        }
    }
}
