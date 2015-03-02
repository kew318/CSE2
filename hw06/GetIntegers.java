///////////////////////////////////////////////////////
//Kelly Wu
//March 1, 2015
//hw06 P1 GetIntegers
//
//  practice writing loops
//  ask user for 5 integers and print the sum

//  import a scanner
import java.util.Scanner;

//  define a class
public class GetIntegers {
    
    //  add main method
    public static void main(String[ ] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        //  define scanner
        
        //  initialize variables
        int sum = 0;
        int y = 0;
        
        //  ask user for 5 integers
        System.out.println("Enter 5 non-negative integers");
        
        // store 5 integers
        for (int x = 0; x<5; x++) {
            //  check if input is an integer
            if (myScanner.hasNextInt()){
                y = myScanner.nextInt();
                
                //  check if integer is negative
                if(y<0) {
                    System.out.println("Invalid input, enter again");
                    x--;
                    //  make sure this input doesn't count
                }
                else {
                    sum = sum + y;
                }
            }
            else {
                String z = myScanner.next();
                //  store input so look will keep going
                
                System.out.println("Invalid input, enter again");    
                x--;
            }
        }
        //  print sum
        System.out.println("The sum is "+sum);
    }
}    