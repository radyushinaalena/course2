package transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        if (color == null || color.isEmpty()) {
            color = "белый";
        }
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 0) {
            maxSpeed = 120;
        }
        this.maxSpeed = maxSpeed;
    }

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;

        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;

        if (country == null || country.isEmpty()) {
            country = "default";
        }
        this.country = country;
        if (year <= 0) {
            year = 2000;
        }
        this.year = year;
        setColor(color);
        setMaxSpeed(maxSpeed);

    }

    @Override
    public String toString() {
        return "Марка: " + getBrand() + ", модель: " + getModel() + ", цвет: " +
                getColor() + ", год производства: " + getYear() + ", страна сборки: " + getCountry() +
                ", максимальная скорость передвижения: " + getMaxSpeed() + " км/ч";
    }
}
