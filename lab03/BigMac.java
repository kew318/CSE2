//////////////////////////////////////////////////////////////////////
//Kelly Wu
//February 6, 2015
//CSE2 Lab 3
//
//
//  use arithmetic calculations and scanner input
//  calculate total cost of big macs

import java.util.Scanner;

//  define a class
public class BigMac {
    
//  add main method
    public static void main(String[ ] args) {
        //  declare and construct scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //  ask user for input number of big macs
        System.out.print("Enter the number of Big Macs(an integer > 0): ");
        
            //  access user input
            int nBigMacs = myScanner.nextInt();
        
        //  prompt user for cost
        System.out.print("Enter the cost per Big Mac as "+
        "a double (in the form xx.xx: ");
            double bigMac$ = myScanner.nextDouble();
	    
	    System.out.print("Enter the percent tax as a whole number (xx): ");
            double taxRate = myScanner.nextDouble();
            taxRate/=100;
            //  converts into propotion
            
            // store cost of big mac
            double cost$;
            //  store digits for calculations with right decimal points for cost$
            int dollars, 
                dimes, 
                pennies;
                
            cost$ = nBigMacs*bigMac$*(1+taxRate);
            //  get the whole amount, drop decimal fraction
            
            dollars=(int)cost$;
            //  get dimes amount
            //  (int)(6.73*10)% 10 -> 67 % 10 -> 7
            //  where the % (mod) operator returns the remainder
            //  after the division:   583%100 -> 83, 27%5 -> 2 
            dimes=(int)(cost$*10)%10;
            pennies=(int)(cost$*100)%10;
            
        //  print final statement of results
        System.out.println("The total cost of " +nBigMacs +
        " BigMacs, at $"+bigMac$ +" per bigMac, with a" +  
        " sales tax of "+ (int)(taxRate*100) + "%, is $"
        +dollars+"."+dimes+pennies);
    }
}