package transport;

public class CategoryB extends Driver {

    public CategoryB(String fullName, boolean driversLicense, int experience) {
        super(fullName, driversLicense, experience);
    }

    @Override
    public void start() {
        System.out.println("Водитель " + getFullName() + " категории B начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель " + getFullName() + " категории B закончил движение");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель " + getFullName() + " категории B на заправке");
    }
}