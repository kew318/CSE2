//////////////////////////////////////////////
//Kelly Wu
//March 7, 2015
//hw07 waves
//
//  use nested loops to print waves of numbers

//  import a scanner
import java.util.Scanner;

//  create a class
public class waves {
    
    //  add main method
    public static void main(String[ ] args) {
        //  initialize scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        //  prompt user to enter a number 1 to 30
        System.out.print("Enter a number between 1 and 30: ");
        int x = myScanner.nextInt();
        //  store input into variable x
        
        //  print FOR LOOP
        System.out.println("FOR LOOP:");
        
        //  loop runs until it reaches the xth loop
        for(int a = 1; a <= x; a++) {
            //  initialize b, determines if a is even or odd
            int b = a % 2;
            
            //  create a string to print a
            String aStr = "" + a;
                
                //  loop for even numbers, ascending
                for(int c = 0; c < a && b == 0; c++) {
                    System.out.println(aStr);
                    aStr = aStr + a;
                    //  adds to number of times a is printed
                }
                
                //  loop for odd numbers, descending
                for(int c = 0; c < a && b == 1 && a!= 1; c++) {
                    for (int d = c; d < a; d++) {
                        System.out.print(a);
                    }
                    System.out.println();
                }
                
                //  loop for when a is 0
                for(int c = a; c == 1; c++) {
                    System.out.println("1");
                }
        }
        
        //  print WHILE LOOP
        System.out.println("WHILE LOOP:");
        
        //  initialize y, controls whole loop
        int y = 0;
        //  while loop for when input is within boundaries
        while (x >= 1 && x <= 30 && y==0) {
            //  initialize a, controls inside loop
            int a = 1;
            
            //  loop incremented for a to reach x
            while(a <= x) {
                int b = a % 2;
                int c = 0;
                String aStr = "" + a;
                
                while (c < a && b == 0) {
                    System.out.println(aStr);
                    aStr = aStr + a;
                    c++;
                }
                c = 0;
                
                while (c < a && b == 1 && a != 1) {
                    int d = c;
                    
                    while(d < a) {
                        System.out.print(a);
                        d++;
                    }
                    System.out.println();
                    c++;
                }
                c=0;
                
                while (c==0 && x == 1) {
                    System.out.println("1");
                    c++;
                }
                a++;
            }
            y++;
        }
        
        //  print DO-WHILE LOOP
        System.out.println("DO-WHILE LOOP:");
        //  start with first 1 line
        System.out.println("1");
        int dwa = 1;
        //  initialize a for do-while loop, starting at 2
        
        //  do-while loops like previous loops, depending on if a is even or odd
        do {
            //  increase a by 1
            dwa++;
            //  check if a is even or odd
            int dwb = dwa % 2;
            //  initialize c, controls later loops
            int dwc = 0;
            String dwaStr = "" + dwa;
            
            //  loop for even numbers
            do {
                System.out.println(dwaStr);
                dwaStr = dwaStr + dwa;
                dwc++;
            } while (dwc < dwa && dwb == 0 && x!= 1);
            dwa++;
            //  increase value of a
            
            //  check if a is larger than b before proceeding
            if (dwb == 0 && dwa > x) {
                //  if it is, stop loop
                break;
            }
            
            //  reassign b
            dwb = dwa % 2;
            dwc=0;
            //  loop for odd numbers
            do {
                int dwd = dwc;
                do {
                    System.out.print(dwa);
                    dwd++;
                } while(dwd < dwa);

                System.out.println();
                dwc++;
            } while(dwc < dwa && dwb == 1);

        } while(dwa < x);
        
    }
}