////////////////////////////////////////////////////////////
//Kelly Wu
//February 8, 2015
//CSE2 Hw03 P3 Four Digits
//
//  write a program that asks for a double
//  and prints the first four digits to the right of the decimal

import java.util.Scanner;
//  import a scanner

//  define a class
public class FourDigits{
    
//  add a main method
    public static void main(String[ ] args) {
        //  declare and construct a scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
            //  ask user for a double
            System.out.print("Enter a double and I display the four digits to the right of the decimal point: ");
            double x = myScanner.nextDouble();
            //  store double as x
        
        //  store variables for calculations
        double xFindDec=0;
        int xDecimal=0;
            
        //  make decimals as part of an int    
        xFindDec=x*10000;
        int xInt=(int) xFindDec;
        //  cut off all digits after the fourth decimal
        
        //  make xSub an integer of 10000 to subtract from xInt
        int xSub=(int) x;
        //  make xDecimal as the four digits
        xDecimal=xInt-(xSub*10000);
        
            System.out.println("The four digits are "
            +xDecimal+" ");
            
    }
}