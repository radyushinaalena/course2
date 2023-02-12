package transport;

public class Bus extends Transport<CategoryD> {
    public Bus(String brand, String model, double engineVolume, CategoryD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void start() {
        System.out.println("Автобус " + getBrand() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Автобус " + getBrand() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " заехал на пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга автобуса " + getBrand());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автобуса " + getBrand());
    }
}
