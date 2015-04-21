///////////////////////////////////////////////////////////////////
//Kelly Wu
//April 21, 2015
// hw12 Multiply
//
//  practice the use of multidimensional arrays

//  import scanner
import java.util.Scanner;

//  create public class
public class Multiply {
    
    //  add method to generate random indexes for matrix
    public static int[][] randomMatrix(int height, int width) {
        //  initialize matrix with appropriate sizes
        int[][] randArray = new int[height][width];
        
        //  declare individual indexes using random generator
        //  for loop for rows/height
        for(int row = 0; row < randArray.length; row++) {
            //  for loop for collumns/width
            for(int col = 0; col < randArray[0].length; col++) {
                //  generate random numbers between -10 and 10 for indexes
                randArray[row][col] = (int) (Math.random() * (10 - -10) + -10);
            }
        }
        //  return generated array
        return randArray;
    }
    
    //  add method for printing the matrix
    public static void printMat(int[][] array) {
        //  for loop for rows/height
        for(int row = 0; row < array.length; row++) {
            //  for loop for collumns/width
            for(int col = 0; col < array[0].length; col++) {
                //  print specific index
                System.out.print(array[row][col]+" ");
            }
            //  go to next line to print next row
            System.out.println();
        }
    }
    
    //  add method to multiply the two matricies
    public static int[][] matrixMultiply(int[][] m1, int[][] m2,int pHeight, int pWidth) {
        //  initialize a new matrix with dimensions height1 and width2
        int[][] product = new int [pHeight][pWidth];
        
        //  for loop for the height of m1
        for (int i=0; i < m1.length; ++i) {
            //  for loop for the width of m2
            for (int j=0; j < m2[0].length; ++j) {
                //  for loop for the height of m2
                for (int k=0; k < m2.length; ++k) {
                    //  declare different indexes using loop elements
                    product[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        
        //  return the new matrix which is the prodcut of m1 and m2
        return product;
    }
    
    //  add main method
    public static void main(String[ ] args) {
        //  initialize scanner
        Scanner scan;
        scan = new Scanner(System.in);
        
        //  initialize booleans to control while loops (for errors)
        boolean check1 = true;
        boolean check2 = true;
        
        //  initialize dimensions for both matricies
        int width1 = 0;
        int height1 = 0;
        int width2 = 0;
        int height2 = 0;
        
        //  while loop to control of the dimensions are compatible for multiplication
        while(check1) {
            //  keep loops going for dimensions
            check2 = true;
            //  while loop to control if inputs are valid
            while(check2) {
                //  ask user for width of matrix 1
                System.out.print("Enter width of matrix1: ");
                //  check if input is an integer
                if(scan.hasNextInt()) {
                    width1 = scan.nextInt();
                    //  check if input is positive
                    if(width1 > 0) {
                        check2 = false;
                        //  exit out of loop
                    }
                    else {
                        //  if input is negative, print error message
                        System.out.println("Error: int < 0, try again");
                    }
                }
                else {
                    //  if input is not an int
                    //  store letters as a string to quit else statement
                    String error = scan.next();
                    //  print error message
                    System.out.println("Error: not an int, try again");
                }
            }
            //  start second while loop for height of matrix1
            check2 = true;
            //  while loop to control if inputs are valid
            while(check2) {
                //  ask user to enter height
                //  rest of loop is same as previous loop
                System.out.print("Enter height of matrix1: ");
                if(scan.hasNextInt()) {
                    height1 = scan.nextInt();
                    if(height1 > 0) {
                        check2 = false;
                    }
                    else {
                        System.out.println("Error: int < 0, try again");
                    }
               }
                else {
                    String error = scan.next();
                    System.out.println("Error: not an int, try again");
                }
            }
            
            //  run the loop for width of matrix 2 to ensure valid inputs
            check2 = true;
            while(check2) {
                System.out.print("Enter width of matrix2: ");
                if(scan.hasNextInt()) {
                    width2 = scan.nextInt();
                    if(width2 > 0) {
                        check2 = false;
                    }
                    else {
                        System.out.println("Error: int < 0, try again");
                    }
                }
                else {
                    String error = scan.next();
                    System.out.println("Error: not an int, try again");
                }
            }
            
            //  run the loop for the height of matrix 2 to ensure valid inputs
            check2 = true;
            while(check2) {
                System.out.print("Enter height of matrix2: ");
                if(scan.hasNextInt()) {
                    height2 = scan.nextInt();
                    if(height2 > 0) {
                        check2 = false;
                    }
                    else {
                        System.out.println("Error: int < 0, try again");
                    }
                }
                else {
                    String error = scan.next();
                    System.out.println("Error: not an int, try again");
                }
            }
            
            //  check if dimensions allow multiplication
            if(width1 == height2) {
                //  if width of matrix1 and height of matrix2 are equal
                //  multiplication is allowed, quit the while loop
                check1 = false;
            }
            //  dimensions are invalid, print an error message
            else{
              System.out.println("Error: dimensions are not compatible for multiplication, try again");
              //  run loop again
              continue;
            }
        }
        
        //  initialize matricies with dimensions that user input
        int[][] matrix1 = new int[height1][width1];
        int[][] matrix2 = new int[height2][width2];
        
        //  use dimensions to plug into randomMatrix method
        //  generate random indexes
        matrix1 = randomMatrix(height1, width1);
        matrix2 = randomMatrix(height2, width2);
        
        //  print matricies using print method
        System.out.println("Matrix 1: ");
        printMat(matrix1);
        System.out.println("Matrix 2: ");
        printMat(matrix2);
        
        //  initialize a third matrix to use as the product of matrix1 and matrix2
        int[][] multMatrix = new int [height1][width2];
        multMatrix = matrixMultiply(matrix1,matrix2,height1,width2);
        
        //  print the multiplied matrix
        System.out.println("Multiplied Matrix:");
        printMat(multMatrix);
        
    }
}