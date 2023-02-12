package transport;

public class CategoryD extends Driver {

    public CategoryD(String fullName, boolean driversLicense, int experience) {
        super(fullName, driversLicense, experience);
    }

    @Override
    public void start() {
        System.out.println("Водитель " + getFullName() + " категории D начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель " + getFullName() + " категории D закончил движение");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель " + getFullName() + " категории D на заправке");
    }
}
