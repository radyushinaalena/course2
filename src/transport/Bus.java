package transport;

public class Bus extends Transport<CategoryD> {
    CapacitySeats capacitySeats;

    public Bus(String brand, String model, double engineVolume, CategoryD driver, CapacitySeats capacitySeats) {
        super(brand, model, engineVolume, driver);
        this.capacitySeats = capacitySeats;
    }

    public enum CapacitySeats {
        PARTICULAR_SMALL(null, 10),
        SMALL(null, 25),
        AVERAGE(25, 50),
        BIG(50, 80),
        PARTICULAR_BIG(80, 120);
        private Integer lowerBound;
        private Integer upperBound;

        CapacitySeats(Integer lowerBound, Integer upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }

        public Integer getLowerBound() {
            return lowerBound;
        }

        public void setLowerBound(Integer lowerBound) {
            this.lowerBound = lowerBound;
        }

        public Integer getUpperBound() {
            return upperBound;
        }

        public void setUpperBound(Integer upperBound) {
            this.upperBound = upperBound;
        }

        @Override
        public String toString() {
            return " вместимость: " + (lowerBound == null ? "" : ("от " + lowerBound)) +
                    (upperBound == null ? "" : (" до " + upperBound));
        }
    }

    @Override
    public String toString() {
        return "Марка: " + getBrand() + ", модель: " + getModel() + ", объем двигателя: " +
                getEngineVolume() + " л" + " ," + capacitySeats;
    }

    @Override
    public void start() {
        System.out.println("Автобус " + getBrand() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Автобус " + getBrand() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " заехал на пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга автобуса " + getBrand());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автобуса " + getBrand());
    }

    @Override
    public void getType() {
        System.out.println(Type.valueOf("BUS"));
    }

    @Override
    public void printType() {
        System.out.println(capacitySeats == null ? "Данных по транспортному средству недостаточно" : capacitySeats);
    }
}
