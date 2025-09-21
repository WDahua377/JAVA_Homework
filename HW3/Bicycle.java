package HW3;

public class Bicycle implements CarbonFootprint{

    double mile = 0;
    // double footprint = 0;

    Bicycle(double m){
        mile = m;
        // footprint = 0;
    }
    Bicycle(){}

    // the carbon footprint of cycling per mile (from manufacture and use) is around 33g of CO2.
    public double getCarbonFootprint(){
        // footprint = mile * 0.033;
        System.out.printf("The total mileage of cycling is %.2f mile.\n", this.mile);
        System.out.flush();
        
        return mile * 0.033;
    }
}
