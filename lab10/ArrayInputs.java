/////////////////////////////////////////////////////////
//Kelly Wu
//April 3, 2015
//lab10 Arrays
//
//  use arrays and methods to ask user for
//  an array amd print it back to them

import java.util.Scanner;

public class ArrayInputs {
    
    
    public static int posint (double input) {
        if(input > 0 && (input == Math.floor(input)) && !Double.isInfinite(input)) {
            int x = (int) input;
            return x;
        }
        else {
            System.out.println("Sorry, you did not enter a positive integer");
            int y = 0;
            return y;
        }
    }
    
    public static void main(String[ ] args) {
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.print("Please enter an integer for the size of the array: ");
        int sizeAr = scan.nextInt();
        int [] arr = new int [sizeAr];
        for(int i = 0; i < sizeAr; i++) {
            System.out.print("Please enter a positive integer: ");
            if(scan.hasNextInt()) {
               int a = scan.nextInt();
               a = posint(a);
               arr[i] = a;
            }
            else {
                System.out.println("You did not enter an int, try again");
                String error = scan.next();
                i--;
            }
        }
        System.out.println("The array is:");
        for(int i = 0; i < sizeAr; i++) {
            System.out.println(arr[i]);
        }
    }
}