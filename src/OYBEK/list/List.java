package OYBEK.list;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class List {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);
        Car car = new Car();

        ArrayList<Car> carArrayList = new ArrayList<>();
        carArrayList.add(new Car("BMW","X7",2022));
        carArrayList.add(new Car("Audi","X6",2020));
        carArrayList.add(new Car("Ford","X5",2018));
        carArrayList.add(new Car("Damas","Damas 3",2018));

        System.out.println(" Car shop ");

        while (true) {
            System.out.println("[1]->Car list");
            System.out.println("[2]->Car search");
            System.out.println("[3]->Car brand search");
            System.out.print("= ");
            int n = scanner.nextInt();
            switch (n) {
                case 1->{
                    car.carList(carArrayList);
                }
                case 2->{

                    System.out.println(" Search car ");
                    System.out.print("Car name write: ");
                    scanner = new Scanner(in);
                    String carName = scanner.nextLine();
                    car.carSearch(carName, carArrayList);
                }
                case 3->{
                    System.out.println(" Car brand search ");
                    System.out.println();
                    System.out.print("Car brand name write: ");
                    String b = scanner.nextLine();
                }
                default -> System.out.println("Write error!!!");
            }
        }
    }
}
