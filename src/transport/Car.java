package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean winterTires;

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission,
               String bodyType, String registrationNumber, int numberOfSeats, boolean winterTires) {
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

        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;

        if (color == null || color.isEmpty()) {
            color = "белый";
        }
        this.color = color;

        if (year <= 0) {
            year = 2000;
        }
        this.year = year;


        if (transmission == null || transmission.isEmpty()) {
            transmission = "default";
        }
        this.transmission = transmission;

        if (bodyType == null || bodyType.isEmpty()) {
            bodyType = "default";
        }
        this.bodyType = bodyType;

        if (registrationNumber == null || registrationNumber.isEmpty()) {
            registrationNumber = "default";
        }
        this.registrationNumber = registrationNumber;

        if (numberOfSeats <= 0) {
            numberOfSeats = 5;
        }
        this.numberOfSeats = numberOfSeats;
    }

    public class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        @Override
        public String toString() {
            return "Марка: " + brand + ", модель: " + model + ", объем двигателя: " + engineVolume +
                    " литров, цвет: " + color + ", год производства: " + year + ", страна сборки: " + country + ", коробка передач: " +
                    transmission + ", тип кузова: " + bodyType + ", регистрационный номер: " + registrationNumber + ", количество мест: " +
                    numberOfSeats + ", зимняя резина: " + winterTires + ", удаленный запуск двигателя: " + remoteEngineStart +
                    ", бесключевой доступ: " + keylessAccess;
        }

    }

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

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }


    public boolean changeTires(int month) {
        switch (month) {
            case 1:
            case 2:
            case 3:
            case 11:
            case 12:
                winterTires = true;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                winterTires = false;
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
        return winterTires;
    }

    @Override
    public String toString() {
        return "Марка: " + brand + ", модель: " + model + ", объем двигателя: " + engineVolume +
                " литров, цвет: " + color + ", год производства: " + year + ", страна сборки: " + country + ", коробка передач: " +
                transmission + ", тип кузова: " + bodyType + ", регистрационный номер: " + registrationNumber + ", количество мест: " +
                numberOfSeats + ", зимняя резина: " + winterTires;
    }

}
