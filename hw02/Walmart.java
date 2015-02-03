/////////////////////////////////////////////////////////////////
//Kelly Wu
//January 30, 2015
//CSE2 HW02
//
//  objective: manipulating variables and running calculations
//
//  compute cost of items bought at Walmart

//  define a class
public class Walmart{

//  add main method
    public static void main(String[ ] args) {
        
            //  list of items bought and their prices
            //  Number of pairs of socks
            int nSocks=3;                
            //  Cost per pair of socks
            //  (‘$’ is part of the variable name)
            double sockCost$=2.58;
            //  Number of drinking glasses
        
            int nGlasses=6;
            //  Cost per glass
            double glassCost$=2.29;
            //  Number of boxes of envelopes
        
            int nEnvelopes=1;
            //  cost per box of envelopes
            double envelopeCost$=3.25;
        
            double taxPercent=0.06;
        
            //  store totals for each item
            double totalSockCost=0,
            //  store variable for total cost of socks
                   totalGlassCost=0,
            //  store variable for total cost of glass
                   totalEnvelopesCost=0;
            //  store variable for total cost of envelopes
            
            double  sockTax=0,
                    glassTax=0,
                    envelopeTax=0;
            //  store variable for tax on total cost each item
            
            double totalNoTax=0,
                   totalPaid=0;
            //  store variable for total cost without tax
            
        
        totalSockCost=nSocks*sockCost$;
        totalGlassCost=nGlasses*glassCost$;
        totalEnvelopesCost=nEnvelopes*envelopeCost$;
        //  calculate total by multiplying number and individual cost
        
        sockTax=totalSockCost*taxPercent;
        glassTax=totalGlassCost*taxPercent;
        envelopeTax=totalEnvelopesCost*taxPercent;
        //  calculate sales tax for specific item by multiplying total by sales tax
        
        
            //  print totals for each item
            System.out.println("The total cost of socks is $"
            +(totalSockCost)+" and the sales tax is $"
            +(sockTax)+" .");
            
            System.out.println("The total cost of glass is $"
            +(totalGlassCost)+" and the sales tax is $"
            +(glassTax)+" .");
            
            System.out.println("The total cost of glass is $"
            +(totalEnvelopesCost)+" and the sales tax is $"
            +(envelopeTax)+" .");
        
        
        totalNoTax=totalSockCost+totalGlassCost+totalEnvelopesCost;
        //  calculate total before sales tax by adding totals of each item
            
            //  print the added totals without sales tax
            System.out.println("The total cost of purchases before sales tax is $"
            +(totalNoTax)+" .");
            
        
        totalPaid=totalNoTax+(totalNoTax*taxPercent);   
        //  calculate the total paid by multiplying the added totals by tax percet
        
            //  print total paid including sales tax
            System.out.println("The total paid including 6% sales tax is $"
            +(totalPaid)+" .");
            
    }
}