package transport;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean winterTires;
    private Key key;

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission,
               String bodyType, String registrationNumber, int numberOfSeats, boolean winterTires,
               int maxSpeed, Key key) {
        super(brand, model, year, country, color, maxSpeed);


        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;

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
        this.winterTires = winterTires;
        setKey(key);
    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return (remoteEngineStart ? ", удаленный запуск двигателя" : ", без удаленного запуска двигателя")
                    + (keylessAccess ? ", бесключевой доступ" : ", без бесключевого доступа");
        }

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

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
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
        return super.toString() + ", объем двигателя: " + engineVolume +
                " литров, коробка передач: " + transmission + ", тип кузова: " + bodyType + ", регистрационный номер: " +
                registrationNumber + ", количество мест: " +
                numberOfSeats + (winterTires ? ", зимняя резина" : ", летняя резина") + key;
    }

}
