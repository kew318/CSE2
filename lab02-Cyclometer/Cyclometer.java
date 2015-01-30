//////////////////////////////////
//Kelly Wu
//January 30, 2015
//CSE2 Cyclometer Program
//
// ADD COMMENTS
//

//  define a class
public class Cyclometer {
    
//  add main method
    public static void main(String[ ] args) {
// our input data
        int secsTrip1=480;  
        //store number of seconds elapsed in trip 1
       	int secsTrip2=3220;  
       	//store number of seconds elapsed in trip 2
		int countsTrip1=1561;  
		//store number of rotations of front wheel in trip 1
		int countsTrip2=9037; 
		//store number of rotations of front wheel in trip 2

//  our intermediate variables and output data
            double wheelDiameter=27.0,  
            //  make diameter a precise type
  	            PI=3.14159, 
  	            //  store constant of pi
  	            feetPerMile=5280,  
  	            //  store number of feet in a mile
  	            inchesPerFoot=12,   
  	            //  store number of inches in a foot
  	            secondsPerMinute=60;  
  	            //  store number of seconds in a minute
	        double distanceTrip1, 
	               distanceTrip2, 
	               totalDistance=0;  
	        //  make all distances a precise type
	        
        System.out.println("Trip 1 took "+
        (secsTrip1/secondsPerMinute)+" minutes and had "+
        countsTrip1+" counts.");
	    System.out.println("Trip 2 took "+
        (secsTrip2/secondsPerMinute)+" minutes and had "+
 	    countsTrip2+" counts.");
 	    //  print results of trip 1 and trip 2
 	    
 	    //  run the calculations; store the values
		//  convert seconds into minutes
		
            distanceTrip1=countsTrip1*wheelDiameter*PI;
    	    // Above gives distance in inches
    	    //(for each count, a rotation of the wheel travels
    	    //the diameter in inches times PI)
	        
	        distanceTrip1/=inchesPerFoot*feetPerMile; 
	        // Converts to distance in miles
	        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
	        
            
        //  Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
	    System.out.println("Trip 2 was "+distanceTrip2+" miles");
	    System.out.println("The total distance was "+(distanceTrip1+distanceTrip2)+" miles");    
    
}
}