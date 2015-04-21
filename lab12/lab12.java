/////////////////////////////////////////////////////////////
//Kelly Wu
//April 17, 2015
//lab 12
//
//  practice using multidimensional arrays

public class lab12 {
    /*
    public static increasingMatrix() {
        
    }
    
    public static void printMatrix(int[][] array, boolean format) {
        
    }
    public static int[translate(int[][] array) {
        
    }
    */
    
    public static void main(String[ ] args) {

        int[][] myArray = new int[3][];	//note location of the ‘3’
        myArray[0] = new int[3]; 
        myArray[0][0] = 11; myArray[0][1] = 21; myArray[0][2] = 31;
        myArray[1] = new int[3]; 
        myArray[1][0] = 12; myArray[1][1] = 22; myArray[1][2] = 32;
        myArray[2] = new int[3]; 
        myArray[2][0] = 13; myArray[2][1] = 23; myArray[2][2] = 33;
    
        for(int i = 0; i < 3; i++) {
            
            System.out.println(myArray[i][i]);
    
        }    
    }
}