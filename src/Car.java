public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    @Override
    public String toString() {
        return "Марка: " + brand + ", модель: " + model + ", объем двигателя: " + engineVolume +
                " литров, цвет: " + color + ", год производства: " + year + ", страна сборки: " + country;
    }
}
