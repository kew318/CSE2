////////////////////////////////////////////////////////////
//Kelly Wu
//March 1, 2015
//hw06 P2

//  use while loops to calculate factorial

//  import a scanner
import java.util.Scanner;

//  define a class
public class RunFactorial {
    
    //  add a main method
    public static void main(String[ ] args) {
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        //  define scanner
        
        //  create variable for while loop
        int a=0;
        
        //  ask user for input
        System.out.println("Please enter an integer that is between 9 and 16");
        
        //  start loop to store input
        while (a<1) {
            
            //  test if input is an integer
            if (myScanner.hasNextInt()) {
                //  store input as integer
                int x = myScanner.nextInt();
                int y = x;
                // create y for printing the result
                
                int factorial = 1;
                //  create variable to manipulate for calculating factorial
                    
                    //  test if input is within wanted boundaries
                    if (x > 9 && x < 16) {
                        
                        //  stop the while loop for input from running again
                        a++;
                        
                        //  prompt while loop for calculating facotiral
                        int i = 0;
                        
                        //  calculate factorial
                        while(i<y) {
                            //  factorial equation
                            factorial = factorial*x;
                            x--;
                            i++;
                    }
                System.out.println("Input accepted: "+y+"! = "+factorial);
                //  print result of factorial
                        
                    }   
                    
                //  if integer is not in boundaries, print error 
                else {
                    System.out.println("Invalid input, enter again!");
                }
            }
        //  if input is not an integer, print error
        else {
            //  store double so the loop will start again
            double z = myScanner.nextDouble();
            
            System.out.println("Invalid input, enter again!");
        }
    }
    }
}