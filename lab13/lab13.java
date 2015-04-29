///////////////////////////////////////////////////////////
// Kelly Wu
// April 24, 2015
// lab13
//
//  sorting with arrays

public class lab13 {
    
    public static int[][] selection_sort(int[][] input) {
        for(int row = 0; row < 5; row++) {
            int i = 0;
            int j = 0;
            int min;
            int index;
        
            for(i = 0; i < input[row].length; i++) {
                min = input[row][i];
                index = i;
                
                //  find the smaller member of the array
                for(j = i; j < (row*3) + 5; j++) {
                    if(input[row][j] < min) {
                        min = input[row][j];
                        index = j;
                    }
                }
                //  swap
                int temp = input[row][i];
                input[row][i] = input[row][index];
                input[row][index] = temp;
            }
        }
        return input;
    }
    public static int[][] copy(int [][] input) {
        int[][] copArray = new int [5][18];
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < (i*3) + 5; j++) {
                copArray[i][j] = input[i][j];
            }
            for(int j = (i*3) + 5; j < 18; j++) {
                copArray[i][j] = 0;
            }
        }
        return copArray;
    }
    
    public static void main(String[] args) {
        int[][] ragArray = new int [5][18];
        
        for(int i = 0; i < 5; i ++) {
            for(int j = 0; j < (i*3) + 5; j++) {
                ragArray[i][j] = (int)(Math.random() * 39);
            }
        }
        
        System.out.println("Array before sorting: ");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < (i*3) + 5; j++) {
                System.out.print(ragArray[i][j]+" ");
            }
            System.out.println();
        }
        
        int[][] sortArray = selection_sort(ragArray);
        System.out.println("Array after sorting: ");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < (i*3) + 5; j++) {
                System.out.print(sortArray[i][j]+" ");
            }
            System.out.println();
        }
        int[][] copArrary = copy(sortArray);
        System.out.println("Array after copying: ");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 17; j++) {
                System.out.print(sortArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}