
import java.util.ArrayList;
import java.util.Iterator;

public class Milan {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Porche");
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Rolls Royce");

        Iterator<String> newCar = cars.iterator();

        while (newCar.hasNext()) {
            System.out.println(newCar.next());
        }
        
        System.out.println(cars);
    }
}
