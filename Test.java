import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<Car> lst = new ArrayList<>();

        lst.add(new Car("Benz", 2020, 457.00));
        lst.add(new Car("Porch", 2022, 578));
        lst.add(new Car("Rolls Royce", 2024, 320));
        lst.add(new Car("BMW", 2023, 728));

        Collections.sort(lst);
        for (Car car : lst) {
            System.out.println(car.model + " " +
            car.horsePower + " " +  
            car.makeYear + " ");
        }

    }
}

class Car implements Comparable<Car> {
    String model;
    int makeYear;
    double horsePower;
    
    @Override
    public int compareTo(Car o) {
        return (int) (this.horsePower - o.horsePower);
    }

    public Car(String m, int y, double hP) {
        this.model = m;
        this.makeYear = y;
        this.horsePower = hP;
    }
    
}