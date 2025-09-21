package HW3;

public class Car implements CarbonFootprint{
    
    double mile = 0;
    // double footprint = 0;
    Car(double m){
        mile = m;
        // footprint = 0;
    }
    Car(){}

    // driving takes it up (on average) to around 280g per mile.
    public double getCarbonFootprint(){
        // footprint = mile * 0.28;
         System.out.printf("The total mileage of driving is %.2f mile.\n", this.mile);
         System.out.flush();
         
        return mile * 0.28;
    }
}
