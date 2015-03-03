//////////////////////////////////////////////////////////
//Kelly Wu
//March 2, 2015
//CSE2 hw06 P3
//
//  use do-while loops to determine
//  if a random number is even or odd
//  print the number of characters based on random number

//  define a class
public class MakeSymbols {
    
    //  add main method
    public static void main(String[ ] args) {
        
        int randInt = (int) (Math.random() * 100);
        //  generate random number
        
        System.out.println("Random number generated: "+randInt);
        //  print the random number
        
        int x = randInt % 2;
        //  check if number is even or odd
        
        //  set counter for loop
        int i=0;
            
            //  even number loop, mod will be 0
            do {
                System.out.print("*");
                i++;
            }
            while(x==0 && i<randInt);
            
            //  odd number loop, modd will not be 0
            do{
                System.out.print("&");
                i++;
            }
            while(x>0 && i<randInt);
    }
}