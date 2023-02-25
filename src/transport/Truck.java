package transport;

import java.util.List;

public class Truck extends Transport<CategoryC> {
   private Capacity capacity;
    public Truck(String brand, String model, double engineVolume, CategoryC driver, Capacity capacity, List<Mechanic> mechanic) {
        super(brand, model, engineVolume, driver, mechanic);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public enum Capacity {
        N1(null, 3.5F),
        N2(3.5F, 12F),
        N3(12F, null);
        private Float lowerBound;
        private Float upperBound;

        Capacity(Float lowerBound, Float upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }

        public Float getLowerBound() {
            return lowerBound;
        }

        public void setLowerBound(Float lowerBound) {
            this.lowerBound = lowerBound;
        }

        public Float getUpperBound() {
            return upperBound;
        }

        public void setUpperBound(Float upperBound) {
            this.upperBound = upperBound;
        }

        @Override
        public String toString() {
            return " грузоподъемность: " + (lowerBound==null?"":("от "+lowerBound)) +
                    (upperBound==null?"":(" до "+upperBound));
        }
    }
    @Override
    public String toString() {
        return "Марка: " + getBrand() + ", модель: " + getModel() + ", объем двигателя: " +
                getEngineVolume() + " л" + " ,"+ capacity;
    }

    @Override
    public void start() {
        System.out.println("Грузовой автомобиль " + getBrand() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Грузовой автомобиль " + getBrand() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовой автомобиль " + getBrand() + " заехал на пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга грузового автомобиля " + getBrand());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость грузового автомобиля " + getBrand());
    }
    @Override
    public void conclusionType(){
        System.out.println(Type.valueOf("TRUCK"));
    }
    @Override
    public void printType(){
        System.out.println(capacity == null ? "Данных по транспортному средству недостаточно" : capacity);
    }
    @Override
    public void passDiagnostics(){
        System.out.println("Диагностика грузового автомобиля");
    }

    @Override
    public void spendTransportSTO() {
        System.out.println("Автомобиль добавлен в очередь");
    }
}