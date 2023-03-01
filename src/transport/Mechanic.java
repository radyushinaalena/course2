package transport;

public class Mechanic {
    String name;
    String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void performMaintenance() {
        System.out.println("ТО");
    }

    public void fixCar() {
        System.out.println("Ремонт");
    }

    @Override
    public String toString() {
        return "Механик: " + name +
                ", компания: " + company;
    }
}
