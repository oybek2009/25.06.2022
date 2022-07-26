package OYBEK.list;

import java.util.ArrayList;
import java.util.Objects;

public class Car implements CarInt {
    String brand;
    String name;
    int year;

    public Car(String brand, String name, int year) {
        this.brand = brand;
        this.name = name;
        this.year = year;
    }

    public Car() {

    }

    @Override
    public void carList(ArrayList<Car> list) {
        for (Car car : list) {
            System.out.println(car.brand + " " + car.name + " " + car.year);
        }


        System.out.println("------------------------------");
    }

    @Override
    public void carSearch(String nameSearch, ArrayList<Car> listSearch) {
        boolean isHave = false;
        for (Car car : listSearch) {
            if (Objects.equals(nameSearch, car.name)) {
                isHave = true;
                break;

            }
            if (isHave) {
                System.out.println("Have");
            }else {
                System.out.println("No");
            }
        }

    }
}
