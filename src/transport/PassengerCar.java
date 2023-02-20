package transport;

public class PassengerCar extends Transport<CategoryB> {
    private Body body;


    public PassengerCar(String brand, String model, double engineVolume, CategoryB driver, Body body) {
        super(brand, model, engineVolume, driver);
        this.body = body;
    }

    public Body getBody() {
        return body;
    }

    public enum Body {
        SEDAN("седан"),
        HATCHBACK("хетчбэк"),
        COUPE("купе"),
        ESTATE("универсал"),
        SUV("внедорожник"),
        CROSSOVER("кроссовер"),
        PICKUP("пикап"),
        VAN("фургон"),
        MINIVAN("минивэн");

        private String bodyType;

        Body(String bodyType) {
            this.bodyType = bodyType;
        }

        public String getBodyType() {
            return bodyType;
        }

        public void setBodyType(String bodyType) {
            this.bodyType = bodyType;
        }

         @Override
         public String toString() {
             return " Тип кузова: " + getBodyType();
         }
     }
    @Override
    public String toString() {
        return "Марка: " + getBrand() + ", модель: " + getModel() + ", объем двигателя: " +
                getEngineVolume() + " л" + " ,"+ body;
    }
    @Override
    public void start() {
        System.out.println("Автомобиль " + getBrand() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль " + getBrand() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль " + getBrand() + " заехал на пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга автомобиля " + getBrand());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автомобиля " + getBrand());
    }
    @Override
    public void conclusionType(){
        System.out.println(Type.valueOf("CAR"));
    }
    @Override
    public void printType(){
        System.out.println(body == null ? "Данных по транспортному средству недостаточно" : body.getBodyType());
    }
    @Override
    public void passDiagnostics(){
        System.out.println("Диагностика легкового автомобиля");
    }

}
