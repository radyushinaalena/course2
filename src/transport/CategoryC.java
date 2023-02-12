package transport;

public class CategoryC extends Driver {

    public CategoryC(String fullName, boolean driversLicense, int experience) {
        super(fullName, driversLicense, experience);
    }

    @Override
    public void start() {
        System.out.println("Водитель " + getFullName() + " категории C начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель " + getFullName() + " категории C закончил движение");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель " + getFullName() + " категории C на заправке");
    }
}
