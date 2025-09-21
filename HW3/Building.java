package HW3;

public class Building implements CarbonFootprint{
    double electric = 0, natural_gas = 0, gas = 0, footprint = 0;

    Building(double e, double n, double g){
        electric = e;
        natural_gas = n;
        gas = g;
        footprint = 0;
    }
    Building(){}

    // 1Kwh Electricity = 530kg per year
    // 1 m3 natural gas = 2.240kg
    // 1kL gas = 1750kg
    public double getCarbonFootprint(){
        footprint = electric*530 + natural_gas*2.24 + gas*1750;
        System.out.printf("The building uses %.2f kWh for electricity, %.2f m3 for natural gas, and %.2f kL for gasoline.\n"
        , this.electric, this.natural_gas, this.gas);
  
        System.out.flush();

        return footprint;
    }
}