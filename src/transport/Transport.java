package transport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private T driver;
    private List<Mechanic> mechanicList;

    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }

    public void setMechanicList(List<Mechanic> mechanicList) {
        this.mechanicList = mechanicList;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public Transport(String brand, String model, double engineVolume, T driver, List<Mechanic> mechanicList) {
        this.mechanicList = mechanicList;
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;

        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;

        if (engineVolume <= 0) {
            engineVolume = 2.0;
        }
        this.engineVolume = engineVolume;
        setDriver(driver);
    }

    public abstract void start();

    public abstract void stop();

    public abstract void conclusionType();

    public abstract void printType();

    public abstract void passDiagnostics() throws TransportTypeException;

    public abstract void spendTransportSTO() throws TransportTypeException;

    @Override
    public String toString() {
        return "Марка: " + getBrand() + ", модель: " + getModel() + ", объем двигателя: " +
                getEngineVolume() + " л";
    }
}
