import transport.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CategoryB driver1 = new CategoryB("ААА", true, 5);
        CategoryC driver2 = new CategoryC("БББ", true, 12);
        CategoryD driver3 = new CategoryD("ВВВ", false, 10);

        Transport<?>[] transports = {
                new PassengerCar("Lada", "Granta", 1.7, driver1, null),
                new PassengerCar("Audi", "A8 50 L TDI quattro", 3.0, driver1, PassengerCar.Body.HATCHBACK),
                new PassengerCar("BMW", "Z8", 3.0, driver1, PassengerCar.Body.ESTATE),
                new PassengerCar("Kia", "Sportage 4-го поколения", 2.4, driver1, PassengerCar.Body.CROSSOVER),

                new Truck("Белаз", "75710", 130, driver2, Truck.Capacity.N1),
                new Truck("Камаз", "54901", 11, driver2, Truck.Capacity.N2),
                new Truck("Газель", "NN", 3.4, driver2, Truck.Capacity.N2),
                new Truck("Валдай", "Next", 2.8, driver2, Truck.Capacity.N3),

                new Bus("Лаз", "695", 6.0, driver3, Bus.CapacitySeats.SMALL),
                new Bus("Лиаз", "4292", 4.5, driver3, Bus.CapacitySeats.AVERAGE),
                new Bus("Hyundai", "H350", 3.2, driver3, Bus.CapacitySeats.BIG),
                new Bus("ПАЗ", "3206", 4.6, driver3, Bus.CapacitySeats.PARTICULAR_BIG)
        };
        for (Transport<?> i : transports) {
            System.out.println(i);
            System.out.println("водитель " + i.getDriver().getFullName() + " управляет автомобилем " + i.getBrand() + " и будет участвовать в заезде");
        }
    }
}
