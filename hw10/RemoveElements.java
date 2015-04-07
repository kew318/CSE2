/////////////////////////////////////////////////////////
//Kelly Wu
//April 6, 2015
//hw 10 RemoveElements
//
//  practice using arrays

//  import scanner and random generator
import java.util.Scanner;
import java.util.Random;

//  declare public class
public class RemoveElements{
    
    //  add method that generates random array
    public static int[] randomInput() {
        //  initialize array
        int randInputs [] = new int [10];
        //  initialize random number generator
        Random randomGenerator = new Random();
        //  for loop to declare different parts of array
        for(int i = 0; i < 10; i++) {
            //  generator random number as part of array
            randInputs [i] = randomGenerator.nextInt(10);
        }
        return randInputs;
        //  return array
    }
    
    //  add method that deletes position in array
    public static int[] delete(int numA[], int index) {
        //  initialize new array that deletes a position
        int delArray [] = new int [9];
        //  initialize a variable that controls pos of array
        int a = 0;
        //  for loop to declare different aspects of array
        for(int i = 0; i < 10; i++) {
            //  check that position of array is not the deleted position
            if(i != index) {
                //  redeclare aray elements
                delArray [a] = numA[i];
                //  increment array elements
                a++;
            }
        }
        //  return new array to main method
        return delArray;
    }
    
    //  add method that deletes target numbers of array
    public static int[] remove(int numA[], int target) {
        //  initialize variable to control counter
        int z = 0;
        //  for loop to count how many targets there are in array
        for(int b = 0; b < 10; b++) {
            if(numA[b] == target) {
                z++;
            }
        }
        //  initialize new array with new dimensions
        int remArray[] = new int [(10-z)];
        //  initialize variable that controls which element to declare
        int a = 0;
        //  for loop for declaring new array
        for(int i = 0; i < 10; i++) {
            int x = numA[i];
            //  check if element of array is equal to target
            if (x != target) {
                //  declare elements of new array
                remArray [a] = x;
                a++;
            }
        }
        //  return new array to main method
        return remArray;
    }
    
    //  main method from assignment
    public static void main(String [] args){
      
        Scanner scan=new Scanner(System.in);
        int num[]=new int[10];
        int newArray1[];
        int newArray2[];
        int index,target;
	    String answer="";
	    do{
  	        System.out.print("Random input 10 ints [0-9]");
      	    num = randomInput();
  	        String out = "The original array is:";
  	        out += listArray(num);
      	    System.out.println(out);
 
      	    System.out.print("Enter the index ");
  	        index = scan.nextInt();
  	        newArray1 = delete(num,index);
      	    String out1="The output array is ";
  	        out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	        System.out.println(out1);
 
            System.out.print("Enter the target value ");
  	        target = scan.nextInt();
  	        newArray2 = remove(num,target);
      	    String out2="The output array is ";
  	        out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	        System.out.println(out2);
  	 
  	        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	        answer=scan.next();
	    }while(answer.equals("Y") || answer.equals("y"));
    }
 
    public static String listArray(int num[]){
	    String out="{";
	    for(int j=0;j<num.length;j++){
  	        if(j>0){
    	        out+=", ";
  	        }
      	out+=num[j];
	    }
        out+="} ";
	    return out;
    }
}
