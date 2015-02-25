////////////////////////////////////////////////////
//Kelly Wu
//February 24, 2015
//CSE2 Hw5

import java.util.Scanner;

//  define a calss
public class ToHex {
    
    //  add main method
    public static void main (String[ ] args) {
        
        // set up scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //  ask user for three numbers
        System.out.print("Enter three numbers, representing RGB values: ");
        
        //  make sure all inputs are integers
        if(myScanner.hasNextInt()){
        
        //  initialize inputs
        int numberR = myScanner.nextInt();
        int numberG = myScanner.nextInt();
        int numberB = myScanner.nextInt();
            
            //  print error if input numbers are out of range
            if (numberR > 255 || numberG > 255 || numberB > 255) {
                System.out.println("Invalid input. You must enter numbers 0-255");
            }
        
        //  convert to hexidecimal and convert results into strings
        String R1 = Integer.toString(numberR/16);
        String R2 = Integer.toString(numberR % 16);
        String G1 = Integer.toString(numberG/16);
        String G2 = Integer.toString(numberG % 16);
        String B1 = Integer.toString(numberB/16);
        String B2 = Integer.toString(numberB % 16);
            
            //  switch statement to convert numbers to letters through hexidecimal
            switch (R1) {
                case "10":
                    R1 = "A";
                    break;
                case "11":
                    R1 = "B";
                    break;
                case "12":
                    R1 = "C";
                    break;
                case "13":
                    R1 = "D";
                    break;
                case "14":
                    R1 = "E";
                    break;
                case "15":
                    R1 = "F";
                    break;
                default: break;
            }
            
            //  switch statement to convert numbers to letters through hexidecimal
            switch (R2) {
                case "10":
                    R2 = "A";
                    break;
                case "11":
                    R2 = "B";
                    break;
                case "12":
                    R2 = "C";
                    break;
                case "13":
                    R2 = "D";
                    break;
                case "14":
                    R2 = "E";
                    break;
                case "15":
                    R2 = "F";
                    break;
                default: break;
            }
            
            //  switch statement to convert numbers to letters through hexidecimal 
            switch (G1) {
                case "10":
                    G1 = "A";
                    break;
                case "11":
                    G1 = "B";
                    break;
                case "12":
                    G1 = "C";
                    break;
                case "13":
                    G1 = "D";
                    break;
                case "14":
                    G1 = "E";
                    break;
                case "15":
                    G1 = "F";
                    break;
                default: break;
            }
            switch (G2) {
                case "10":
                    G2 = "A";
                    break;
                case "11":
                    G2 = "B";
                    break;
                case "12":
                    G2 = "C";
                    break;
                case "13":
                    G2 = "D";
                    break;
                case "14":
                    G2 = "E";
                    break;
                case "15":
                    G2 = "F";
                    break;
                default: break;
            }
            
            //  switch statement to convert numbers to letters through hexidecimal
            switch (B1) {
                case "10":
                    B1 = "A";
                    break;
                case "11":
                    B1 = "B";
                    break;
                case "12":
                    B1 = "C";
                    break;
                case "13":
                    B1 = "D";
                    break;
                case "14":
                    B1 = "E";
                    break;
                case "15":
                    B1 = "F";
                    break;
                default: break;
            }
            
            //  switch statement to convert numbers to letters through hexidecimal
            switch (B2) {
                case "10":
                    B2 = "A";
                    break;
                case "11":
                    B2 = "B";
                    break;
                case "12":
                    B2 = "C";
                    break;
                case "13":
                    B2 = "D";
                    break;
                case "14":
                    B2 = "E";
                    break;
                case "15":
                    B2 = "F";
                    break;
                default: break;
            }
         
         // print results   
        System.out.println("The decimal numbers R:"+numberR+
        " G:"+numberG+" B:"+numberB+", is represented in hexidecimal as: "+R1+R2+G1+G2+B1+B2);    
        
    }
    
    //  if inputs are not integers, print error
    else {
        System.out.println("Invalid input. Try again.");
    }
}
}