package OOP_Part_1_Inheritance;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Car car = new Car();

        System.out.println("Raw make "+ car.getMake());
        System.out.println("Raw model "+ car.getModel());
        System.out.println("Raw color "+ car.getColor());
        System.out.println("Raw make "+ car.getDoors());
        System.out.println("Raw Convertible "+ car.isConvertible());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Manufacturer Name: ");
        car.setMake(scanner.nextLine());
        System.out.println("Enter Model Name: ");
        car.setModel(scanner.nextLine());
        System.out.println("Enter Door's Number: ");
        car.setDoors(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter Color: ");
        car.setColor(scanner.nextLine());
        System.out.println("Is it Convertible? ");
        car.setConvertible(Boolean.parseBoolean(scanner.nextLine()));

        car.describeCar();

    }
}
