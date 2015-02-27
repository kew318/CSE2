//////////////////////////////////////////////////////
//Kelly Wu
//February 27, 2015
//Lab06 Smile Generator

//  use loops to generate smiles
//  on different lines

//  define a class
public class SmileGenerator {
    
    //  add main method
    public static void main(String [ ] args) {
       
        //  step 1 loop usin for loop
        for (int x=0; x<5; x++) {
            System.out.print(":) ");
        }
        System.out.println();
        
        int x=0;
        do {
            System.out.print(":) ");
            x++;
        }while(x<5);
        System.out.println();
        
        System.out.println();
        System.out.println();
        //  separate steps
        
        //  find a random number defined as y
        double y = Math.random()*100;
        y = (int) y;
        x=0;
        
        //  print random amount of smiles
        while(x<y) {
            System.out.print(":) ");
            x++;
        }
        System.out.println();
        
        //  separate steps
        System.out.println();
        System.out.println();
        
        //  step 3
        x=0;
        if (y>30) {
            for(int a=0; a<30; a++) {
                System.out.print(":) ");
            }
            System.out.println();
            
            //  print remaining smiles in a next line
            double z = y - 30;
                if(z<=30) {
                    while(x<z) {
                    System.out.print(":) ");
                    x++;
                }
                System.out.println();
                }
                
                //  print remaining smiles on next line
                else if (z>30) {
                    x=0;
                    while(x<30) {
                    System.out.print(":) ");
                    x++;
                    }
                    System.out.println();
                    
                    while (x<z) {
                    System.out.print(":) ");
                    x++;
                    }
                    System.out.println();
        }
        }
        
        //  if random number is less than 30 
        else {
            while(x<y) {
            System.out.print(":) ");
            x++;
        }
        System.out.println();
        
        }
        System.out.println();
        System.out.println();
        //  separate from step 4
        
        for (int i=0; i<y; i++) {
            for(int b=0; b< (i + 1); b++) {
                System.out.print(":) ");
            }
            System.out.println();
        }
    }
        
    }        
