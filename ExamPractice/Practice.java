
import java.util.Scanner;

public class Practice {
    
    //  selection sorting
    public static int[] selection_sort(int[] input) {
        int i = 0;
        int j = 0;
        int min;
        int index;
        
        for(i = 0; i < input.length; i++) {
            min = input[i];
            index = i;
            //  find the smaller member of the array
            for(j = i; j < input.length; j++) {
                if(input[j] < min) {
                    min = input[j];
                    index = j;
                }
            }
            //  swap
            int temp = input[i];
            input[i] = input[index];
            input[index] = temp;
        }
        return input;
    }

    
    public static void main(String[ ] args) {
        int[] myArray = new int[5];
        myArray[0] = 3;
        myArray[1] = 7;
        myArray[2] = 6;
        myArray[3] = 1;
        myArray[4] = 2;
        
        for(int i = 0; i < 5; i++) {
            System.out.println(myArray[i]);
        }
        System.out.println();
        
        selection_sort(myArray);
        
        for(int i = 0; i < 5; i++) {
            System.out.println(myArray[i]);
        }
    }
}