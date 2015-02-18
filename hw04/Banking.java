///////////////////////////////////////////////////////////
//Kelly Wu
//February 17, 2015
//CSE2 hw04 p2
//
//  use switch statements
//  allow users to process banking transactions

import java.util.Scanner;
import java.util.Random;
//  import scanner and randomizer

//  define a class
public class Banking {
    
    //  add main method
    public static void main(String[ ] args) {
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        //  declare and construct scanner
        
        double nBank = Math.random() * (5000-1000) + 1000;
        //  generate random number for starting balance
        
        nBank*=100;
        int nBankAsInt = (int) nBank;
        nBank=nBankAsInt*.01;
        //  correct decimal points for currency
        
        //  ask user what action they want to take
        System.out.println("Type D to deposit, W to withdraw, B to view balance");
        System.out.print("Deposit? Withdraw? View Balance? ");
        String str = myScanner.next();
        str = str.toUpperCase();
        char action = str.charAt(0);
        //  convert string to char
        
        //  make sure input is a valid input
        if(action == 'D' || action == 'W' || action == 'B') {
        
        switch (action) {
            
            //  take actions to depost
            case 'D':
                System.out.println("Your current balance is: "+(nBank)+" ");
                 //  print balance
        
                System.out.print("How much do you want to deposit? ");
                double nDeposit = myScanner.nextDouble();
                
                //  print new balance after deposit
                System.out.println("New Balance: "+(nBank+nDeposit)+" ");
                break;
            
            //  take actions to withdraw
            case 'W':
                System.out.println("Your current balance is: "+(nBank)+" ");
                //  print balance
        
                System.out.print("How much do you want to withdraw? ");
                double nWithdraw = myScanner.nextDouble();
                
                //  make sure user has enough money
                if(nWithdraw<=nBank) {
                    
                    //  print new balance after withdraw
                    System.out.println("New Balance: "+(nBank-nWithdraw)+" ");
                }
                else {
                    
                    //  tell user they don't have enough funds
                    System.out.println("insufficient funds");
                }
                break;
            
            //  take actions to show balance    
            case 'B':
                
                //  print balance
                System.out.println("Your Current Balance: "+(nBank)+" ");
                break;
        }
        }
        else {
            System.out.println("Invalid input. Try again");
        }
    }
}
