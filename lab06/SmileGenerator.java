//////////////////////////////////////////////////////
//Kelly Wu
//February 27, 2015
//Lab06 Smile Generator

//  use loops to generate smiles
//  on different lines


public class SmileGenerator {
    
    public static void main(String [ ] args) {
       
        
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
        
        double y = Math.random()*100;
        y = (int) y;
        x=0;
        while(x<y) {
            System.out.print(":) ");
            x++;
        }
        System.out.println();
        
        System.out.println();
        System.out.println();
        
        x=0;
        if (y>30) {
            for(int a=0; a<30; a++) {
                System.out.print(":) ");
            }
            System.out.println();
            
            double z = y - 30;
                if(z<=30) {
                    while(x<z) {
                    System.out.print(":) ");
                    x++;
                }
                System.out.println();
                }

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
        
        else {
            while(x<y) {
            System.out.print(":) ");
            x++;
        }
        System.out.println();
        
        }
        System.out.println();
        System.out.println();
        
        for (int i=0; i<y; i++) {
            for(int b=0; b< (i + 1); b++) {
                System.out.print(":) ");
            }
            System.out.println();
        }
    }
        
    }        
