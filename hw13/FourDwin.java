////////////////////////////////////////////////////////////////////
//Kelly Wu
//April 27, 2015
//hw13 Four Dimensions
//
//  create a ragged four dimensional array
//  practice sorting

import java.util.Scanner;

public class FourDwin {
    
    public static void statArray(double[][][][] input, int a, int b, int c, int d) {
        int members = 0;
        double sum = 0;
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                for(int k = 0; k < c; k++) {
                    for(int l = 0; l < d; l++) {
                        members++;
                        sum += input[i][j][k][l];
                    }
                }
            }
        }
        double mean = sum/members;
        System.out.println("Members: "+members);
        System.out.println("Sum: "+sum);
        System.out.println("Mean: "+mean);
    }
    
    /*
    public static double[][][][] sort4DArray (double[][][][] input) {
        
    } */
    
    public static double[][][][] sort3DArray (double[][][][] input, int a, int b, int c, int d) {
        for(int t = 0; t < a; t++) {
            for(int s = 0; s < b; s++) {
                
                for(int row = 0; row < c; row++) {
                    int i = 0;
                    int j = 0;
                    double min;
                    int index;
        
                    for(i = 0; i < input[t][s][row].length; i++) {
                        min = input[t][s][row][i];
                        index = i;
                
                        //  find the smaller member of the array
                        for(j = i; j < d; j++) {
                            if(input[t][s][row][j] < min) {
                                min = input[t][s][row][j];
                                index = j;
                            }
                        }
                        //  swap
                        double temp = input[t][s][row][i];
                        input[t][s][row][i] = input[t][s][row][index];
                        input[t][s][row][index] = temp;
                    }
                }
                
            }
        }
        return input;
    }
    
    public static void printArray(double[][][][] input, int a, int b, int c, int d) {
        System.out.print("{ ");
        for(int i = 0; i < a; i++) {
            System.out.print("{");
            for(int j = 0; j < b; j++) {
                System.out.print("{");
                for(int k = 0; k < c; k++) {
                    System.out.print("{");
                    for(int l = 0; l < d; l++) {
                        System.out.print(" "+input[i][j][k][l]+" ");
                        System.out.print(",");
                    }
                    System.out.print("}");
                }
                System.out.print("}");
            }
            System.out.print("} ");
        }
        System.out.println("}");
    }
    
    public static void main(String[] args) {
        Scanner scan;
        scan = new Scanner(System.in);
        boolean check = true;
        
        int X = 0;
        while(check) {
            System.out.print("Enter an integer X: ");
            if(scan.hasNextInt()) {
                X = scan.nextInt();
                if(X > 0) {
                    check = false;
                }
                else {
                    System.out.println("Error: did not enter a positive int");
                }
            }
            else {
                String discard = scan.next();
                System.out.println("Error: did not enter an int");
            }
        }
        check = true;
        
        int Y = 0;
        while(check) {
            System.out.print("Enter an integer Y where Y > X: ");
            if(scan.hasNextInt()) {
                Y = scan.nextInt();
                if(Y > X) {
                    check = false;
                }
                else {
                    System.out.println("Error: did not enter an int > X");
                }
            }
            else {
                System.out.println("Error: did not enter an int");
                String discard = scan.next();
            }
        }
        
        int x = (int) (Math.random() * ((Y+ 1) - X) + X);
        int y = (int) (Math.random() * ((Y+ 1) - X) + X);
        int z = (int) (Math.random() * ((Y+ 1) - X) + X);
        
        double[][][][] array = new double [3][x][y][z];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < x; j++) {
                for(int k = 0; k < y; k++) {
                    for(int l = 0; l < z; l++) {
                        double dec = (int) (Math.random() * 9);
                        dec/= 10;
                        array[i][j][k][l] = ((int) (Math.random() * 30)) + dec;
                    }
                }
            }
        }
        System.out.println("Original Array: ");
        printArray(array,3,x,y,z);
        
        double[][][][] sArray = new double [3][x][y][z];
        sArray = sort3DArray(sArray,3,x,y,z);
        System.out.println("Sorted Array: ");
        printArray(sArray,3,x,y,z);
        statArray(array,3,x,y,z);
    }
}