////////////////////////////////////////
//Kelly Wu
//February 7, 2015
//CSE2 Hw03 P1 Bicycle
//
//  write a program practicing inputs and calculations
//  asks user for counts and seconds
//  output distance

import java.util.Scanner;
//  import scanner for input

//  define a class
public class Bicycle{

//  add main method
    public static void main(String[ ] args) {
        //  declare and construct a scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //  ask user for counts and seconds
        System.out.print("Enter number of counts: ");
            int nCounts = myScanner.nextInt();
            //  store number of counts
        
        System.out.print("Enter number of seconds: ");
            int nSeconds = myScanner.nextInt();
        
            //  store variables for calculations
            double wheelDiameter=27.0,  
                //  make diameter a precise type
                PI=3.14159, 
  	            //  store constant of pi
  	            feetPerMile=5280,  
  	            //  store number of feet in a mile
  	            inchesPerFoot=12,   
  	            //  store number of inches in a foot
  	            secondsPerMinute=60,
  	            //  store number of seconds in a minute
  	            minutesPerHour=60;
  	            //  store number of minutes per hour
  	            
  	        //  store distances for calculations
  	        double totalDistance=0,
  	               averageDistance=0;
  	               
  	        //  store time in hours
  	        double timeHours=0;
  	               
  	    totalDistance=nCounts*wheelDiameter*PI;
  	    totalDistance/=inchesPerFoot*feetPerMile;
  	    //  calculate distance by multiplying counts by circumference
  	    //  convert distance into miles
        
        System.out.println("The distance was "+totalDistance+" miles and took "
        +(nSeconds/secondsPerMinute)+" minutes.");
        //  print final statement of distance in miles and minutes it took
        
        timeHours=(nSeconds/secondsPerMinute)/minutesPerHour;
        //  convert time into hours for mph calculation
        System.out.println("The average mph was "+(totalDistance/timeHours)+ " mph.");
        //  print average mph
        
    }
}