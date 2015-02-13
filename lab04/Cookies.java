/////////////////////////////////////////////
//Kelly Wu
//February 13, 2015
//CSE2 Lab04 Cookies
//
//  use inputs and selection statements
//  output based on input

import java.util.Scanner;
//  import scanner

//  define a class
public class Cookies {
    
    //  add main method
    public static void main(String[ ] args) {
        //  declare and construct scanner
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
        //  ask user for number of people
        System.out.print("Enter the number of people: ");
        int nPeople;
        
            if(myScanner.hasNextInt()) {
                nPeople=myScanner.nextInt();
                //  declare input as number of people if input is an integer
            }
            
            else {
                System.out.println("You did not enter an int");
                return;
                //  leaves program if user puts wrong input
            }
        
        if(nPeople<0) {
            System.out.println("You did not enter an int>0");
            return;
            //  leaves program if input is negative
        }
        
        System.out.print("Enter the number of cookies: ");
        int nCookies;
        //  ask user for number of cookies
        //  decalre number of cookies
            
            if(myScanner.hasNextInt()) {
                nCookies=myScanner.nextInt();
        }
            else {
                System.out.println("You did not enter an int");
                return;
            }
        
            if(nCookies<0) {
            System.out.println("You did not enter an int>0");
            return;
            }
         
        System.out.print("Enter how many you want each person to get: ");
        int nCookiesPerPerson=myScanner.nextInt();
        
            if(nCookiesPerPerson<0) {
               System.out.println("You did not enter an int>0");
            }
        
        
        //  test results
        if(nCookies < nCookiesPerPerson * nPeople) {
            System.out.println("You will not have enough cookies. You need at least "+((nPeople*nCookiesPerPerson-nCookies))+
                    " more cookies");
            }
        //  print result if user does not have enough cookies
        
        else if (nCookies > nCookiesPerPerson * nPeople) {
                System.out.println("You have enough cookies, but they will not divide evenly");
            }
        //  print result if user has enough cookies but it does not divide evenly
        else {
                System.out.println("You have enough cookies and it will divide evenly");
            }
        //  print result if user has enough cookies and it divides evenly
        }
        
    }
