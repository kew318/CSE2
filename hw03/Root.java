/////////////////////////////////////////////////////
//Kelly Wu
//February 7, 2015
//CSE2 Hw03 P2 Root
//
//  write a program to estimate the cube root
//  using inputs and calculations with guesses

import java.util.Scanner;
//  import scanner for input

//  define a class
public class Root{
    
//  add main method
    public static void main(String[ ] args) {
        //  declare and construct a scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //  ask user for a double
        System.out.print("Enter a double: ");
            double x = myScanner.nextDouble();
            //  store double as x
        
            //  store and declare guess
            double guess;
            guess=x/3;
        
            //  store estimate;
            double estimate,
                actualCube;
            
        //  improve estimate
        estimate=(guess*guess*guess+x)/(3*guess*guess);
        actualCube=estimate*estimate*estimate;
        
        //  print the estimate
        System.out.println("The cube root is "+estimate+":");
        System.out.println(+estimate+"*"+estimate+"*"+estimate+"="+actualCube+" ");
        
    }
}