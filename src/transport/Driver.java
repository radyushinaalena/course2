package transport;

import java.util.Objects;

public abstract class Driver {
    private String fullName;
    private boolean driversLicense;
    private int experience;

    public Driver(String fullName, boolean driversLicense, int experience) {
        this.fullName = fullName;
        this.driversLicense = driversLicense;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            fullName = "default";
        }
        this.fullName = fullName;
    }

    public boolean isDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(boolean driversLicense) {
        this.driversLicense = driversLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience < 0) {
            experience = 0;
        }
        this.experience = experience;
    }

    public abstract void start();

    public abstract void stop();

    public abstract void refuelCar();

    @Override
    public String toString() {
        return "Водитель: " + fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null ) return false;
        Driver driver = (Driver) o;
        return driversLicense == driver.driversLicense && experience == driver.experience && fullName.equals(driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, driversLicense, experience);
    }
}
