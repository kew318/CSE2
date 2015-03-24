///////////////////////////////////////////////////////////
//Kelly Wu
//March 23, 2015
//HW8
//
// create a game using different methods

//  import scanner
import java.util.Scanner;

//  define a class
public class HW8 {
    
    //  add method that prints giant
    public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }
    
    //  add method that prints the cave
    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    //  add method that prints the box
    public static void box(){
        System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               ");  
    }
    
    //  add method that asks to continue or not
    public static String getInput(Scanner scan, String string){
        //  initialize scanner
        scan = new Scanner(System.in);
        //  store input as string
        string = scan.next();
        
        //  if user decides to continue
        if (string.equals("C") || string.equals("c")) {
            return string;
            //  return to main method
        }
        //  if user enters a different input
        else {
            //  print line to user
            System.out.println("Yea right LOSER!");
            //  exit the program
            System.exit(0);
        }
        //  returnt to main method
        return string;
    }
    
    //  add method to ask user to attack, run, or exit
    public static String getInput(Scanner scan, String string, int trial) {
        //  initialize t to control while loop
        int t = 0;
        //  make trial the amount of hits
        trial = 0;
        //  while loop to control users options
        
        while (t == 0) {
            //  initialize scanner
            scan = new Scanner(System.in);
            //  store input
            string = scan.next();
            
            //  if user tries to attack
            if (string.equals("A") || string.equals("a")) {
                //  initialize move as a random number between 0 and 1
                int move = (int) (Math.random() * 2);
                    
                    //  if random number is 1, makes it a hit
                    if (move == 1) {
                        //  print to user that its a hit
                        System.out.println("Critial Hit!");
                        //  add one to amount of hits
                        trial++;
                    }
                    //  if random number is 0, makes it a miss
                    else {
                        //  print to user that it is a miss
                        System.out.println("You missed!");
                    }
            }
            
            //  if user wants to run
            else if (string.equals("E") || string.equals("e")) {
                //  initialize a as a random number between 1 and 10
                int a = (int) (Math.random() * (10 - 1) + 1);
                
                //  if random number is 10 the user escapes the giant
                if (a == 10) {
                    //  print to user a successful escape
                    System.out.println("You escaped!");
                    //leave the loop
                    break;
                }
                //  if random number isnt 10 the user fails to escape
                else {
                    //  print to user a failed escape
                    System.out.println("You failed to escape!");
                }
            }
            //  if user answers a different input
            else {
                //  print to user game over
                System.out.println("Executed by the GIANT! Game over!");
                //  exit program
                System.exit(0);
            }
            
            //  if user hits giant 10 times
            if (trial == 10) {
                //  leave the while loop
                t++;
            }
            
            //  ask user about next move
            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        }
        //  go back to main method
        return string;
    }
    
    //  add method for box choices
    public static String getInput(Scanner scan) {
        //  initialize scanner
        scan = new Scanner(System.in);
        //  initialize box number as user input
        int boxNum = scan.nextInt();
        
        //  switch statement for box numbers
        switch (boxNum){
            //  if user chooses box 1
            case 1:
                //  print prize
                System.out.println("Your prize is $100!");
                break;
            //  if user chooses box 2
            case 2:
                //  print prize
                System.out.println("Your prize is $200!");
                break;
            //  if user chooses box 3
            case 3:
                //  print prize
                System.out.println("Your prize is $300!");
                break;
            //  if user does not enter proper input
            default:
                //  print statement
                System.out.println("A Wrong Number! You get nothing!");
                //  exit program
                System.exit(0);
        }
        //  make a string to return
        String box = Integer.toString(boxNum);
        //  return to main
        return box;
    }
    
    //  add main method
    public static void main(String[ ] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        
        System.out.println("Hero! Have a good day!");
    }
}

