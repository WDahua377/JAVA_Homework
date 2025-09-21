package HW3;
import java.util.ArrayList;

// creat three classes unrelated by inheritance: Buliding, Car, Bicycle
// interface CarbonFootprint: getCarbonFootprint. Every class implement this interface.

// application:
// 1. creat object of each class, places references to thoes objects in Arraylist<CarbonFootprint>.
// 2. iterates through the Arraylist, polymorphically invoking each objects getCarbonFootprint method.
// 3. print some identifying information and the objects' carbon footprint of each object.

public class app {
    public static void main(String[] args){

        ArrayList<CarbonFootprint> list = new ArrayList<CarbonFootprint>();

        // Building(electric, natural_gas, gas);
        Building building1 = new Building(10,10,20);

        // Car(mile);
        Car car1 = new Car(100);

        // Bicycle(mile);
        Bicycle bicycle1 = new Bicycle(40);

        list.add(building1);
        list.add(car1);
        list.add(bicycle1);

        // for(int i = 0; i < List.size(); i++){
        //     System.out.printf("The footprint is around %.2fkg of CO2.\n\n"
        //     , List.get(i).getCarbonFootprint());
        // }

        for (CarbonFootprint i : list){
            System.out.printf("The footprint is around %.2f kg of CO2.\n\n", i.getCarbonFootprint());
        }
    }
}
