///////////////////////////////////////////////////////
//Kelly Wu
//February 16, 2015
//hw04 p1 whichnumber
//
// practice using if statements
//  and inputs

import java.util.Scanner;
//  import scanner

//  define a class
public class WhichNumber {

    //  add main method
    public static void main(String[] args) {

        Scanner myScanner;
        myScanner = new Scanner(System.in);
        //  declare and construct scanner

        System.out.println("Think of a number between 1 and 10 inclusive");
        //  ask user to think of a number

        System.out.print("Is your number even? ");
        String result = myScanner.next();
        //  ask user if number is even and store input

        if (result.equals("y") || result.equals("Y") || result.equals("N") || result.equals("n")) {

            //  if number is even proceed
            if (result.equals("y") || result.equals("Y")) {
                System.out.print("Is it divisible by 3? ");
                result = myScanner.next();

                if (result.equals("y") || result.equals("Y")) {
                    System.out.println("Your number is 6");
                }
                //  if number isnt even, proceed
                else if (result.equals("N") || result.equals("n")) {

                    System.out.print("Is the number divisible by 4? ");
                    result = myScanner.next();

                    if (result.equals("y") || result.equals("Y")) {
                        System.out.print("Is the number divisible by 4 greater than 1? ");
                        result = myScanner.next();

                        if (result.equals("y") || result.equals("Y")) {
                            System.out.println("Your number is 8");
                        }
                        else if (result.equals("N") || result.equals("n")) {
                            System.out.println("Your number is 4");

                        }
                    }
                    else if (result.equals("N") || result.equals("n")) {
                        System.out.print("Is the number divisible by 5?");
                        result = myScanner.next();

                        if (result.equals("y") || result.equals("Y")) {
                            System.out.println("Your number is 10");
                        }
                        else if (result.equals("N") || result.equals("n")) {
                            System.out.println("Your number is 2");
                        }
                    }
                }
            }
            
            else if (result.equals("N") || result.equals("n")) {
                System.out.print("Is it divisible by 3? ");
                result = myScanner.next();

                if (result.equals("y") || result.equals("Y")) {
                    System.out.print("When divided by 3 is the result greater than 1? ");
                    result = myScanner.next();

                    if (result.equals("y") || result.equals("Y")) {
                        System.out.println("Your number is 9");
                    }
                    else if (result.equals("N") || result.equals("n")) {
                        System.out.println("Your number is 3");
                    }

                }
                
                else if (result.equals("N") || result.equals("n")) {
                    System.out.print("Is it greater than 6?");
                    result = myScanner.next();

                    if (result.equals("y") || result.equals("Y")) {
                        System.out.println("Your number is 7");
                    }
                    else if (result.equals("N") || result.equals("n")) {
                        System.out.print("Is it less than 3?");
                        result = myScanner.next();

                        if (result.equals("y") || result.equals("Y")) {
                            System.out.println("Your number is 1");
                        }
                        else if (result.equals("N") || result.equals("n")) {
                            System.out.println("Your number is 5");
                        }
                    }
                }
            }

        }
        
        else {
            
            //  tell user they entered an invalid input
            System.out.println("Sorry that is not a valid input");
        }
    }
}