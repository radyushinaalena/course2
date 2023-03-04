import transport.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CategoryB driver1 = new CategoryB("Маша", true, 5);
        CategoryC driver2 = new CategoryC("Даша", true, 12);
        CategoryD driver3 = new CategoryD("Саша", false, 10);
        Mechanic mechanic1 = new Mechanic("Иван Иванов", "AAA");
        Mechanic mechanic2 = new Mechanic("Петр Петров", "БББ");
        Mechanic mechanic3 = new Mechanic("Семен Семенов", "ВВВ");
        Mechanic mechanic4 = new Mechanic("Глеб Глебов", "ГГГ");
        List<Mechanic> mechanicListPassengerCar = new ArrayList<>();
        mechanicListPassengerCar.add(mechanic1);
        mechanicListPassengerCar.add(mechanic2);
        List<Mechanic> mechanicListTruck = new ArrayList<>();
        mechanicListTruck.add(mechanic3);
        mechanicListTruck.add(mechanic4);
        List<Mechanic> mechanicListBus = new ArrayList<>();
        mechanicListBus.add(mechanic1);
        mechanicListBus.add(mechanic4);
        // System.out.println(mechanicList);

        Transport<?>[] transports = {
                new PassengerCar("Lada", "Granta", 1.7, driver1, null, mechanicListPassengerCar),
                new PassengerCar("Audi", "A8 50 L TDI quattro", 3.0, driver1, PassengerCar.Body.HATCHBACK, mechanicListPassengerCar),
                new PassengerCar("BMW", "Z8", 3.0, driver1, PassengerCar.Body.ESTATE, mechanicListPassengerCar),
                new PassengerCar("Kia", "Sportage 4-го поколения", 2.4, driver1, PassengerCar.Body.CROSSOVER, mechanicListPassengerCar),

                new Truck("Белаз", "75710", 130, driver2, Truck.Capacity.N1, mechanicListTruck),
                new Truck("Камаз", "54901", 11, driver2, Truck.Capacity.N2, mechanicListTruck),
                new Truck("Газель", "NN", 3.4, driver2, Truck.Capacity.N2, mechanicListTruck),
                new Truck("Валдай", "Next", 2.8, driver2, Truck.Capacity.N3, mechanicListTruck),

                new Bus("Лаз", "695", 6.0, driver3, Bus.CapacitySeats.SMALL, mechanicListBus),
                new Bus("Лиаз", "4292", 4.5, driver3, Bus.CapacitySeats.AVERAGE, mechanicListBus),
                new Bus("Hyundai", "H350", 3.2, driver3, Bus.CapacitySeats.BIG, mechanicListBus),
                new Bus("ПАЗ", "3206", 4.6, driver3, Bus.CapacitySeats.PARTICULAR_BIG, mechanicListBus)
        };
        ServiceStation serviceStation = new ServiceStation();
        for (Transport<?> i : transports) {
            System.out.println(i);
            try {

                serviceStation.addCarToQueue(i);

                i.passDiagnostics();
            } catch (TransportTypeException e) {
                System.out.println(e.getLocalizedMessage());
            }

            System.out.println("водитель " + i.getDriver().getFullName() + " управляет автомобилем " + i.getBrand() + " и будет участвовать в заезде" + "\n" + i.getMechanicList());

        }
        List<Transport<?>> transportList = new ArrayList<>(Arrays.asList(transports));
        System.out.println("Очередь на СТО: " + serviceStation.getQueue());
        serviceStation.spendTechnicalInspection();
        System.out.println("Очередь на СТО: " + serviceStation.getQueue());


        Transport<?>[] transportsClone = transports.clone();
        for (Transport<?> i : transportsClone) {
            Map<Transport<?>, List<Mechanic>> carAndMechanics = new HashMap<>();
            carAndMechanics.put(i, i.getMechanicList());
            System.out.println(carAndMechanics);
        }

        Set<Driver> drivers = new HashSet<>();
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);

        Iterator<Driver> iterDrivers = drivers.iterator();
        while (iterDrivers.hasNext()) {
            System.out.println(iterDrivers.next());
        }


    }
}
