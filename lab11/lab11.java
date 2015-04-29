////////////////////////////////////////////////////////
//Kelly Wu
//April 10, 2015
//lab11
//
//  practice using linear and binary
//  search on arrays

//  import random generator and scanner
import java.util.Random;
import java.util.Scanner;

//  create a class
public class lab11{
    
    //  add main method
    public static void main(String[ ] args) {
        
        //  initialize arrays
        int[] array1 = new int [50];
        int[] array2 = new int [50];
        
        //  initialize random generator
        Random randomGenerator = new Random();
        
        //  randomly generate array1
        for(int i = 0; i < 50; i++) {
            array1[i] = randomGenerator.nextInt(100);
        }
        
        //  initialize max and min of the array
        int maxlin1 = 0;
        int minlin1 = 99999999;
        
        //  linear search
        for(int i = 0; i<50; i++) {
            //  go through each element of array
            int x = array1[i];
            if (x > maxlin1) {
                //  condition means a new max is reached
                maxlin1 = x;
            }
            if (x < minlin1) {
                //  condition means a new min is reached
                minlin1 = x;
            }
        }
        //  print results of linear search
        System.out.println("The max of array1 is "+maxlin1);
        System.out.println("The min of array1 is "+minlin1);
        
        //  randomly generate elements of array2
        array2[0] = randomGenerator.nextInt(100);
        for(int i = 1; i < 50; i++) {
            int a = randomGenerator.nextInt(100);
            //  ensure that array2 increases by each element
            array2[i] = array2[(i - 1)] + a;
        }
        
        //  initialize max and mins for array2
        int maxlin2 = 0;
        int minlin2 = 9999999;
        
        //  use linear search to find max and mins
        for(int i = 0; i<50; i++) {
            int y = array2[i];
            if (y > maxlin2) {
                //  condition means new max has been reached
                maxlin2 = y;
            }
            if (y < minlin2) {
                //  condition means new min has been reached
                minlin2 = y;
            }
        }
        
        //  print results of linear search
        System.out.println("The max of array2 is "+maxlin2);
        System.out.println("The min of array2 is "+minlin2);

        //  initialize scanner
        Scanner scan;
        scan = new Scanner(System.in);
        
        //  initialize input value
        int input = 0;
        System.out.print("Enter an int: ");
        
        //  check if input is an integer
        if (scan.hasNextInt()) {
            //  store input
            input = scan.nextInt();
                if(input < 0) {
                    //  print error message if input is less than 0
                    System.out.println("You did not enter an int > 0");
                    System.exit(0);
                    //  exit program
                }
            
        }
        else {
            //  print error if input is not an integer
            System.out.println("You did not enter an int");
            System.exit(0);
        }
        
        //  initialize variables for binary search
        //  initialize bounds and middle of array2
        int lower = 0;
        int upper = 49;
        int mid = 24;
        
        //  initialize variables to find closest elements of arrays
        int above = 0;
        int below = 0;
        
        //  run while loop for binary search
        while(array2[mid] != input && lower <= upper) {
            if(array2[mid] > input) {
                upper = mid - 1;
            }
            else {
                lower = mid + 1;
            }
        }
        
        //  print results
        if(low <= high) {
            //  lower will remain less than upper if input is found
            System.out.println(input+" was found in array");
        }
        else {
            //  lower will become greater than upper if input is not found
            System.out.println(input+" was not found in array");
        }
    }
}