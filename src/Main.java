import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car.Key car1 = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия", "АКП", "седан", "А777АА999", 5, true).new Key(true, true);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "АКП", "седан", "К555КК62", 5, true);
        Car car3 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", "МКП", "родстер", "Р111РР777", 2, false);
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", "МКП", "универсал", "Т444ТТ18", 5, true);
        Car car5 = new Car("", "", 0, "", 0, "", "", "", "", 0, false);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

    }
}
