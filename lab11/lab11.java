////////////////////////////////////////////////////////
//Kelly Wu
//April 10, 2015
//lab11
//
//  practice using linear and binary
//  search on arrays

import java.util.Random;
import java.util.Scanner;

public class lab11{
    
    public static void main(String[ ] args) {
        
        int[] array1 = new int [50];
        int[] array2 = new int [50];
        Random randomGenerator = new Random();
        
        for(int i = 0; i < 50; i++) {
            array1[i] = randomGenerator.nextInt(100);
        }
        
        int maxlin1 = 0;
        int minlin1 = 100;
        
        //  linear search
        for(int i = 0; i<50; i++) {
            int x = array1[i];
            if (x > maxlin1) {
                maxlin1 = x;
            }
            if (x < minlin1) {
                minlin1 = x;
            }
        }
        System.out.println("The max of array1 is "+maxlin1);
        System.out.println("The min of array1 is "+minlin1);
        
        array2[0] = randomGenerator.nextInt(100);
        for(int i = 1; i < 50; i++) {
            int a = randomGenerator.nextInt(100);
            array2[i] = array2[(i - 1)] + a;
        }
        
        int maxlin2 = 0;
        int minlin2 = 100;
        for(int i = 0; i<50; i++) {
            int y = array2[i];
            if (y > maxlin2) {
                maxlin2 = y;
            }
            if (y < minlin2) {
                minlin2 = y;
            }
        }
        
        System.out.println("The max of array2 is "+maxlin2);
        System.out.println("The min of array2 is "+minlin2);

        Scanner scan;
        scan = new Scanner(System.in);
        
        int input = 0;
        System.out.print("Enter an int: ");
        if (scan.hasNextInt()) {
            input = scan.nextInt();
                if(input < 0) {
                    System.out.println("You did not enter an int > 0");
                    System.exit(0);
                }
            
        }
        else {
            System.out.println("You did not enter an int");
            System.exit(0);
        }
        
        if(array1[24] == input) {
            System.out.println("The number was found in array1");
        }
        else {
            
        }
        
        if(array2[24] == input) {
            System.out.println("The number was found in array2");
        }
        else if (array2[24] < input){
            int closest = 0;
            for(int i = 25; i < 50; i++) {
                int diff = Math.abs(input - array2[i]);
                if (diff < Math.abs(input - array2[(i - 1)])) {
                    closest = array2[i];
                }
            }
            if(closest == 0) {
                System.out.println("The number was found in array2");
            }
            else {
                System.out.println("The number above the key was "+closest);
            }
        }
        else if (array2[24] > input) {
            int closest = 0;
            for(int i = 0; i < 24; i++) {
                int diff = Math.abs(input - array2[i]);
                if (i != 0) {
                    if (diff < Math.abs(input - array2[(i - 1)])) {
                        closest = array2[i];
                    }
                }
            }
            if(closest == 0) {
                System.out.println("The number was found in array2");
            }
            else {
                System.out.println("The number above the key was "+closest);
            }
        }
    }
}