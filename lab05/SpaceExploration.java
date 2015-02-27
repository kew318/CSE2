///////////////////////////////////////////////////
//Kelly Wu
//February 18, 2015
//CSE2 Lab5 Space
//
//  use switch statements
//  and math randomizer to output a timeline

//  define a class
public class SpaceExploration {
    
    //  add a main method
    public static void main(String[ ] args) {
        
        //  store a random number as the year
        int randomYear = (int) (Math.random() * (11)) + 2000;
        
        //  switch statement for each fact of each year
        switch(randomYear) {
            
            case 2010:
                System.out.println("2010: SpaceX sucessfully sends spacecraft to orbit and back");
                //  if number is 2010, print fact
                
            case 2009:
                System.out.println("2009: N/A");
            
            case 2008:
                System.out.println("2008: Kepler launched to study deep space");
            
            case 2007:
                System.out.println("2007: N/A");
            
            case 2006:
                System.out.println("2006: Spacecraft returns with collections from a comet");
            
            case 2005:
                System.out.println("2005: Spacecraft collides with comet");
            
            case 2004:
                System.out.println("2004: N/A");
            
            case 2003:
                System.out.println("2003: Largest infared telescope released");
            
            case 2002:
                System.out.println("2002: N/A");
            
            case 2001:
                System.out.println("2001: First spacecraft lands on asteroid");
            
            case 2000:
                System.out.println("2000: First spacecraft orbits an asteroid");
                break;
                
            //  make sure the years before are not printed by breaking the switch    
            default:
                break;
        }
    }
}