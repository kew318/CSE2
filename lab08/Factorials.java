///////////////////////////////////////////////////////////
//Kelly Wu
//March 18, 2015
//lab08 Factorials
//
//  practice using metods
//  to calculate super factorials

//  import scanner
import java.util.Scanner;

//  define a class
public class Factorials {
    
    //  add method for normal factorial calculation
    public static int factorial (int input) {
        
        //  initialize variable for factorial
        int a = 1;
        
        //  for loop to calculate factorial
        for(int i = 1; i<= input; i++) {
            a = a * i;
        }
        
        //  bring a to main method
        return a;
    }
    
    //  add method to print the result
    public static void print (int input, int sum) {
        
        //  print result
        System.out.println("The super factorial of "+input+
        " is "+sum);
    }
    
    //  add main method
    public static void main (String[ ] args) {
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        //  initialize scanner
        
        System.out.print("Enter an integer: ");
        //  ask user for an integer
        
        //  check if input is an integer
        if (myScanner.hasNextInt()) {
            
            //  initialize input as x
            int x = myScanner.nextInt();
            
            //  check if input is positive
            if (x>0) {
                int sFactorial = 0;
                //  initialize value of super factorial
                
                //  loop to calculate super factorial using factorial method
                for(int i = 1; i <= x; i++) {
                    
                    //  calculate super factorial
                    sFactorial = sFactorial + factorial(i);
                }
                //  print results by using print method
                print(x, sFactorial);
            }
            else {
                System.out.println("Invalid input");
                //  if input is negative, print error message
            }
        }
        else {
            System.out.println("Invalid input");
            //  if input is not an integer, print error message
        }
    }
}