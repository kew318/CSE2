
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
    
    public static int[] resize(int[] old, int newsize) {
        int[] resize = new int [newsize];
        if(old.length == newsize) {
            for(int i = 0; i < newsize; i++) {
                resize[i] = old[i];
            }
        }
        else if (newsize < old.length) {
            for(int i = 0; i < newsize; i++) {
                resize[i] = old[i];
            }
        }
        else {
            for(int i = 0; i < old.length; i++) {
                resize[i] = old[i];
            }
            for(int i = old.length; i < newsize; i++) {
                resize[i] = 0;
            }
        }
        return resize;
    }
    
    public static boolean search (int[] myArray, int target, int minRange, int maxRange) {
        boolean check = true;
            for(int i = minRange; i <= maxRange; i++) {
                if(myArray[i] == target) {
                    check = true;
                    break;
                }
                else {
                    if(i == maxRange) {
                        check = false;
                    }
                }
            }
        return check;
    }
    
    public static int[] noReps(int[] myArray) {
        int[] newArray = new int [myArray.length];
        int del = 0;
        int k = 0;
        for(int i = 0; i < myArray.length; i++) {
            int a = myArray[i];
            boolean count = search(newArray, a, 0, (newArray.length - 1));
            if(count == false) {
                newArray[k] = a;
                k++;
            }
            else{
                del++;
            }
        }
        int z[] = resize(newArray,(newArray.length - del));
        return z;
    }

    
    public static void main(String[ ] args) {
        
        int[] x = {1, 2, 4, 3, 4, 5, 2, 3};
        int[] y;
        y = noReps(x);
        System.out.println("No reps: ");
        for(int j = 0; j < y.length; j++) {
            System.out.println(y[j]);
        }

        /*
        Scanner scan;
        scan = new Scanner(System.in);
        
        int size = 6;
        int[] array = new int [size];
        System.out.print("Enter ints: ");
        for(int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        
        System.out.print("Enter a number to look for: ");
        int input = scan.nextInt();

        int low = 0;
        int high = array.length - 1;
        int mid = (high + low)/2;
        int iterations = 0;
        
        while(array[mid] != input && low <= high) {
            iterations++;
            if(array[mid] > input) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
            mid = (high + low)/2;
        }
        
        if(low <= high) {
            System.out.println(input+" was found in array with "+iterations+" iterations");
        }
        else {
            System.out.println(input+" was not found in array with "+iterations+ "iterations");
        }
        */
    }
}