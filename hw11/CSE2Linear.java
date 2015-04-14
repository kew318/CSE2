///////////////////////////////////////////////////////////
//Kelly Wu
//April 11, 2015
//hw11
//
//  practice using searches arrays and methods

//  import scanner and random number generator
import java.util.Scanner;
import java.util.Random;

//  initialize class
public class CSE2Linear {
    
    //  add method for binary search
    public static void binary(int input, int[] array) {
        //  initialize counter for iterations
        int iterations = 0;
        //  initialize upper and lower bounds
        int lower = 0;
        int upper = 14;
        //  initialize middle index for binary search
        int mid = 7;
        
        //  run while loop for binary search and increment iterations
        while(array[mid] != input && lower <= upper) {
            iterations++;
            if(array[mid] > input) {
                upper = mid - 1;
            }
            else {
                lower = mid + 1;
            }
            mid = (upper + lower)/2;
        }
        
        //  print results
        if(lower <= upper) {
            System.out.println(input+" was found in the list with "+iterations+" iterations");
        }
        else {
            System.out.println(input+" was not found in the list with "+iterations+" iterations");
        }
    }
    
    //  add method to randomly scramble the array
    public static void scramble(int[] array) {
        //  initialize random number generator
        Random randomGenerator = new Random();
        
        //  scramble array
        for (int i = 14; i > 0; i--) {
            int randIndex = randomGenerator.nextInt(i + 1);
            int a = array[randIndex];
            array[randIndex] = array[i];
            array[i] = a;
        }
        //  print new scrambled array
        System.out.println("Scrambled: ");
        for(int i = 0; i < 15; i++) {
            System.out.print((array[i])+" ");
        }
    }
    
    //  add method to use linear search for input number
    public static void linear(int input, int[] array) {
        //  initialize counter for iterations
        int iterations = 0;
        //  use for loop to use linear search and check
        //  each index in order to find input
        for(int i = 0; i < 15; i++) {
            iterations++;
            if(array[i] == input) {
                System.out.println(input+" was found in the list wiht "+iterations+" iterations");
                break;
            }
            if(i == 14 && array[i] != input) {
                System.out.println(input+" was not found in the list with "+iterations+" iterations");
            }
        }
    }
    
    //  add main method
    public static void main(String[] args) {
        //  initailize scanner
        Scanner scan;
        scan = new Scanner(System.in);
        //  initialize array for inputs
        int[] grades = new int [15];
        System.out.print("Enter 15 ints for final grades in CSE2: ");
        //  for loop to continuously store inputs into array
        for(int i = 0; i < 15; i++) {
            if(scan.hasNextInt()) {
                grades[i] = scan.nextInt();
                if(i > 0) {
                    //  check if inputs are in increasing order
                    if(grades[i] < grades[(i - 1)]) {
                        //  print error message if it is not in increasing order
                        System.out.println("Error: did not enter a higher grade");
                        i--;
                        //  do not count the input
                    }
                }
                else if (grades[i] < 0 || grades[i] > 100) {
                    //  print error if grade is out of range
                    System.out.println("Error: input is out of range");
                    i--;
                    //  do not count the input
                }
            }
            else {
                //  print error if input is not an int
                System.out.println("Error: did not enter an int");
                i--;
                //  do not count the input
            }
        }
        
        //  print the grades in order
        System.out.print("The grades, sorted are: ");
        for(int i = 0; i < 15; i++) {
            System.out.print(grades[i]+" ");
        }
        System.out.println();
        
        //  ask user to enter an int to look for using binary search
        System.out.print("Enter a grade to search for: ");
        int biSearch = scan.nextInt();
        //  store input
    
        binary(biSearch, grades);
        //  run binary search
        
        scramble(grades);
        //  run scramble
        
        System.out.println();
        //  ask user to enter an int to look for using linear search
        System.out.print("Enter a grade to search for: ");
        int linSearch = scan.nextInt();
        //  store input
        
        linear(linSearch, grades);
        //  run linear search
    }
}