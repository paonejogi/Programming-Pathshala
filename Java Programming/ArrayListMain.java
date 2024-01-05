import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> Vehicle  = new ArrayList<String>();
        Vehicle.add("Bike");
        Vehicle.add("Bike2");
        Vehicle.add("Bike3");
        Vehicle.add("Bike4");
        Vehicle.add("Audi");
        System.out.println(Vehicle);
       String vehi =  Vehicle.get(3);
       System.out.println(vehi);
       Vehicle.set(3,"Car");
       vehi =  Vehicle.get(3);
       System.out.println(vehi);

       Vehicle.add("Bike6");
       Vehicle.remove(5);
       System.out.println(Vehicle);

       
       Collections.sort(Vehicle);
       for(int j = Vehicle.size() -1; j>=0; j--){
        System.out.println(Vehicle.get(j));
       }
    }
}
