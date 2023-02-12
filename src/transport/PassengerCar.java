package transport;

public class PassengerCar extends Transport<CategoryB> {
    public PassengerCar(String brand, String model, double engineVolume, CategoryB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void start() {
        System.out.println("Автомобиль " + getBrand() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль " + getBrand() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль " + getBrand() + " заехал на пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга автомобиля " + getBrand());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автомобиля " + getBrand());
    }
}
