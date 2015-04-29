/////////////////////////////////////////////////////////////
//Kelly Wu
//April 17, 2015
//lab 12
//
//  practice using multidimensional arrays

import java.util.Scanner;

public class lab12 {
    
    public static int[][] increasingMatrix(int width, int height, boolean format){
        int[][] array = new int[height][width];
        int count = 1;
        //  row major
        if (format) { 
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    array[i][j] = count;
                    count++;
                }
            }
        } 
        //  column major
        else {
            for (int i = 0; i < width; i++) {
                 for (int j = 0; j < height; j++) {
                    array[j][i] = count;
                    count++;
                }
            }
        }
        return array;
    }
    
    public static void printMatrix(int[][] array, boolean format) {
        if(format) {
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
        else if(array == null) {
            System.out.println("The array was empty!");
        }
        
        //  column major maybe?
        else {
            for(int col = 0; col < array[0].length; col++) {
                for(int row = 0; row < array.length; row++) {
                    System.out.print(array[row][col]+" ");
                }
                System.out.println();
            }
            /*
                for(int col = 0; col < array.length; col++){
                    for(int row = 0; row < array[0].length; row++){
                    System.out.print(array[col][row]+" ");
                }
                System.out.println();
            }
            */
        }
    }
    
    /*
    public static int[translate(int[][] array) {
        
    }

    */
    
    public static void main(String[ ] args) {
        int height1 = (int) (Math.random() * (5 - 1) + 1);
        int width1 = (int) (Math.random() * (5 - 1) + 1);
        
        int[][] matrix1 = increasingMatrix(width1, height1, true);
        int[][] matrix2 = increasingMatrix(width1, height1, true);
        System.out.println("Generating a matrix with width "+width1+
        " and height "+height1+":");
        printMatrix(matrix1, true);
        System.out.println("Generating a matrix with width "+width1+
        " and height "+height1+":");
        printMatrix(matrix2, true);
        
        int height2 = (int) (Math.random() * (5 - 1) + 1);
        int width2 = (int) (Math.random() * (5 - 1) + 1);
        
        int[][] matrix3 = increasingMatrix(width2, height2, false);
        System.out.println("Generating a matrix with width "+width2+
        " and height "+height2+":");
        printMatrix(matrix3, false);
    }
}