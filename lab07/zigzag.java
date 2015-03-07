///////////////////////////////////////////////////////////
//Kelly Wu
//March 5, 2015
//Lab07 zigzag
//
//  use loops to produce a zig zag

//  import scanner
import java.util.Scanner;

//  create a class
public class zigzag {
    
    //  add main method
    public static void main(String[ ] args) {
        
        //  initialize scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        //  initialize variable to control loop
        int k = 0;
        
        //  first loop to control the infinite loop
        while(k == 0) {
            
        //  ask user for input
        System.out.print("Enter an int between 3 and 33: ");
        
        //  create boolean to check if input is int 
        boolean isInt = myScanner.hasNextInt();
        //  store input
        int nStars = myScanner.nextInt();
        
        //  initialize variable to control the first printed line loop
        int i = 0;
        
        //  while loop to start running nthe program
        while (isInt && nStars >= 3 && nStars<=33) {
            i=0;
            //  reset variable if the loop repeats
            
            //  print input number of stars on one line
            while (i < nStars) {
                System.out.print("*");
                i++;
                }
                
            System.out.println("");
        
            //  initialize another variable to control second step of program
            int a = 0;
            //  run second loop
            while (a < nStars) {
                //  for loop controls amount of spaces before stars
                for (int b = nStars; b - a < nStars; b++) {
                System.out.print(" ");
                }
                //  print star
                System.out.println("*");
                a++;
                //  increment loop variable
                }
            
            //  reset loop variable
            i = 0;
            //  repeat first line of stars
            while (i < nStars) {
                System.out.print("*");
                i++;
            }
        
        System.out.println();
        
        //  ask user if loop should run again
        System.out.print("Enter y or Y to go again: ");
        String goAgain = myScanner.next();
        //  store input as string
            
            //  if user enters yes, start program again
            if(goAgain.equals("y") || goAgain.equals("Y")) {
            
                nStars=0;
                //  breaks out of the printing loop
            }
            
            //  if user enters no, break out of loops
            else if (goAgain.equals("n") || goAgain.equals("N")) {
                k++;
                break;
            }
        }
        //  print error if input is incorrect
        if (isInt == false || nStars < 3 || nStars > 33) {
            System.out.println("Input not in range of [3,33]. Try again");
            k=0;
            //  reset loop variable back to 0
        }
}
}
}